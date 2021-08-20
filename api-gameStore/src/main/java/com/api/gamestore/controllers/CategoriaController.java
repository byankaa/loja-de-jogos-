package com.api.gamestore.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.gamestore.models.CategoriaModel;
import com.api.gamestore.repositories.CategoriaRepository;


@RestController
@RequestMapping(value = "/api/v1/categoria")
@CrossOrigin("*")
public class CategoriaController {

	@Autowired
	CategoriaRepository categoriaRepository;
	
	@PostMapping
	public ResponseEntity<CategoriaModel> post (@RequestBody @Valid CategoriaModel categoriaModel) {
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoriaModel));
	}
	
	@GetMapping(value = "/findAll")
	public ResponseEntity<List<CategoriaModel>> findAllCategoria() {
		return ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.findAll());
	}
}
