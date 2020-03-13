package com.tienda.app.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tienda.app.Producto;
import com.tienda.app.model.dao.ProductoDao;

public class ProductoServicesImpl implements ProductoService {

	@Autowired  // inicializa el dao(se conecta con producto. class)
	ProductoDao productoDao; 
	
	@Override
	public List<Producto> listarProductos() {
		
		return (List<Producto>) productoDao.findAll();
	}
	

}
