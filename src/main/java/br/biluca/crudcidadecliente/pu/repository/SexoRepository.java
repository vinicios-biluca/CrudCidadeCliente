package br.biluca.crudcidadecliente.pu.repository;

import br.biluca.crudcidadecliente.mu.entity.Sexo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SexoRepository extends JpaRepository<Sexo, Long> {
}
