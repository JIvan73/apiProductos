package com.mx.ApiCrudProductos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mx.ApiCrudProductos.model.Productos;
import com.mx.ApiCrudProductos.service.ProductosImp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(path = "ProductosWs")
@CrossOrigin

public class ProductosWs {
	
	@Autowired
	ProductosImp imp;
	
	
	///Peticion GET para listar los registros
	// http://localhost:9000/ProductosWs/listar
	@GetMapping(path = "listar")
	public List<Productos> listar(){
		return imp.listar();
	}
	
	
	//http://localhost:9000/ProductosWs/guardar
	@PostMapping(path = "guardar")
	public void guardar(@RequestBody Productos producto) {
		imp.guardar(producto);
	
	}
		
	//http://localhost:9000/ProductosWs/buscar
	@PostMapping(path = "buscar")
	public Productos buscar(@RequestBody Productos producto) {
		return imp.buscar(producto.getIdP());
	}
	
	
	
	//http://localhost:9000/ProductosWs/editar
	@PostMapping(path = "editar")
	public void editar(@RequestBody Productos producto) {
		imp.editar(producto);
	}
	
	//http://localhost:9000/ProductosWs/eliminar
	@PostMapping(path = "eliminar")
	public void eliminar (@RequestBody Productos producto) {
		imp.eliminar(producto.getIdP());
	}
	
	
	//Buscar por nombre
	//http://localhost:9000/ProductosWs/buscarNombre
	@PostMapping(path = "buscarNombre")
	public Productos buscarNombre(@RequestBody Productos producto) {
		Productos productoEnco = imp.buscarXNombre(producto.getNombre());
		return productoEnco;
	}
	
	
	//Buscar por tipo///////////////////////////////////////////////////////////////////////////
	// http://localhost:9000/ProductosWs/buscarTipo
	@PostMapping(path = "buscarTipo")
	public Productos buscarTipo(@RequestBody Productos producto) {
		Productos productoEnco = imp.buscarXTipo(producto.getNombre());
		return productoEnco;
	}
	
	
	
	
	//Buscar por nombre sin usar el resorte///////////////////////////////////////////////////
	//http://localhost:9000/ProductosWs/buscarporNombre
	@PostMapping(path = "buscarporNombre")
	public Productos buscarporNombre(@RequestBody Productos producto) {
		Productos productoEnco = imp.buscarXTipo(producto.getNombre());
		return productoEnco;
	}
	
	
	
	
	
	
	//Eliminar por nombre sin usar el resorte/////////////////////////////////////////////////
	//http://localhost:9000/ProductosWs/eliminarporNombre
	@PostMapping(path = "eliminarporNombre")
	public void eliminarporNombre (@RequestBody Productos producto) {
		imp.eliminarporNombre(producto.getNombre());
	}
	

}
