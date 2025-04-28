package com.generation.aziendecondipendenti.model.services;

import com.generation.aziendecondipendenti.model.dao.AziendaDao;
import com.generation.aziendecondipendenti.model.dao.DipendenteDao;
import com.generation.aziendecondipendenti.model.dto.AziendaSummaryDto;
import com.generation.aziendecondipendenti.model.dto.DipendenteCreazioneDto;
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
	AziendaDao aDao;
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

	public void salvaDipendente(DipendenteCreazioneDto dto)
	{
		//leggo azienda da db grazie alla fk del dto
		Azienda padre = aDao.findById(dto.fk()).orElse(null);
		if(padre==null)
			throw new RuntimeException("Padre non trovato");

		Dipendente daSalvare = mapper.toEntity(dto,padre);
		dao.save(daSalvare);
	}

}
