package com.example.demo.beans.versus.components.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;

@Configuration
public class BeansFactory {

	@Bean
	public Gson gson() {
		return new Gson();
	}
}
/**
Bean - Utilizar sempre que não tiver acesso ao código fonte.
Component - Utilizar sempre que tiver acesso código fonte.

*/