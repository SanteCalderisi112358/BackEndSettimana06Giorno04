package DesignPatterns.BackEndSettimana06Giorno04.esercizio02entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tenente extends Ufficiale {
	private String nome;
	private String cognome;
	private int stipendio = 3000;

	public Tenente(String nome, String cognome) {

		this.nome = nome;
		this.cognome = cognome;

	}

	@Override
	public String toString() {
		return "Tenente [nome=" + nome + ", cognome=" + cognome + ", stipendio=" + stipendio + "]";
	}

}
