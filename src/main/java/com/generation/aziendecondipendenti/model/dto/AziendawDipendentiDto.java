package com.generation.aziendecondipendenti.model.dto;

import java.util.List;

public record AziendawDipendentiDto(
		Long id,
		String ragioneSociale,
		String indirizzo,
		List<DipendenteSummaryDto> dipendenti
)
{
}
