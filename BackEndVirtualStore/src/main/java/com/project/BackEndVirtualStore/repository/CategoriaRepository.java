package com.project.BackEndVirtualStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.BackEndVirtualStore.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
    
}
