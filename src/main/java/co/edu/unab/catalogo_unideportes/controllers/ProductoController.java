package co.edu.unab.catalogo_unideportes.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.catalogo_unideportes.models.ProductoModel;
import co.edu.unab.catalogo_unideportes.services.ProductoService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("/producto")
public class ProductoController {
    

    @Autowired
    ProductoService productoService;

    @GetMapping
    public ArrayList<ProductoModel>obtenerListaProductos(){
        return productoService.obtenerProductos();
    }

    @PostMapping
    public ProductoModel guardarProductoNuevo(@RequestBody ProductoModel producto){
        return productoService.guardarProducto(producto);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarProducto(@PathVariable("id") String id){
        if(productoService.eliminarProducto(id)){
            return "Se eliminó el producto con Id"+id;
        }else{
            return "No existe el producto con el Id"+id;
        }
    }

    @GetMapping(path = "/categoria/{categoria}")
    public ArrayList<ProductoModel> obtenerProductoPorCategoria(@PathVariable("categoria") String categoria){
        return productoService.obtenerPorCategoria(categoria);
    }

    @GetMapping(path = "/{id}")
    public Optional<ProductoModel> obtenerProductoPorId(@PathVariable("id") String id){
        return productoService.obtenerPorId(id);
    }

    @GetMapping(path = "/nombre/{nombre}")
    public ArrayList<ProductoModel> obtenerProductoPorNombre(@PathVariable("nombre") String nombre){
        return productoService.obtenerPorNombre(nombre);
    }

    @GetMapping(path = "/cantidad/{cantidad}")
    public ArrayList<ProductoModel> obtenerProductoPorCantidad(@PathVariable("cantidad") Long cantidad){
        return productoService.obtenerPorCantidad(cantidad);
    }

}
