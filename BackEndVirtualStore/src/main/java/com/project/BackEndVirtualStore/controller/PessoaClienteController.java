package com.project.BackEndVirtualStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.BackEndVirtualStore.dto.PessoaClienteRequestDTO;
import com.project.BackEndVirtualStore.entity.Pessoa;
import com.project.BackEndVirtualStore.service.PessoaClienteService;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin
public class PessoaClienteController {
    
    @Autowired
    private PessoaClienteService pessoaService;

    @PostMapping("/")
    public Pessoa inserir(@RequestBody PessoaClienteRequestDTO pessoaClienteRequestDTO){
        return pessoaService.registrar(pessoaClienteRequestDTO);
    }

}
