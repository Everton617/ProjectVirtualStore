package com.project.BackEndVirtualStore.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.project.BackEndVirtualStore.entity.Produto;
import com.project.BackEndVirtualStore.entity.ProdutoImagens;
import com.project.BackEndVirtualStore.repository.ProdutoImagensRepository;
import com.project.BackEndVirtualStore.repository.ProdutoRepository;

@Service
public class ProdutoImagensService {

    @Autowired
    private ProdutoImagensRepository produtoImagensRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoImagens> buscarTodos() {
        return produtoImagensRepository.findAll();
    }
    
    public ProdutoImagens inserir(Long idProduto, MultipartFile file) {
        Produto produto = produtoRepository.findById(idProduto).get();
        ProdutoImagens objeto = new ProdutoImagens();

		try {
			if (!file.isEmpty()) {
				byte[] bytes = file.getBytes();
                String nomeImagem = String.valueOf(produto.getId()) + file.getOriginalFilename();
				Path caminho = Paths
						.get("C:/imagens/" +nomeImagem );
				Files.write(caminho, bytes);
                objeto.setNome(nomeImagem);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

        objeto.setProduto(produto);
        objeto.setDataCriacao(new Date());
        objeto = produtoImagensRepository.saveAndFlush(objeto);
        return objeto;
    }

    public ProdutoImagens alterar(ProdutoImagens objeto) {
        objeto.setDataAtualizacao(new Date());
        return produtoImagensRepository.saveAndFlush(objeto);
    }

    public void excluir(Long id) {
        ProdutoImagens objeto = produtoImagensRepository.findById(id).get();
        produtoImagensRepository.delete(objeto);
    }
}