package br.biluca.crudcidadecliente.pu;

import br.biluca.crudcidadecliente.mu.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
}
