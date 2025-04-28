package com.generation.aziendecondipendenti;

import com.generation.aziendecondipendenti.model.dao.AziendaDao;
import com.generation.aziendecondipendenti.model.dto.*;
import com.generation.aziendecondipendenti.model.entities.Azienda;
import com.generation.aziendecondipendenti.model.mappers.AziendaMapper;
import com.generation.aziendecondipendenti.model.services.AziendaService;
import com.generation.aziendecondipendenti.model.services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerProva
{

	@Autowired
	AziendaService as;
	@Autowired
	DipendenteService ds;

	@GetMapping("/primaAziendaDto")
	public AziendaSummaryDto getPrimaDto()
	{
		return as.getSummaryDtoById(1L);
	}

	@GetMapping("/primaFatturato")
	public AziendaReservedDto getPrimaFatturato()
	{
		return as.getReservedDtoById(1L);
	}

	@GetMapping("/primaAziendaDipendentiDto")
	public AziendawDipendentiDto getPrimaDtoDipendenti()
	{
		return as.getAziendawDipendentiDtoById(1L);
	}

	@GetMapping("/tutteDto")
	public List<AziendaSummaryDto> getTutte()
	{
		return as.getAllSummaryDto();
	}

	@GetMapping("/primoDipendente")
	public DipendenteSummaryDto getDipendenteDto()
	{
		return ds.getSummaryDtoById(1L);
	}

	@GetMapping("/primoDipendenteAz")
	public DipendeteConNomeAziendaDto getDipendenteAziendaDto()
	{
		return ds.getDipendenteNomeAziendaDtoById(1L);
	}
}
