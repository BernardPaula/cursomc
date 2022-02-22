package com.bernardpaula.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bernardpaula.cursomc.domain.Pedido;
import com.bernardpaula.cursomc.repositories.PedidoRepository;
import com.bernardpaula.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedido;
	
	
	public Pedido buscar(Integer id) {
		
		Optional<Pedido> obj = pedido.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo" + Pedido.class.getName()));
	}

}
