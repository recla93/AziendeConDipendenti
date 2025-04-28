package com.generation.aziendecondipendenti.model.services;

import com.generation.aziendecondipendenti.model.dao.DipendenteDao;
import com.generation.aziendecondipendenti.model.dto.AziendaSummaryDto;
import com.generation.aziendecondipendenti.model.dto.DipendenteSummaryDto;
import com.generation.aziendecondipendenti.model.dto.DipendeteConNomeAziendaDto;
import com.generation.aziendecondipendenti.model.entities.Azienda;
import com.generation.aziendecondipendenti.model.entities.Dipendente;
import com.generation.aziendecondipendenti.model.mappers.DipendenteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DipendenteService
{
	@Autowired
	DipendenteDao dao;
	@Autowired
	DipendenteMapper mapper;

	public DipendenteSummaryDto getSummaryDtoById(Long id)
	{
		Dipendente d = dao.findById(id).orElse(null);
		if(d==null)
			return null;
		return mapper.toSummaryDto(d);
	}

	public DipendeteConNomeAziendaDto getDipendenteNomeAziendaDtoById(Long id)
	{
		Dipendente d = dao.findById(id).orElse(null);
		if(d==null)
			return null;
		return mapper.toDipendenteNomeAziendaDto(d);
	}

}
