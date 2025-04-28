package com.generation.aziendecondipendenti.model.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Azienda extends BaseEntity
{
	private String ragioneSociale,indirizzo;
	private int fatturato;

	@OneToMany(mappedBy = "azienda",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Dipendente> dipendenti = new ArrayList<>();
}
