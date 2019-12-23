package br.biluca.crudcidadecliente.rest.api.impl;

import br.biluca.crudcidadecliente.model.entity.Cliente;
import br.biluca.crudcidadecliente.persistence.repository.ClienteRepository;
import br.biluca.crudcidadecliente.rest.api.converter.CidadeConverter;
import br.biluca.crudcidadecliente.rest.api.converter.ClienteConverter;
import br.biluca.crudcidadecliente.rest.apicommon.dto.ClienteDTO;
import br.biluca.crudcidadecliente.rest.apicommon.resource.ClienteResource;
import br.biluca.crudcidadecliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ClienteResourceImpl implements ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ClienteConverter clienteConverter;

    @Override
    public @Valid ClienteDTO inserir(@Valid ClienteDTO clienteDTO) throws Exception {
        Cliente cliente = clienteConverter.converterDTOParaEntity(clienteDTO);
        return clienteConverter.converterEntityParaDTO(clienteService.inserir(cliente));
    }

    @Override
    public @Valid void deletar(Long idCliente) throws Exception {
        clienteService.deletar(idCliente);
    }

    @Override
    public @Valid ClienteDTO atualizar(@Valid ClienteDTO clienteDTO) throws Exception {
        Cliente cliente = clienteConverter.converterDTOParaEntity(clienteDTO);
        return clienteConverter.converterEntityParaDTO(clienteService.atualizar(cliente));
    }

    @Override
    public ClienteDTO consultar(Long idCliente) throws Exception {
        return clienteConverter.converterEntityParaDTO(clienteService.consultarPeloId(idCliente));
    }

    @Override
    public List<ClienteDTO> consultarPeloNome(String nomeCliente) {
        return clienteConverter.converterEntityParaDTO(clienteService.consultarPeloNome(nomeCliente));
    }

    @Override
    public List<ClienteDTO> consultar() {
        return clienteConverter.converterEntityParaDTO(clienteService.consultar());
    }

}
