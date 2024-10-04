package com.example.my_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.my_crud.model.Producto;
import com.example.my_crud.services.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService; 

    @PostMapping("/producto") // POST
    public void createProducto(@RequestBody Producto producto) {
        productoService.createProducto(producto);
    }
}
