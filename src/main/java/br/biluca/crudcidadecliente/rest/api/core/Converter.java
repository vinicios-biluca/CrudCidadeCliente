package br.biluca.crudcidadecliente.rest.api.core;

import br.biluca.crudcidadecliente.model.core.AbstractEntity;
import br.biluca.crudcidadecliente.rest.apicommon.core.AbstractDTO;

import java.util.List;

public interface Converter<T extends AbstractDTO, S extends AbstractEntity> {

    <DTO extends AbstractDTO> T converterEntityParaDTO(S entidade);

    <DTO extends AbstractDTO> List<T> converterEntityParaDTO(List<S> listEntidade);

    <ENTIDADE extends AbstractDTO> S converterDTOParaEntity(T dto);

    <ENTIDADE extends AbstractDTO> List<S> converterDTOParaEntity(List<T> listDto);

}
