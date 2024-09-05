package com.mx.ApiCrudProductos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.ApiCrudProductos.dao.ProductosDao;
import com.mx.ApiCrudProductos.model.Productos;


@Service
public class ProductosImp implements ProductosServ{
	
	//Se utiliza la inyeccion de dependencias
	@Autowired  ///----permite tener un mejor control de los objetos que se inicializan
	ProductosDao dao;	
	

	@Transactional (readOnly = true)
	@Override
	public List<Productos> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	
	@Transactional    ////Verifica que todo este bien y realiza la operacion guarda
	@Override
	public void guardar(Productos producto) {
		// TODO Auto-generated method stub
		dao.save(producto);
		
	}

	@Transactional(readOnly = true)
	@Override
	public Productos buscar(Long idP) {
		// TODO Auto-generated method stub
		return dao.findById(idP).orElse(null);
	}
	

	@Transactional
	@Override
	public void editar(Productos producto) {
		// TODO Auto-generated method stub
		dao.save(producto);
	}

	@Transactional
	@Override
	public void eliminar(Long idP) {
		// TODO Auto-generated method stub
		dao.deleteById(idP);
	}

	@Transactional(readOnly = true)
	@Override
	public Productos buscarXNombre(String nombre) {
		// TODO Auto-generated method stub
		return dao.findByNombre(nombre);
	}


//////////////////////////////Buscar por Tipo sin usar resorte//////////////////////////////
	@Transactional
	@Override
	public Productos buscarXTipo(String tipo) {
		List<Productos> producto = dao.findAll();
		List<Productos> registrosenc = new ArrayList<Productos>();
		
		boolean bandera = false;
	
		for(Productos p:producto) {
			if(p.getTipo().equals(tipo)) {
				registrosenc.add(p);
				bandera = true;
				break;
			}
		}
		if(bandera==false) {
			System.out.println("No se tiene ese registro");
		}
		return dao.findByNombre(tipo);
		
	}


//////////////////////////////Buscar por nombre sin usar resorte//////////////////////////////
	@Transactional
	@Override
	public Productos buscarporNombre(String nombre) {
		List<Productos> producto = dao.findAll();
		List<Productos> registrosenc = new ArrayList<Productos>();
		
		boolean bandera = false;
	
		for(Productos p:producto) {
			if(p.getNombre().equals(nombre)) {
				registrosenc.add(p);
				bandera = true;
				break;
			}
		}
		if(bandera==false) {
			System.out.println("No se tiene ese registro");
		}
		return dao.findByNombre(nombre);
		
	}

//////////////////////////////Eliminar por nombre sin usar resorte//////////////////////////////
	@Transactional
	@Override
	public void eliminarporNombre(String nombre) {
		List<Productos> producto = dao.findAll();
		dao.deleteAll(producto);
		
		
	}
	
	
	
}
