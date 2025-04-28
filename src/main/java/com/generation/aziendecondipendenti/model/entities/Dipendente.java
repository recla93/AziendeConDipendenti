package com.generation.aziendecondipendenti.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Dipendente extends BaseEntity
{
	private String nome,cognome,ruolo;
	private int ral;
	private String contatti;


	@ManyToOne( fetch = FetchType.EAGER)
	@JoinColumn(name = "id_azienda")
	@JsonIgnore
	private Azienda azienda;

}
