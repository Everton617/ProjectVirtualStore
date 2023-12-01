package com.project.BackEndVirtualStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.BackEndVirtualStore.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
    
}
