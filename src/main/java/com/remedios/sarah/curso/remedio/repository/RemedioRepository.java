package com.remedios.sarah.curso.remedio.repository;

import com.remedios.sarah.curso.remedio.entity.Remedio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemedioRepository extends JpaRepository<Remedio, Long> {
}
