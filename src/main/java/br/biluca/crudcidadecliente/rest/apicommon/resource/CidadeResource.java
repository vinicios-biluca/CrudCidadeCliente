package br.biluca.crudcidadecliente.rest.apicommon.resource;

import br.biluca.crudcidadecliente.mu.entity.Cidade;
import br.biluca.crudcidadecliente.mu.entity.Cliente;
import br.biluca.crudcidadecliente.rest.apicommon.constant.CrudCidadeClienteConstants;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@RequestMapping(CrudCidadeClienteConstants.API_CRUD_CIDADE_CLIENTE_V1)
public interface CidadeResource {

    @PostMapping(CrudCidadeClienteConstants.CIDADE)
    public @Valid Cidade inserir(@Valid @RequestBody Cidade cidade);

    @GetMapping(CrudCidadeClienteConstants.CIDADE_CONSULTAR)
    public List<Cidade> consultar();

    @GetMapping(CrudCidadeClienteConstants.CIDADE_CONSULTAR_NOME)
    public List<Cidade> consultarPeloNome(@Param( value = "nomeCidade") String nomeCidade);

}
