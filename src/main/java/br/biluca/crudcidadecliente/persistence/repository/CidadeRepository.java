package br.biluca.crudcidadecliente.persistence.repository;

import br.biluca.crudcidadecliente.model.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    @Query("  select cidade from Cidade cidade where cidade.nome like %?1% ")
    List<Cidade> consultarPeloNome(String nomeCidade);

    @Query("  select cidade from Cidade cidade join cidade.unidadeFederativa uf where uf.sigla like ?1 ")
    List<Cidade> consultarPelaSiglaUnidadeFederativa(String siglaUnidadeFederativa);

}
