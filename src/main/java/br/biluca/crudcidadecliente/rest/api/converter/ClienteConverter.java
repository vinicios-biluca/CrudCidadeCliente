package br.biluca.crudcidadecliente.rest.api.converter;

import br.biluca.crudcidadecliente.model.entity.Cliente;
import br.biluca.crudcidadecliente.rest.api.core.Converter;
import br.biluca.crudcidadecliente.rest.apicommon.core.AbstractDTO;
import br.biluca.crudcidadecliente.rest.apicommon.dto.ClienteDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteConverter implements Converter<ClienteDTO, Cliente> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public <DTO extends AbstractDTO> ClienteDTO converterEntityParaDTO(Cliente entidade) {
        return modelMapper.map(entidade, ClienteDTO.class);
    }

    @Override
    public <DTO extends AbstractDTO> List<ClienteDTO> converterEntityParaDTO(List<Cliente> listEntidade) {
        List<ClienteDTO> listaCidadeDTO = new ArrayList<>();
        for (Cliente cliente : listEntidade){
            listaCidadeDTO.add(this.converterEntityParaDTO(cliente));
        }
        return listaCidadeDTO;
    }

    @Override
    public <ENTIDADE extends AbstractDTO> Cliente converterDTOParaEntity(ClienteDTO dto) {
        return modelMapper.map(dto, Cliente.class);
    }

    @Override
    public <ENTIDADE extends AbstractDTO> List<Cliente> converterDTOParaEntity(List<ClienteDTO> listDto) {
        List<Cliente> listaCliente = new ArrayList<>();
        for (ClienteDTO clienteDTO : listDto){
            listaCliente.add(this.converterDTOParaEntity(clienteDTO));
        }
        return listaCliente;
    }
}
