package br.biluca.crudcidadecliente.rest.api.impl;

import br.biluca.crudcidadecliente.model.entity.UnidadeFederativa;
import br.biluca.crudcidadecliente.rest.api.converter.UnidadadeFederativaConverter;
import br.biluca.crudcidadecliente.rest.apicommon.dto.UnidadeFederativaDTO;
import br.biluca.crudcidadecliente.rest.apicommon.resource.UnidadeFederativaResource;
import br.biluca.crudcidadecliente.service.UnidadeFederativaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UnidadeFederativaResourceImpl implements UnidadeFederativaResource {

    @Autowired
    private UnidadeFederativaService unidadeFederativaService;

    @Autowired
    private UnidadadeFederativaConverter unidadadeFederativaConverter;

    @Override
    public List<UnidadeFederativaDTO> consultar() {
        return unidadadeFederativaConverter.converterEntityParaDTO(unidadeFederativaService.consultar());
    }
}
