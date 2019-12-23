package br.biluca.crudcidadecliente.rest.api.converter;

import br.biluca.crudcidadecliente.model.entity.UnidadeFederativa;
import br.biluca.crudcidadecliente.rest.api.core.Converter;
import br.biluca.crudcidadecliente.rest.apicommon.core.AbstractDTO;
import br.biluca.crudcidadecliente.rest.apicommon.dto.UnidadeFederativaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UnidadadeFederativaConverter implements Converter<UnidadeFederativaDTO, UnidadeFederativa> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public <DTO extends AbstractDTO> UnidadeFederativaDTO converterEntityParaDTO(UnidadeFederativa entidade) {
        return modelMapper.map(entidade, UnidadeFederativaDTO.class);
    }

    @Override
    public <DTO extends AbstractDTO> List<UnidadeFederativaDTO> converterEntityParaDTO(List<UnidadeFederativa> listEntidade) {
        List<UnidadeFederativaDTO> listaUnidadeFederativaDTO = new ArrayList<>();
        for (UnidadeFederativa unidadeFederativa : listEntidade){
            listaUnidadeFederativaDTO.add(this.converterEntityParaDTO(unidadeFederativa));
        }
        return listaUnidadeFederativaDTO;
    }

    @Override
    public <ENTIDADE extends AbstractDTO> UnidadeFederativa converterDTOParaEntity(UnidadeFederativaDTO dto) {
        return modelMapper.map(dto, UnidadeFederativa.class);
    }

    @Override
    public <ENTIDADE extends AbstractDTO> List<UnidadeFederativa> converterDTOParaEntity(List<UnidadeFederativaDTO> listDto) {
        List<UnidadeFederativa> listaUnidadeFederativa= new ArrayList<>();
        for (UnidadeFederativaDTO unidadeFederativaDTO : listDto){
            listaUnidadeFederativa.add(this.converterDTOParaEntity(unidadeFederativaDTO));
        }
        return listaUnidadeFederativa;
    }
}
