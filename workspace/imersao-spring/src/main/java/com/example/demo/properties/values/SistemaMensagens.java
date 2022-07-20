package com.example.demo.properties.values;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.configuration.properties.Remetente;

@Component
public class SistemaMensagens implements CommandLineRunner {
	@Autowired
	private Remetente remetente;
	@Override
	public void run(String... args) throws Exception {
		StringBuilder sb = new StringBuilder().append("Mensagem enviada por : ")
				.append(remetente.getNome())
				.append("\nE-mail: ")
				.append(remetente.getEmail())
				.append("\nCom telefones para contato: ")
				.append(remetente.getTelefones());
		System.out.println(sb.toString());
	}
}
