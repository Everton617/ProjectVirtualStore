package com.project.BackEndVirtualStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.BackEndVirtualStore.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
