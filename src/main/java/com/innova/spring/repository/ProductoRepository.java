package com.innova.spring.repository;

import com.innova.spring.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends MongoRepository<Producto, String> {
    // Puedes definir métodos personalizados si es necesario
}
