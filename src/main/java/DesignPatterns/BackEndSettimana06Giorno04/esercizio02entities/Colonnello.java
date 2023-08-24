package DesignPatterns.BackEndSettimana06Giorno04.esercizio02entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Colonnello extends Ufficiale {
	private String nome;
	private String cognome;
	private int stipendio = 4000;

	public Colonnello(String nome, String cognome) {

		this.nome = nome;
		this.cognome = cognome;

	}

	@Override
	public String toString() {
		return "Colonnello [nome=" + nome + ", cognome=" + cognome + ", stipendio=" + stipendio + "]";
	}

}
