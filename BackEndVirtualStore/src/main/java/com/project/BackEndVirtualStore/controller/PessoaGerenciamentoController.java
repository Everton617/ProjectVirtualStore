package com.project.BackEndVirtualStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.BackEndVirtualStore.entity.Pessoa;
import com.project.BackEndVirtualStore.service.PessoaGerenciamentoService;

@RestController
@RequestMapping("/api/pessoa-gerenciamento")
@CrossOrigin
public class PessoaGerenciamentoController {
    
    @Autowired
    private PessoaGerenciamentoService pessoaGerenciamentoService;


    @PostMapping("/senha-codigo")
    public String recuperarCodigo(@RequestBody Pessoa pessoa){
       return pessoaGerenciamentoService.solicitarCodigo(pessoa.getEmail());
    }

    @PostMapping("/senha-alterar")
    public String alterarSenha(@RequestBody Pessoa pessoa){
       return pessoaGerenciamentoService.alterarSenha(pessoa);
    }


    }
