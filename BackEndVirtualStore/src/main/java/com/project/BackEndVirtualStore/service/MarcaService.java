package com.project.BackEndVirtualStore.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.BackEndVirtualStore.entity.Marca;
import com.project.BackEndVirtualStore.repository.MarcaRepository;

@Service
public class MarcaService {
    
      @Autowired
    private MarcaRepository marcaRepository;

    public List<Marca> buscarTodos() {
        return marcaRepository.findAll();
    }

    public Marca inserir(Marca objeto) {
        objeto.setDataCriacao(new Date());
        Marca objetoNovo = marcaRepository.saveAndFlush(objeto);
        return objetoNovo;
    }

    public Marca alterar(Marca objeto) {
        objeto.setDataAtualizacao(new Date());
        return marcaRepository.saveAndFlush(objeto);
    }

    public void excluir(Long id) {
        Marca objeto = marcaRepository.findById(id).get();
        marcaRepository.delete(objeto);
    }
}
