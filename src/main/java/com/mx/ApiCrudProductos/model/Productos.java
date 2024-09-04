package com.mx.ApiCrudProductos.model;

import java.sql.Date;

import com.mx.ApiCrudProductos.model.Productos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//Estereotipos --dependencias a utilizar
@Entity
@Table(name="PRODUCTOS2")
@NoArgsConstructor  //Constructor vacio
@AllArgsConstructor //con Argumentos
@ToString			//Metodo toString
@Data				//almacena diferentes parametros incluyendo los setters y getters

public class Productos {
	
	
	/*
	 CREATE TABLE PRODUCTOS2(
ID NUMBER PRIMARY KEY,
NOMBRE VARCHAR2(80) NOT NULL,
PRECIO NUMBER NOT NULL,
TIPO VARCHAR2(70) NOT NULL,
CADUCIDAD DATE,
EXISTENCIA NUMBER
);
	 */
	
	
	///Mapear los campos de la tabla
		@Id   //Siempre se coloca  ---- para indicar que tenemosnuestra llave primaria
		@Column(name = "ID", columnDefinition = "NUMBER", nullable = false)
		private Long idP;
		@Column(name="NOMBRE", columnDefinition="VARCHAR(80)", nullable=false)
		private String nombre;
		@Column(name="PRECIO", columnDefinition="NUMBER", nullable=false)
		private Long precio;
		@Column(name="TIPO", columnDefinition="VARCHAR(70)", nullable=false)
		private String tipo;
		@Column(name="CADUCIDAD", columnDefinition="DATE", nullable=false)
		private Date caducidad;
		@Column(name="EXISTENCIA", columnDefinition="NUMBER", nullable=false)
		private Long existencia;
		
		
		
		
		

}
