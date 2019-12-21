package br.biluca.crudcidadecliente.rest.api.impl;

import br.biluca.crudcidadecliente.mu.entity.Cidade;
import br.biluca.crudcidadecliente.pu.CidadeRepositorio;
import br.biluca.crudcidadecliente.rest.apicommon.resource.CidadeResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CidadeResourceImpl implements CidadeResource {

    @Autowired
    private CidadeRepositorio cidadeRepositorio;

    @Override
    public @Valid Cidade inserir(@Valid Cidade cidade) {
        return cidadeRepositorio.save(cidade);
    }

    @Override
    public List<Cidade> consultar() {
        return cidadeRepositorio.findAll();
    }

    @Override
    public List<Cidade> consultarPeloNome(String nomeCidade) {
        return null;
    }
}
