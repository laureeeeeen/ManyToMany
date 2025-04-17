package com.example.lauren.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lauren.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
