package br.biluca.crudcidadecliente.service;

import br.biluca.crudcidadecliente.mu.entity.Cliente;
import br.biluca.crudcidadecliente.mu.entity.Sexo;

import java.util.List;

public interface SexoService {
    public List<Sexo> consultar();
}
