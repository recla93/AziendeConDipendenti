package com.generation.aziendecondipendenti.model.dto;

public record AziendaReservedDto(
		Long id,
		String ragioneSociale,
		String indirizzo,
		int fatturato
)
{
}
