package com.generation.aziendecondipendenti.model.dto;

public record DipendenteCreazioneDto
(
		String nombre,
		String apellido,
		String rol,
		int salarioAnual,
		String contactos,
		Long fk
)
{
}
