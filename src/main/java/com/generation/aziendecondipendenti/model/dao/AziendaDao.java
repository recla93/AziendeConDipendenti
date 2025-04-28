package com.generation.aziendecondipendenti.model.dao;

import com.generation.aziendecondipendenti.model.entities.Azienda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AziendaDao extends JpaRepository<Azienda,Long>
{
}
