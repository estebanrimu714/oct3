package com.tcc.apicuertostcc.repositorios;

import com.tcc.apicuertostcc.entidades.Mercancia;
import com.tcc.apicuertostcc.entidades.Zona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Zonarepopsitorio extends JpaRepository<Zona, Integer> {
}
