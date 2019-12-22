package br.biluca.crudcidadecliente.rest.api.impl;

import br.biluca.crudcidadecliente.model.entity.Sexo;
import br.biluca.crudcidadecliente.rest.apicommon.resource.SexoResource;
import br.biluca.crudcidadecliente.service.SexoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SexoResourceImpl implements SexoResource {

    @Autowired
    private SexoService sexoService;

    @Override
    public List<Sexo> consultar() {
        return sexoService.consultar();
    }
}
