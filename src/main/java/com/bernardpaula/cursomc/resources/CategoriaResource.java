package com.bernardpaula.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bernardpaula.cursomc.domain.Categoria;
import com.bernardpaula.cursomc.repositories.CategoriaRepository;
import com.bernardpaula.cursomc.services.CategoriaService;

@RestController                                     //definiu como controlador rest
@RequestMapping(value = "/categorias")             // mapeou o end poit
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)    //id acrescentado no endpoint /executa este metodo
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}	
		
	

	
	
}


