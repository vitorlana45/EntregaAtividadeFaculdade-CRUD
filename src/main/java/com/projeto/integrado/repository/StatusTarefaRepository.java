package com.projeto.integrado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.integrado.entity.StatusTarefa;

import java.util.Optional;

public interface StatusTarefaRepository extends JpaRepository<StatusTarefa, Integer> {
    Optional<StatusTarefa> findByStatusDescricao(String status);
}