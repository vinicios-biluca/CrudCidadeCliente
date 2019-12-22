package br.biluca.crudcidadecliente.rest.apicommon.resource;

import br.biluca.crudcidadecliente.model.entity.Cidade;
import br.biluca.crudcidadecliente.model.entity.Cliente;
import br.biluca.crudcidadecliente.rest.apicommon.constant.CrudCidadeClienteConstants;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping(CrudCidadeClienteConstants.API_CRUD_CIDADE_CLIENTE_V1)
public interface CidadeResource {

    @PostMapping(CrudCidadeClienteConstants.CIDADE_INSERIR)
     @Valid Cidade inserir(@Valid @RequestBody Cidade cidade) throws Exception;

    @DeleteMapping(CrudCidadeClienteConstants.CIDADE_DELETAR)
     @Valid void deletar(@PathVariable(value = "id") Long idCidade);

    @PutMapping(CrudCidadeClienteConstants.CIDADE_ATUALIZAR)
     @Valid Cidade atualizar(@Valid @RequestBody Cidade cidade) throws Exception;

    @GetMapping(CrudCidadeClienteConstants.CIDADE_CONSULTAR)
     List<Cidade> consultar();

    @GetMapping(CrudCidadeClienteConstants.CIDADE_CONSULTAR_NOME)
     List<Cidade> consultarPeloNome(@Param( value = "nomeCidade") String nomeCidade);

    @GetMapping(CrudCidadeClienteConstants.CIDADE_CONSULTAR_SIGLA_UF)
     List<Cidade> consultarPelaSiglaUnidadeFederativa(@Param( value = "siglaUnidadeFederativa") String siglaUnidadeFederativa);


}
