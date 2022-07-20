package com.example.demo.configuration.properties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "remetentes")
public class Remetente {
	@Value("${remententes.nome:Lauren}") // valor padrao : "value"
	private String nome;
	@Value("${remententes.email}")
	private String email = "teste@teste.com.br";
	@Value("${remententes.telefones}")
	private List<Long> telefones = new ArrayList<>(Arrays.asList(new Long[] {1123123123L}));

}
