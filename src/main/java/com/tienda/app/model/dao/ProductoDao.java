package com.tienda.app.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.tienda.app.Producto;

public interface ProductoDao extends CrudRepository<Producto,Long> {
	
	
}
