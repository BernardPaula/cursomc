package com.bernardpaula.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bernardpaula.cursomc.domain.Categoria;

@RestController                              //definiu como controlador rest
@RequestMapping(value = "/categorias")       //mapeou o end poit
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)   //executa este metodo
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}

	
}


