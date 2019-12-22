package br.biluca.crudcidadecliente.service;

import br.biluca.crudcidadecliente.model.entity.Cidade;

import java.util.List;

public interface CidadeService {

    Cidade inserir(Cidade cidade) throws Exception;

    void deletar(Long idCidade);

    Cidade atualizar(Cidade cidade) throws Exception;

    List<Cidade> consultar();

    List<Cidade> consultarPeloNome(String nomeCidade);

    List<Cidade> consultarPelaSiglaUnidadeFederativa(String siglaUnidadeFederativa);

}
