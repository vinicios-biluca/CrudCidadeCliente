package br.biluca.crudcidadecliente.persistence.repository;

import br.biluca.crudcidadecliente.model.entity.Sexo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SexoRepository extends JpaRepository<Sexo, Long> {
}
