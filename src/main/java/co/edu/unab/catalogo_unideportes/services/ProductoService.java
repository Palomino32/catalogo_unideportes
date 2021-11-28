package co.edu.unab.catalogo_unideportes.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unab.catalogo_unideportes.models.ProductoModel;
import co.edu.unab.catalogo_unideportes.repositories.ProductoRepository;

@Service
public class ProductoService {
    
    @Autowired
    ProductoRepository productoRepository;

    public ArrayList<ProductoModel> obtenerProductos(){
        return (ArrayList<ProductoModel>) productoRepository.findAll();
    }

    public ProductoModel guardarProducto(ProductoModel producto){
        return productoRepository.save(producto);
    }

    public boolean eliminarProducto(String id){
        if(productoRepository.existsById(id)){
            productoRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<ProductoModel> obtenerPorCategoria(String categoria){
        return productoRepository.findByCategoria(categoria);
    }

    public Optional<ProductoModel> obtenerPorId(String id){
        return productoRepository.findById(id);
    }

    public ArrayList<ProductoModel> obtenerPorNombre(String nombre){
        return productoRepository.findByNombre(nombre);
    }

    public ArrayList<ProductoModel> obtenerPorCantidad(Long cantidad){
        return productoRepository.findByCantidadLessThanEqual(cantidad);
    }

}
