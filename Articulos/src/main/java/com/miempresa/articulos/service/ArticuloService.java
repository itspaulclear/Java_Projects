package com.miempresa.articulos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miempresa.articulos.entity.Articulo;
import com.miempresa.articulos.repository.IArticuloRepository;

@Service("articuloService")
public class ArticuloService implements IArticuloService{
	@Autowired
	private IArticuloRepository articuloRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Articulo> getAllArticulos() {
		return articuloRepository.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Page<Articulo> getArticulosByCategoria(String categoria, Pageable pageable) {
		return articuloRepository.findAllByCategoria(categoria, pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Articulo getArticuloById(Long id) {
		return articuloRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		articuloRepository.deleteById(id);
	}

	@Override
	@Transactional
	public void updateArticulos(Articulo articulo) {
		articuloRepository.save(articulo);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Articulo> listarPaginado(Pageable pageable) {
		return articuloRepository.findAll(pageable);
	}
}
