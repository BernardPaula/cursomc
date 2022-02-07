package com.bernardpaula.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController                              //definiu como controlador rest
@RequestMapping(value = "/categorias")       //mapeou o end poit
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)   //executa este metodo
	public String listar() {
		return "REST está funcionando!";
	}

}


