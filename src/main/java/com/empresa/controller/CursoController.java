package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entities.Curso;
import com.empresa.services.CursoService;

	@RestController
	@RequestMapping("/curso")

	public class CursoController {
	    private final CursoService cursoService;

	    @Autowired
	    public CursoController(CursoService cursoService) {
	        this.cursoService = cursoService;
	    }

	    @PostMapping
	    public Curso createCurso(@RequestBody Curso curso) {
	        return cursoService.salvarCurso(curso);
	    }

	    @GetMapping("/{id}")
	    public Curso getCurso(@PathVariable Long id) {
	        return cursoService.getCursoById(id);
	    }

	    @GetMapping
	    public List<Curso> getAllProdutos() {
	        return cursoService.getAllCurso();
	    }

	    @DeleteMapping("/{id}")
	    public void deleteProduto(@PathVariable Long id) {
	        cursoService.deleteCurso(id);
	    }
	}