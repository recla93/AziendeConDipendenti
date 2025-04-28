package com.generation.aziendecondipendenti.model.dao;

import com.generation.aziendecondipendenti.model.entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DipendenteDao extends JpaRepository<Dipendente,Long>
{
}
