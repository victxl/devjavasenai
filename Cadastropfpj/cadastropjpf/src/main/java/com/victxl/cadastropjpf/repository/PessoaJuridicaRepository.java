package com.victxl.cadastropjpf.repository;

import org.springframework.data.repository.CrudRepository;

import com.victxl.cadastropjpf.models.PessoaJuridica;

public interface PessoaJuridicaRepository extends CrudRepository<PessoaJuridica, String> {
	


	PessoaJuridica findByCodigoPJ(long codigoPJ);
	PessoaJuridica deleteByCodigoPJ(long codigoPJ);
	
}


