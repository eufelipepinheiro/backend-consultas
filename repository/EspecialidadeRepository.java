package com.example.backend_consultas.repository;
import com.example.backend_consultas.model.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {
}