package com.project.BackEndVirtualStore.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.BackEndVirtualStore.entity.Pessoa;
import com.project.BackEndVirtualStore.repository.PessoaRepository;



@Service
public class PessoaService {
    
    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> buscarTodos(){
        return pessoaRepository.findAll();
    }

    public Pessoa inserir(Pessoa obj){
        obj.setDataCriacao(new Date());
        Pessoa pessoaNovo = pessoaRepository.saveAndFlush(obj);
        return pessoaNovo;
    }

    public Pessoa alterar(Pessoa obj){
        obj.setDataAtualizacao(new Date());
        return pessoaRepository.saveAndFlush(obj);
    }

    public void excluir(Long id){
        Pessoa obj = pessoaRepository.findById(id).get();
        pessoaRepository.delete(obj);
    }
}
