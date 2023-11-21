package com.empresa.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

		@Data
		@NoArgsConstructor
		@AllArgsConstructor
		@Entity
		@Table (name = "curso")
		public class Curso {
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private Long id;
			
			@NotNull
			@NotBlank
			private String nome;
			
			@NotNull
			@NotBlank
			private double cargaHorario;
			
			@NotNull
			@NotBlank
			private String conteudoProgramatico;
			
			@NotNull
			@NotBlank
			private double valor;
			
			@NotNull
			@NotBlank
			private String professor;
		}
