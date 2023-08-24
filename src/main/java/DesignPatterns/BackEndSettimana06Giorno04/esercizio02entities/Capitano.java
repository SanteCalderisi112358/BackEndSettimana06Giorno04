package DesignPatterns.BackEndSettimana06Giorno04.esercizio02entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Capitano extends Ufficiale {
	private String nome;
	private String cognome;
	private int stipendio = 1000;

	public Capitano(String nome, String cognome) {

		this.nome = nome;
		this.cognome = cognome;

	}

	@Override
	public String toString() {
		return "Capitano [nome=" + nome + ", cognome=" + cognome + ", stipendio=" + stipendio + "]";
	}

}
