package com.tcc.apicuertostcc.repositorios;

import com.tcc.apicuertostcc.entidades.Mercancia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Mercanciarepositorio extends JpaRepository<Mercancia, Integer> {
}
