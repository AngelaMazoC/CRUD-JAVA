package com.example.my_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.my_crud.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
  
}
