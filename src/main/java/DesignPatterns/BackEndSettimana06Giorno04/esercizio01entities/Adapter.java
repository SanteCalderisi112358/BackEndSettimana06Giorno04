package DesignPatterns.BackEndSettimana06Giorno04.esercizio01entities;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Adapter implements DataSource {
	private Info infoUtente;

	public Adapter(Info infoUtente) {
		this.infoUtente = infoUtente;
	}
	@Override
	public String getNomeCompleto() {

		return infoUtente.getNome() + " " + infoUtente.getCognome();
	}

	@Override
	public int getEta() {
		LocalDate dataNascita = infoUtente.getDataDiNascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate oggi = LocalDate.now();
		long eta = ChronoUnit.YEARS.between(dataNascita, oggi);
		return (int) eta;
	}

}
