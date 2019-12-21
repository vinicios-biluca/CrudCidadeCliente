package br.biluca.crudcidadecliente.pu.repository;

import br.biluca.crudcidadecliente.mu.entity.UnidadeFederativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeFederativaRepository extends JpaRepository<UnidadeFederativa, Long> {
}
