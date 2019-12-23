package br.biluca.crudcidadecliente.rest.apicommon.resource;

import br.biluca.crudcidadecliente.model.entity.Sexo;
import br.biluca.crudcidadecliente.rest.apicommon.constant.CrudCidadeClienteConstants;
import br.biluca.crudcidadecliente.rest.apicommon.dto.SexoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(CrudCidadeClienteConstants.API_CRUD_CIDADE_CLIENTE_V1)
public interface SexoResource {

    @GetMapping(CrudCidadeClienteConstants.SEXO_CONSULTAR)
    List<SexoDTO> consultar();

}
