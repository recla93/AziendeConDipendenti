package com.generation.aziendecondipendenti;

import com.generation.aziendecondipendenti.model.dao.AziendaDao;
import com.generation.aziendecondipendenti.model.dao.DipendenteDao;
import com.generation.aziendecondipendenti.model.dto.AziendaSummaryDto;
import com.generation.aziendecondipendenti.model.entities.Azienda;
import com.generation.aziendecondipendenti.model.entities.Dipendente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AziendeConDipendentiApplicationTests
{

	@Autowired
	private AziendaDao aziendaDao;

	@Autowired
	private DipendenteDao dipendenteDao;

	@Test
	public void inserisciAziendeConDipendenti() {
		// Azienda 1 - Tech Solutions SRL
		Azienda azienda1 = new Azienda();
		azienda1.setRagioneSociale("Tech Solutions SRL");
		azienda1.setIndirizzo("Via Roma 123, Milano");
		azienda1.setFatturato(5000000);

		azienda1.getDipendenti().add(creaDipendente("Marco", "Bianchi", "Software Engineer", 32000, "marco.bianchi@techsolutions.it", azienda1));
		azienda1.getDipendenti().add(creaDipendente("Sara", "Neri", "UI/UX Designer", 30000, "sara.neri@techsolutions.it", azienda1));
		azienda1.getDipendenti().add(creaDipendente("Luca", "Verdi", "Backend Developer", 34000, "luca.verdi@techsolutions.it", azienda1));
		azienda1.getDipendenti().add(creaDipendente("Chiara", "Moretti", "Frontend Developer", 33000, "chiara.moretti@techsolutions.it", azienda1));
		azienda1.getDipendenti().add(creaDipendente("Alessandro", "Galli", "DevOps Engineer", 36000, "alessandro.galli@techsolutions.it", azienda1));

		aziendaDao.save(azienda1);

		// Azienda 2 - Green Energy SPA
		Azienda azienda2 = new Azienda();
		azienda2.setRagioneSociale("Green Energy SPA");
		azienda2.setIndirizzo("Via Verdi 45, Bologna");
		azienda2.setFatturato(12000000);

		azienda2.getDipendenti().add(creaDipendente("Elisa", "Conti", "Project Manager", 45000, "elisa.conti@greenenergy.it", azienda2));
		azienda2.getDipendenti().add(creaDipendente("Davide", "Ferri", "Energy Consultant", 42000, "davide.ferri@greenenergy.it", azienda2));
		azienda2.getDipendenti().add(creaDipendente("Martina", "Russo", "Sales Specialist", 40000, "martina.russo@greenenergy.it", azienda2));
		azienda2.getDipendenti().add(creaDipendente("Simone", "Lombardi", "Field Technician", 38000, "simone.lombardi@greenenergy.it", azienda2));
		azienda2.getDipendenti().add(creaDipendente("Giulia", "Barbieri", "Customer Support", 37000, "giulia.barbieri@greenenergy.it", azienda2));

		aziendaDao.save(azienda2);

		// Azienda 3 - Food & Co SRL
		Azienda azienda3 = new Azienda();
		azienda3.setRagioneSociale("Food & Co SRL");
		azienda3.setIndirizzo("Piazza Duomo 10, Firenze");
		azienda3.setFatturato(3500000);

		azienda3.getDipendenti().add(creaDipendente("Francesco", "Costa", "Sales Manager", 31000, "francesco.costa@foodco.it", azienda3));
		azienda3.getDipendenti().add(creaDipendente("Valentina", "Marini", "Marketing Specialist", 29500, "valentina.marini@foodco.it", azienda3));
		azienda3.getDipendenti().add(creaDipendente("Andrea", "Ricci", "Logistics Coordinator", 29000, "andrea.ricci@foodco.it", azienda3));
		azienda3.getDipendenti().add(creaDipendente("Serena", "Romano", "Quality Manager", 30000, "serena.romano@foodco.it", azienda3));
		azienda3.getDipendenti().add(creaDipendente("Matteo", "Grassi", "Warehouse Supervisor", 28000, "matteo.grassi@foodco.it", azienda3));

		aziendaDao.save(azienda3);
	}

	private Dipendente creaDipendente(String nome, String cognome, String ruolo, int ral, String contatti, Azienda azienda) {
		Dipendente dipendente = new Dipendente();
		dipendente.setNome(nome);
		dipendente.setCognome(cognome);
		dipendente.setRuolo(ruolo);
		dipendente.setRal(ral);
		dipendente.setContatti(contatti);
		dipendente.setAzienda(azienda);
		return dipendente;
	}
}
