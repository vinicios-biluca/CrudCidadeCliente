package br.biluca.crudcidadecliente.rest.api.impl;

import br.biluca.crudcidadecliente.model.entity.Cliente;
import br.biluca.crudcidadecliente.persistence.repository.ClienteRepository;
import br.biluca.crudcidadecliente.rest.apicommon.resource.ClienteResource;
import br.biluca.crudcidadecliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ClienteResourceImpl implements ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @Override
    public @Valid Cliente inserir(@Valid Cliente cliente) throws Exception {
        return clienteService.inserir(cliente);
    }

    @Override
    public @Valid void deletar(Long idCliente) throws Exception {
        clienteService.deletar(idCliente);
    }

    @Override
    public @Valid Cliente atualizar(@Valid Cliente cliente) throws Exception {
        return clienteService.atualizar(cliente);
    }

    @Override
    public Cliente consultar(Long idCliente) throws Exception {
        return clienteService.consultarPeloId(idCliente);
    }

    @Override
    public List<Cliente> consultarPeloNome(String nomeCliente) {
        return clienteService.consultarPeloNome(nomeCliente);
    }

    @Override
    public List<Cliente> consultar() {
        return clienteService.consultar();
    }

}
