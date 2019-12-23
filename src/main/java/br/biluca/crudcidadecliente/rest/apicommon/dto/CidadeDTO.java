package br.biluca.crudcidadecliente.rest.apicommon.dto;

import br.biluca.crudcidadecliente.rest.apicommon.core.AbstractDTO;

public class CidadeDTO extends AbstractDTO {

    private Long idCidade;

    private String nome;

    private UnidadeFederativaDTO unidadeFederativa;

    public Long getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Long idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UnidadeFederativaDTO getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(UnidadeFederativaDTO unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }
}
