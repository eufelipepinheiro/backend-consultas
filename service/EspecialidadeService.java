package com.example.backend_consultas.service;
import com.example.backend_consultas.model.Especialidade;
import com.example.backend_consultas.repository.EspecialidadeRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EspecialidadeService {
    private final EspecialidadeRepository repository;
    public EspecialidadeService(EspecialidadeRepository repository) {
        this.repository = repository;
    }
    public Especialidade salvar(Especialidade especialidade) {
        return repository.save(especialidade);
    }
    public List<Especialidade> listar() {
        return repository.findAll();
    }
}

spring.datasource.url=jdbc:h2:file:./data/consultas
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update