package com.mx.ApiCrudProductos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.ApiCrudProductos.model.Productos;

//JpaRepository  -- Es una clase de Spring Data que contiene los metodos del CRUD, paginacion
public interface ProductosDao extends JpaRepository<Productos, Long>{
	
	
	// Metodo que se ejecuta bajo el resorte del repositorio
	public Productos findByNombre(String nombre);

}
