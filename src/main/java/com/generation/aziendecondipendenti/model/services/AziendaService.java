package com.generation.aziendecondipendenti.model.services;

import com.generation.aziendecondipendenti.model.dao.AziendaDao;
import com.generation.aziendecondipendenti.model.dto.AziendaReservedDto;
import com.generation.aziendecondipendenti.model.dto.AziendaSummaryDto;
import com.generation.aziendecondipendenti.model.entities.Azienda;
import com.generation.aziendecondipendenti.model.mappers.AziendaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//servizio che unisce mapper e dao, pensato per essere usato comodamente dai Controller
//fornendo loro i dati di cui hanno bisogno già nella forma corretta
public class AziendaService
{
	@Autowired
	AziendaDao dao;
	@Autowired
	AziendaMapper mapper;

	public AziendaSummaryDto getSummaryDtoById(Long id)
	{
		Azienda a = dao.findById(id).orElse(null);
		if(a==null)
			return null;
		return mapper.toSummaryDto(a);
	}


	public AziendaReservedDto getReservedDtoById(Long id)
	{
		Azienda a = dao.findById(id).orElse(null);
		if(a==null)
			return null;
		return mapper.toReservedDto(a);
	}

	public List<AziendaSummaryDto> getAllSummaryDto()
	{
		List<Azienda> tutte = dao.findAll();

		return tutte.stream().map(a->mapper.toSummaryDto(a)).toList();
	}


}
