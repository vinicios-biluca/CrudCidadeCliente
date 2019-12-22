package br.biluca.crudcidadecliente.service;

import br.biluca.crudcidadecliente.model.entity.Cidade;
import br.biluca.crudcidadecliente.model.entity.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente inserir(Cliente cliente) throws Exception;

    Cliente atualizar(Cliente cliente) throws Exception;

    void deletar(Long idCliente) throws Exception;

    List<Cliente> consultar();

    List<Cliente> consultarPeloNome(String nomeCliente);

    Cliente consultarPeloId(Long idCliente) throws Exception;
}
