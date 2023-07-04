package com.victxl.cadastropjpf.repository;

import org.springframework.data.repository.CrudRepository;

import com.victxl.cadastropjpf.models.PessoaFisica;

public interface PessoaFisicaRepository extends CrudRepository<PessoaFisica, String> {
	
	
	PessoaFisica findByCodigoPF(long codigoPF);
	PessoaFisica deleteByCodigoPF(long codigoPF);
	
}
