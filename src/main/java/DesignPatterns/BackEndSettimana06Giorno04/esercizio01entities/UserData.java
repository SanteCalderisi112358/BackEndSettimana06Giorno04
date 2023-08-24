package DesignPatterns.BackEndSettimana06Giorno04.esercizio01entities;

import lombok.Getter;

@Getter
public class UserData {
	private String nomeCompleto;
	private int eta;

	public void getData(DataSource ds) {
		nomeCompleto = ds.getNomeCompleto();
		eta = ds.getEta();
	}
}
