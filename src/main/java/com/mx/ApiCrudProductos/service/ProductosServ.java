package com.mx.ApiCrudProductos.service;

import java.util.List;

import com.mx.ApiCrudProductos.model.Productos;

public interface ProductosServ {
	
	public List<Productos> listar();
	
	public void guardar (Productos producto);
	
	public Productos buscar (Long idP);
	
	public void editar (Productos pokemon);
	
	public void eliminar (Long idP);
	
	public Productos buscarXNombre(String nombre);
	

}
