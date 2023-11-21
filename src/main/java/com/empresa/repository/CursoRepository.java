package com.empresa.repository;
	
import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	}
