package com.miempresa.articulos.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.miempresa.articulos.entity.Articulo;

public interface IArticuloService {
	List<Articulo> getAllArticulos();
	Page<Articulo> getArticulosByCategoria(String categoria, Pageable pageable);
	Articulo getArticuloById(Long id);
	void deleteById(Long id);
	void updateArticulos(Articulo articulo);
	Page<Articulo> listarPaginado(Pageable pageable);
}
