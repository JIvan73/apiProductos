package com.mx.ApiCrudProductos.service;

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

	
	//@Transactional
	//@Override
	//public Productos buscarXTipo(String)
	
	// public  sdfghjs (String tipo)
	///////trabajar sin resorte	
	///List<Productos> producto = dao,findAll();
	///List<Productos> registrosenc = newArraylist<>();
	
	////ciclo for(p:registros){
	
	//if(p.geNombre.equi(tipo)){
	//nuevalista.add(p);

	//}
	
	//}  finAll
	//condicion
	
}
