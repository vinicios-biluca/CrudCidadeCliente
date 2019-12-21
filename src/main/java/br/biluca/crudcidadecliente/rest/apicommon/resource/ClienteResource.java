package br.biluca.crudcidadecliente.rest.apicommon.resource;

import br.biluca.crudcidadecliente.mu.entity.Cliente;
import br.biluca.crudcidadecliente.rest.apicommon.constant.CrudCidadeClienteConstants;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RequestMapping(CrudCidadeClienteConstants.API_CRUD_CIDADE_CLIENTE_V1)
public interface ClienteResource {

    @PostMapping(CrudCidadeClienteConstants.CLIENTE)
    public @Valid Cliente inserir(@Valid @RequestBody Cliente cliente);

    @GetMapping(CrudCidadeClienteConstants.CLIENTE_CONSULTAR)
    public List<Cliente> consultar();

    @GetMapping(CrudCidadeClienteConstants.CLIENTE_CONSULTAR_NOME)
    public List<Cliente> consultarPeloNome(@Param( value = "nomeCliente") String nomeCliente);

}
