package DesignPatterns.BackEndSettimana06Giorno04;

import java.util.Locale;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import DesignPatterns.BackEndSettimana06Giorno04.esercizio01entities.Adapter;
import DesignPatterns.BackEndSettimana06Giorno04.esercizio01entities.Info;
import DesignPatterns.BackEndSettimana06Giorno04.esercizio01entities.UserData;

@Component
public class Esercizio01Runner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Faker f = new Faker(Locale.ITALIAN);

		for (int i = 0; i < 10; i++) {
			Info infoUtente = new Info();
			infoUtente.setNome(f.name().firstName());
			infoUtente.setCognome(f.name().lastName());
			infoUtente.setDataDiNascita(f.date().birthday());

			Adapter adapter = new Adapter(infoUtente);
			UserData userData = new UserData();


			userData.getData(adapter);

			System.err.println("(INFO) Nome Completo: " + adapter.getNomeCompleto());
			System.err.println("(INFO) Data di Nascita: " + adapter.getEta());
			System.err.println("(USER DATA) Nome Completo: " + userData.getNomeCompleto());
			System.err.println("(USER DATA) Data di Nascita: " + userData.getEta());
			System.err.println("**********");
		}
	}


}
