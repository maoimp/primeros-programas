package com.tienda.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.app.Producto;
import com.tienda.app.model.service.ProductoService;

@RestController
public class ProductoController {
	@Autowired
	ProductoService productoService;

	@GetMapping("/productos")
	public List<Producto> listar() {
		return productoService.listarProductos();
	}

}
