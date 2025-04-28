package com.generation.aziendecondipendenti.model.mappers;

import com.generation.aziendecondipendenti.model.dto.AziendaReservedDto;
import com.generation.aziendecondipendenti.model.dto.AziendaSummaryDto;
import com.generation.aziendecondipendenti.model.entities.Azienda;
import org.springframework.stereotype.Service;

//Classe che svolge un lavoro (offre funzionalità)
//Viene automaticamente BEANIZZATA, e può essere Autowirato
@Service
public class AziendaMapper
{
	//voglio un metodo per convertire una Azienda nel suo dto
	public AziendaSummaryDto toSummaryDto(Azienda a)
	{
		return new AziendaSummaryDto(a.getId(),a.getRagioneSociale(),a.getIndirizzo());
	}

	public AziendaReservedDto toReservedDto(Azienda a)
	{
		return new AziendaReservedDto(a.getId(),a.getRagioneSociale(),a.getIndirizzo(),a.getFatturato());
	}

}
