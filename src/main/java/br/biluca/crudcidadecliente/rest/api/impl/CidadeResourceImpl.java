package br.biluca.crudcidadecliente.rest.api.impl;

import br.biluca.crudcidadecliente.mu.entity.Cidade;
import br.biluca.crudcidadecliente.rest.apicommon.resource.CidadeResource;
import br.biluca.crudcidadecliente.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CidadeResourceImpl implements CidadeResource {

    @Autowired
    private CidadeService cidadeService;

    @Override
    public @Valid Cidade inserir(@Valid Cidade cidade) {
        return cidadeService.inserir(cidade);
    }

    @Override
    public List<Cidade> consultar() {
        return cidadeService.consultar();
    }

    @Override
    public List<Cidade> consultarPeloNome(String nomeCidade) {
        return cidadeService.consultarPeloNome(nomeCidade);
    }

    @Override
    public List<Cidade> consultarPelaSiglaUnidadeFederativa(String siglaUnidadeFederativa) {
        return cidadeService.consultarPelaSiglaUnidadeFederativa(siglaUnidadeFederativa);
    }

}