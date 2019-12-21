package br.biluca.crudcidadecliente.pu;

import br.biluca.crudcidadecliente.mu.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepositorio extends JpaRepository<Cidade, Long> {
}
