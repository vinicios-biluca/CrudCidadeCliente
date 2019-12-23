package br.biluca.crudcidadecliente.rest.apicommon.resource;

import br.biluca.crudcidadecliente.model.entity.Cliente;
import br.biluca.crudcidadecliente.rest.apicommon.constant.CrudCidadeClienteConstants;
import br.biluca.crudcidadecliente.rest.apicommon.dto.ClienteDTO;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RequestMapping(CrudCidadeClienteConstants.API_CRUD_CIDADE_CLIENTE_V1)
public interface ClienteResource {

    @PostMapping(CrudCidadeClienteConstants.CLIENTE_INSERIR)
    @Valid ClienteDTO inserir(@Valid @RequestBody ClienteDTO cliente) throws Exception;

    @DeleteMapping(CrudCidadeClienteConstants.CLIENTE_DELETAR)
    @Valid void deletar(@PathVariable(value = "id") Long idCliente) throws Exception;

    @PutMapping(CrudCidadeClienteConstants.CLIENTE_ATUALIZAR)
    @Valid ClienteDTO atualizar(@Valid @RequestBody ClienteDTO cliente) throws Exception;

    @GetMapping(CrudCidadeClienteConstants.CLIENTE_CONSULTAR_ID)
    ClienteDTO consultar(@PathVariable(value = "id") Long idCliente) throws Exception;

    @GetMapping(CrudCidadeClienteConstants.CLIENTE_CONSULTAR)
    List<ClienteDTO> consultar();

    @GetMapping(CrudCidadeClienteConstants.CLIENTE_CONSULTAR_NOME)
    List<ClienteDTO> consultarPeloNome(@Param(value = "nomeCliente") String nomeCliente);


}
