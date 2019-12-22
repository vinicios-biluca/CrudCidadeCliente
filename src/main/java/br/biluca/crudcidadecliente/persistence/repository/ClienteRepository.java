package br.biluca.crudcidadecliente.persistence.repository;

import br.biluca.crudcidadecliente.model.entity.Cidade;
import br.biluca.crudcidadecliente.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("  select cliente from Cliente cliente where cliente.nome like %?1% ")
    List<Cliente> consultarPeloNome(String nomeCliente);
}
