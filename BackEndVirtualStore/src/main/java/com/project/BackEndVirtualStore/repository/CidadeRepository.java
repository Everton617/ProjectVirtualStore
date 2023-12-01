package com.project.BackEndVirtualStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.BackEndVirtualStore.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade,Long> {
    
}
