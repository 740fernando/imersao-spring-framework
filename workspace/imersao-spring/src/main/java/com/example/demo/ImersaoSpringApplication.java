package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.beans.versus.components.ConversonJson;
import com.example.demo.beans.versus.components.ViaCepResponse;
import com.google.gson.Gson;

@SpringBootApplication
public class ImersaoSpringApplication {

	public static void main(String[] args){
		SpringApplication.run(ImersaoSpringApplication.class, args);
		}

	@Bean
	public CommandLineRunner run(ConversonJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\": \"01001-000\",\"logradouro\":\"Praça da Sé\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dadps do CEP: " + response);
		};
	}
}
