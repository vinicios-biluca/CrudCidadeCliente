package br.biluca.crudcidadecliente.rest.api.impl;

import br.biluca.crudcidadecliente.model.entity.Cidade;
import br.biluca.crudcidadecliente.rest.api.converter.CidadeConverter;
import br.biluca.crudcidadecliente.rest.apicommon.dto.CidadeDTO;
import br.biluca.crudcidadecliente.rest.apicommon.resource.CidadeResource;
import br.biluca.crudcidadecliente.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CidadeResourceImpl implements CidadeResource {

    @Autowired
    private CidadeService cidadeService;

    @Autowired
    private CidadeConverter cidadeConverter;

    @Override
    public @Valid Cidade inserir(@Valid CidadeDTO cidadeDTO) throws Exception {
        Cidade cidade = cidadeConverter.converterDTOParaEntity(cidadeDTO);
        return cidadeService.inserir((Cidade) cidade);
    }

    @Override
    public @Valid void deletar(Long idCidade) {
        cidadeService.deletar(idCidade);
    }

    @Override
    public @Valid CidadeDTO atualizar(@Valid CidadeDTO cidadeDTO) throws Exception {
        Cidade cidade = cidadeConverter.converterDTOParaEntity(cidadeDTO);
        return cidadeConverter.converterEntityParaDTO(cidadeService.atualizar(cidade));
    }

    @Override
    public List<CidadeDTO> consultar() {
        List<Cidade> listaCidade = cidadeService.consultar();
        return cidadeConverter.converterEntityParaDTO(listaCidade);
    }

    @Override
    public List<CidadeDTO> consultarPeloNome(String nomeCidade) {
        List<Cidade> listaCidade = cidadeService.consultarPeloNome(nomeCidade);
        return cidadeConverter.converterEntityParaDTO(listaCidade);
    }

    @Override
    public List<CidadeDTO> consultarPelaSiglaUnidadeFederativa(String siglaUnidadeFederativa) {
        List<Cidade> listaCidade = cidadeService.consultarPelaSiglaUnidadeFederativa(siglaUnidadeFederativa);
        return cidadeConverter.converterEntityParaDTO(listaCidade);
    }

}
