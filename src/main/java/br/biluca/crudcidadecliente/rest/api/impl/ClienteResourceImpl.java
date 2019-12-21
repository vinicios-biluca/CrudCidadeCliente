package br.biluca.crudcidadecliente.rest.api.impl;

import br.biluca.crudcidadecliente.mu.entity.Cliente;
import br.biluca.crudcidadecliente.pu.repository.ClienteRepository;
import br.biluca.crudcidadecliente.rest.apicommon.resource.ClienteResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ClienteResourceImpl implements ClienteResource {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public @Valid Cliente inserir(@Valid Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> consultarPeloNome(String nomeCliente) {
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> consultar() {
        return clienteRepository.findAll();
    }


}
