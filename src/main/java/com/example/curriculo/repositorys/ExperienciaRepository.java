package com.example.curriculo.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.curriculo.entidades.Experiencia;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
    
}