package br.biluca.crudcidadecliente.pu.repository;

import br.biluca.crudcidadecliente.mu.entity.Cidade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    @Query("  select cidade from Cidade cidade where cidade.nome like ?1% ")
    List<Cidade> consultarPeloNome(String nomeCidade);

    @Query("  select cidade from Cidade cidade ")
    List<Cidade> consultarPelaSiglaUnidadeFederativa(String siglaUnidadeFederativa);

}
