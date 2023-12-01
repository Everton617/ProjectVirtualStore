package com.project.BackEndVirtualStore.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.BackEndVirtualStore.entity.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {
   
    List<Permissao> findByNome(String nome);
}
