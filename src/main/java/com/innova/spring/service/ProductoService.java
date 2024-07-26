package com.innova.spring.service;

import com.innova.spring.Producto;
import com.innova.spring.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    public Optional<Producto> obtenerProductoPorId(String id) {
        return productoRepository.findById(id);
    }

    public void eliminarProducto(String id) {
        productoRepository.deleteById(id);
    }
}