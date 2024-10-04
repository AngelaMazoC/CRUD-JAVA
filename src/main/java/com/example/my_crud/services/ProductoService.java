package com.example.my_crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.my_crud.model.Producto;
import com.example.my_crud.repository.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository; // Inyectar el repositorio

    public void createProducto(Producto producto) {
        productoRepository.save(producto); // Guardar el producto en la base de datos
    }
}
