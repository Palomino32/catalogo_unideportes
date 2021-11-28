package co.edu.unab.catalogo_unideportes.models;

import org.springframework.data.annotation.Id;

public class ProductoModel {
    
    @Id
    private String id;
    private String categoria;
    private String nombre;
    private String descripcion;
    private float precio;
    private boolean disponible;
    private Long cantidad;
    
    public ProductoModel() {
    }
    public ProductoModel(String id, String categoria, String nombre, String descripcion, float precio,
            boolean disponible, Long cantidad) {
        this.id = id;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponible = disponible;
        this.cantidad = cantidad;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public Long getCantidad() {
        return cantidad;
    }
    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    

}
