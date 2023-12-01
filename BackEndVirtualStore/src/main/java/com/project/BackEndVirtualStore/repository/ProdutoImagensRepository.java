package com.project.BackEndVirtualStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.BackEndVirtualStore.entity.ProdutoImagens;

public interface ProdutoImagensRepository extends JpaRepository<ProdutoImagens,Long> {
}
