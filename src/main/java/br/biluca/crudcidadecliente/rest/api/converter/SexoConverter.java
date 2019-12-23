package br.biluca.crudcidadecliente.rest.api.converter;

import br.biluca.crudcidadecliente.model.entity.Sexo;
import br.biluca.crudcidadecliente.rest.api.core.Converter;
import br.biluca.crudcidadecliente.rest.apicommon.core.AbstractDTO;
import br.biluca.crudcidadecliente.rest.apicommon.dto.SexoDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SexoConverter implements Converter<SexoDTO, Sexo> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public <DTO extends AbstractDTO> SexoDTO converterEntityParaDTO(Sexo entidade) {
        return modelMapper.map(entidade, SexoDTO.class);
    }

    @Override
    public <DTO extends AbstractDTO> List<SexoDTO> converterEntityParaDTO(List<Sexo> listEntidade) {
        List<SexoDTO> listaSexoDTO = new ArrayList<>();
        for (Sexo sexo : listEntidade){
            listaSexoDTO.add(this.converterEntityParaDTO(sexo));
        }
        return listaSexoDTO;
    }

    @Override
    public <ENTIDADE extends AbstractDTO> Sexo converterDTOParaEntity(SexoDTO dto) {
        return modelMapper.map(dto, Sexo.class);
    }

    @Override
    public <ENTIDADE extends AbstractDTO> List<Sexo> converterDTOParaEntity(List<SexoDTO> listDto) {
        List<Sexo> listaSexo = new ArrayList<>();
        for (SexoDTO sexoDTO : listDto){
            listaSexo.add(this.converterDTOParaEntity(sexoDTO));
        }
        return listaSexo;
    }
}
