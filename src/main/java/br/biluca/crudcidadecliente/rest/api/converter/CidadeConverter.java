package br.biluca.crudcidadecliente.rest.api.converter;

import br.biluca.crudcidadecliente.model.entity.Cidade;
import br.biluca.crudcidadecliente.rest.api.core.Converter;
import br.biluca.crudcidadecliente.rest.apicommon.core.AbstractDTO;
import br.biluca.crudcidadecliente.rest.apicommon.dto.CidadeDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CidadeConverter implements Converter<CidadeDTO, Cidade> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public <DTO extends AbstractDTO> CidadeDTO converterEntityParaDTO(Cidade entidade) {
        return modelMapper.map(entidade, CidadeDTO.class);
    }

    @Override
    public <DTO extends AbstractDTO> List<CidadeDTO> converterEntityParaDTO(List<Cidade> listEntidade) {
        List<CidadeDTO> listaCidadeDTO = new ArrayList<>();
        for (Cidade cidade : listEntidade){
            listaCidadeDTO.add(this.converterEntityParaDTO(cidade));
        }
        return listaCidadeDTO;
    }

    @Override
    public <ENTIDADE extends AbstractDTO> Cidade converterDTOParaEntity(CidadeDTO dto) {
        return modelMapper.map(dto, Cidade.class);
    }

    @Override
    public <ENTIDADE extends AbstractDTO> List<Cidade> converterDTOParaEntity(List<CidadeDTO> listDto) {
        List<Cidade> listaCidade = new ArrayList<>();
        for (CidadeDTO cidadeDTO : listDto){
            listaCidade.add(this.converterDTOParaEntity(cidadeDTO));
        }
        return listaCidade;
    }

}
