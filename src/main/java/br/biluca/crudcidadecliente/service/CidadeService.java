package br.biluca.crudcidadecliente.service;

import br.biluca.crudcidadecliente.mu.entity.Cidade;

import java.util.List;

public interface CidadeService {

    Cidade inserir(Cidade cidade);
    List<Cidade> consultar();
    List<Cidade> consultarPeloNome(String nomeCidade);
    List<Cidade> consultarPelaSiglaUnidadeFederativa(String siglaUnidadeFederativa);
}
