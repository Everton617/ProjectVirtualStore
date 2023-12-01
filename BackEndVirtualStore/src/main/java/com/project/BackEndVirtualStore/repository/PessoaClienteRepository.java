package com.project.BackEndVirtualStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.BackEndVirtualStore.entity.Pessoa;

public interface PessoaClienteRepository extends JpaRepository<Pessoa, Long> {
    
}
