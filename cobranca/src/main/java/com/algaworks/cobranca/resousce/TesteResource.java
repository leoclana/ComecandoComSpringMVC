package com.algaworks.cobranca.resousce;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.cobranca.model.StatusTitulo;
import com.algaworks.cobranca.model.Titulo;

@RestController
@RequestMapping("/teste")
public class TesteResource {

	//@GetMapping("/texto")
	public String requestTexto() {
		return "teste lalala 2";
	}
	
	//@GetMapping
	public ResponseEntity<Titulo> requestJSON() {
		ResponseEntity<Titulo> retorno;
		
		Titulo titulo = new Titulo();
		titulo.setDescricao("CASA da Mâe Joana");
		titulo.setStatus(StatusTitulo.PENDENTE);
		titulo.setDataVencimento(new Date());
		titulo.setValor(BigDecimal.valueOf(123L));
		
		//retorno = ( titulo != null ? ResponseEntity.ok(titulo) : ResponseEntity.noContent().build());
		retorno = ( titulo != null ? ResponseEntity.ok(titulo) : null);
		
		return retorno;
	}
	
}
