package com.generation.aziendecondipendenti.model.dto;

public record DipendeteConNomeAziendaDto(
		Long id,
		String nome,
		String cognome,
		String ruolo,
		String nomeAzienda
)
{
}
