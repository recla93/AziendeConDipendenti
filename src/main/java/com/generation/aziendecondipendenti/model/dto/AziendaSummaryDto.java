package com.generation.aziendecondipendenti.model.dto;

public record AziendaSummaryDto(
		Long id,
		String ragioneSociale,
		String indirizzo
)
{
	//in automatico abbiamo costruttore, getters e setters
}
