package br.biluca.crudcidadecliente.pu.repository;

import br.biluca.crudcidadecliente.mu.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
