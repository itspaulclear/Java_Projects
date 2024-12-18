package com.miempresa.articulos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.miempresa.articulos.entity.Articulo;
import com.miempresa.articulos.paginator.PageRender;
import com.miempresa.articulos.service.IArticuloService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/articulos")
public class ArticuloController {
	@Autowired
	private IArticuloService articuloService;
	
	@GetMapping("/listado")
	public String lista(@RequestParam(defaultValue = "0") int page, Model model) {
		Pageable pageRequest = PageRequest.of(page, 5);
		Page<Articulo> ListaArticulos = articuloService.listarPaginado(pageRequest);
		PageRender<Articulo> pageRender = new PageRender<>("/articulos/listado", ListaArticulos);
		model.addAttribute("cabecera", "Selección de artículos");
		model.addAttribute("titulo", "Esta es la selección de artículos: ");
		model.addAttribute("ListaArticulos", ListaArticulos);
		model.addAttribute("page", pageRender);
		model.addAttribute("tipoListado", "listado");
		return "articulo/lista";
	}
	
	@GetMapping("/listado/id/{id}")
	public String listarElementosPorId(Model model, @PathVariable Long id) {
		Articulo articulo = articuloService.getArticuloById(id);
		model.addAttribute("cabecera", "Elemento individual");
		model.addAttribute("articulo", articulo);
		return "articulo/individual";
	}
	
	@GetMapping("/listado/categoria/{categoria}")
	public String listarElementosPorCategoria(
	        @RequestParam(defaultValue = "0") int page,
	        @PathVariable String categoria,
	        Model model) {
	    Pageable pageRequest = PageRequest.of(page, 5);
	    Page<Articulo> ListaArticulos = articuloService.getArticulosByCategoria(categoria, pageRequest);
	    PageRender<Articulo> pageRender = new PageRender<>("/articulos/listado/categoria/" + categoria, ListaArticulos);
	    model.addAttribute("cabecera", "Listado de " + categoria);
	    model.addAttribute("titulo", "Selección de elementos de la categoría " + categoria);
	    model.addAttribute("ListaArticulos", ListaArticulos);
	    model.addAttribute("page", pageRender);
	    model.addAttribute("tipoListado", "categoria");
	    return "articulo/lista";
	}

	@GetMapping("/form/{id}")
	public String formPorId(Model model, @PathVariable Long id) {
		model.addAttribute("cabecera", "Elemento individual");
		model.addAttribute("articulo", articuloService.getArticuloById(id));
		return "articulo/form";
	}
	
	@GetMapping("/borrar/{id}")
	public String deleteById(@PathVariable Long id, RedirectAttributes flash) {
		articuloService.deleteById(id);
		flash.addFlashAttribute("warning", "Artículo eliminado con éxito");
		return "redirect:/articulos/listado";
	}
	
	@PostMapping("/form")
	public String form(@Valid Articulo articulo, BindingResult result, Model model, RedirectAttributes flash) {
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Información de artículo");
			model.addAttribute("texto", "Esta es la información correspondiente al artículo");
			model.addAttribute("articulo", articulo);
			return "articulo/form";
		}
		articuloService.updateArticulos(articulo);
		flash.addFlashAttribute("success", "Cambios realizados con éxito");
		return "redirect:/articulos/listado";
	}
	
	@GetMapping("/nuevo")
	public String nuevoCliente(Model model) {
		model.addAttribute("cabecera", "Nuevo artículo");
		model.addAttribute("titulo", "Añadiendo un nuevo artículo: ");
		model.addAttribute("articulo", new Articulo());
		return "articulo/form";
	}
	
}
