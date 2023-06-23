package com.victxl.tarefas.repository;

import org.springframework.data.repository.CrudRepository;

import com.victxl.tarefas.models.Tarefa;

public interface TarefaRepository extends CrudRepository<Tarefa, String> {
	Tarefa findByCodigoTarefa(long codigoTarefa);

}
