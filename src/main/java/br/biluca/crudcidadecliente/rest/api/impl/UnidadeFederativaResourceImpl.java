package br.biluca.crudcidadecliente.rest.api.impl;

import br.biluca.crudcidadecliente.model.entity.UnidadeFederativa;
import br.biluca.crudcidadecliente.rest.apicommon.resource.UnidadeFederativaResource;
import br.biluca.crudcidadecliente.service.UnidadeFederativaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UnidadeFederativaResourceImpl implements UnidadeFederativaResource {

    @Autowired
    private UnidadeFederativaService unidadeFederativaService;

    @Override
    public List<UnidadeFederativa> consultar() {
        return unidadeFederativaService.consultar();
    }
}
