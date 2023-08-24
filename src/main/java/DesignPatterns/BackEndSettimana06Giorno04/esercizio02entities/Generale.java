package DesignPatterns.BackEndSettimana06Giorno04.esercizio02entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Generale extends Ufficiale {
	private String nome;
	private String cognome;
	private int stipendio = 5000;

	public Generale(String nome, String cognome) {

		this.nome = nome;
		this.cognome = cognome;

	}

	@Override
	public String toString() {
		return "Generale [nome=" + nome + ", cognome=" + cognome + ", stipendio=" + stipendio + "]";
	}

}
