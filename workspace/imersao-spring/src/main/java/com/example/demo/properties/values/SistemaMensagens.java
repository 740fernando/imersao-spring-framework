package com.example.demo.properties.values;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagens implements CommandLineRunner {

	@Value("${nome:Lauren}") // valor padrao : "value"
	private String nome;
	@Value("${email}")
	private String email = "teste@teste.com.br";
	@Value("${telefones}")
	private List<Long> telefones = new ArrayList<>(Arrays.asList(new Long[] {1123123123L}));

	@Override
	public void run(String... args) throws Exception {
		StringBuilder sb = new StringBuilder().append("Mensagem enviada por : ")
				.append(nome)
				.append("\nE-mail: ")
				.append(email)
				.append("\nCom telefones para contato: ")
				.append(telefones);
		System.out.println(sb.toString());
	}
}
