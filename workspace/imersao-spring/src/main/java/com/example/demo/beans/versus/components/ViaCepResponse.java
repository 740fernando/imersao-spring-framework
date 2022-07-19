package com.example.demo.beans.versus.components;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ViaCepResponse {
	private String cep;
	private String logradouro;
	private String localidade;
}
