package br.biluca.crudcidadecliente.rest.api.impl;

import br.biluca.crudcidadecliente.mu.entity.Cidade;
import br.biluca.crudcidadecliente.mu.entity.Cliente;
import br.biluca.crudcidadecliente.pu.ClienteRepositorio;
import br.biluca.crudcidadecliente.rest.apicommon.resource.ClienteResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class ClienteResourceImpl implements ClienteResource {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public @Valid Cliente inserir(@Valid Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }

    @Override
    public List<Cliente> consultarPeloNome(String nomeCliente) {
        return clienteRepositorio.findAll();
    }

    @Override
    public List<Cliente> consultar() {
        return clienteRepositorio.findAll();
    }


}
