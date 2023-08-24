package DesignPatterns.BackEndSettimana06Giorno04.esercizio02entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Maggiore extends Ufficiale {
	private String nome;
	private String cognome;
	private int stipendio = 2000;

	public Maggiore(String nome, String cognome) {

		this.nome = nome;
		this.cognome = cognome;

	}

	@Override
	public String toString() {
		return "Maggiore [nome=" + nome + ", cognome=" + cognome + ", stipendio=" + stipendio + "]";
	}

}