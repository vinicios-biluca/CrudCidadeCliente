package br.biluca.crudcidadecliente.rest.apicommon.resource;

import br.biluca.crudcidadecliente.model.entity.UnidadeFederativa;
import br.biluca.crudcidadecliente.rest.apicommon.constant.CrudCidadeClienteConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(CrudCidadeClienteConstants.API_CRUD_CIDADE_CLIENTE_V1)
public interface UnidadeFederativaResource {

    @GetMapping(CrudCidadeClienteConstants.UNIDADE_FEDERATIVA_CONSULTAR)
    List<UnidadeFederativa> consultar();
}
