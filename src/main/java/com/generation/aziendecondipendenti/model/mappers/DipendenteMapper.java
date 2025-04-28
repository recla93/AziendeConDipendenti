package com.generation.aziendecondipendenti.model.mappers;

import com.generation.aziendecondipendenti.model.dto.AziendaSummaryDto;
import com.generation.aziendecondipendenti.model.dto.DipendenteSummaryDto;
import com.generation.aziendecondipendenti.model.dto.DipendeteConNomeAziendaDto;
import com.generation.aziendecondipendenti.model.entities.Azienda;
import com.generation.aziendecondipendenti.model.entities.Dipendente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DipendenteMapper
{
	public DipendenteSummaryDto toSummaryDto(Dipendente d)
	{
		return new DipendenteSummaryDto(d.getId(), d.getNome(), d.getCognome(),d.getRuolo());
	}

	public DipendeteConNomeAziendaDto toDipendenteNomeAziendaDto(Dipendente d)
	{
		return new DipendeteConNomeAziendaDto(d.getId(), d.getNome(), d.getCognome(),d.getRuolo(),d.getAzienda().getRagioneSociale());
	}

	public List<DipendenteSummaryDto> toSummaryDtoList(List<Dipendente> l)
	{
		return l.stream().map(d->toSummaryDto(d)).toList();
	}
}
