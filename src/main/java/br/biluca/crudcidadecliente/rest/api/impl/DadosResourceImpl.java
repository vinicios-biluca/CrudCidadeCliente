package br.biluca.crudcidadecliente.rest.api.impl;

import br.biluca.crudcidadecliente.rest.apicommon.constant.CrudCidadeClienteConstants;
import br.biluca.crudcidadecliente.rest.apicommon.resource.DadosResource;
import br.biluca.crudcidadecliente.service.DadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DadosResourceImpl implements DadosResource {

    @Autowired
    private DadosService dadosService;

    @Override
    public String estabelecerBaseDados() {
        return dadosService.estabelecerBaseDados();
    }
}
