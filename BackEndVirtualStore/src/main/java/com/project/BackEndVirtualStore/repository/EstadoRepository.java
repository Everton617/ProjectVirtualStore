package com.project.BackEndVirtualStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.BackEndVirtualStore.entity.Estado;

public interface EstadoRepository extends JpaRepository<Estado,Long> {
    
}
