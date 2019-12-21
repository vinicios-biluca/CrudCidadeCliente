package br.biluca.crudcidadecliente.rest.apicommon.resource;

import br.biluca.crudcidadecliente.mu.entity.Cliente;
import br.biluca.crudcidadecliente.mu.entity.Sexo;
import br.biluca.crudcidadecliente.rest.apicommon.constant.CrudCidadeClienteConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(CrudCidadeClienteConstants.API_CRUD_CIDADE_CLIENTE_V1)
public interface SexoResource {

    @GetMapping(CrudCidadeClienteConstants.SEXO_CONSULTAR)
    public List<Sexo> consultar();

}
