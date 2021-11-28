package co.edu.unab.catalogo_unideportes.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unab.catalogo_unideportes.models.ProductoModel;

public interface ProductoRepository extends MongoRepository<ProductoModel, String>{
    
    ArrayList<ProductoModel> findByCategoria (String categoria);

    ArrayList<ProductoModel> findByNombre (String nombre);

    ArrayList<ProductoModel>findByCantidadLessThanEqual(Long cantidad);

}
