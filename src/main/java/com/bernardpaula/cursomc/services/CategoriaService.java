package com.bernardpaula.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bernardpaula.cursomc.domain.Categoria;
import com.bernardpaula.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired				//A dependência será instanciada automaticamente
	private CategoriaRepository repo;      // dependência declarada      // Criei o obj repo
	
	    //    \/ Tipo de dado que esta operação irá retornar
	public Categoria buscar(Integer Id) {
		Optional<Categoria> obj = repo.findById(Id);
		return obj.orElse(null);
	} 
	
	
	
	/*
	@Service
	
	@Autowired    //instancia altomaticamente
	private CategoriaRepository repo;   //declarando um atributo/dependêcia/  importar CategoriaRepository
	
	//metodo para poder buscar no banco dados da categoria por meio do repositório
	public Categoria buscar(Integer Id) {
	Optional<Categoria> obj =  repo.findById(Id);
	return obj.orElse(null);
	}
	*/


}
