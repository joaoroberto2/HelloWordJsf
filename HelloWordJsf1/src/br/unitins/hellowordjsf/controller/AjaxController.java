package br.unitins.hellowordjsf.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class AjaxController  implements Serializable{
	private static final long serialVersionUID = 6338093224225471625L;
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimirConsole() {
		System.out.println("imprimir no console");
	}

}
