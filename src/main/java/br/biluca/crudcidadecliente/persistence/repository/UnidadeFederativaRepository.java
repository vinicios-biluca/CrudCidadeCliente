package br.biluca.crudcidadecliente.persistence.repository;

import br.biluca.crudcidadecliente.model.entity.UnidadeFederativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeFederativaRepository extends JpaRepository<UnidadeFederativa, Long> {

    @Query("  select unidadeFederativa from UnidadeFederativa unidadeFederativa where unidadeFederativa.sigla like ?1 ")
    UnidadeFederativa findUnidadeFederativaPelaSigla(String sigla);
}
