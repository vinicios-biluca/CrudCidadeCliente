package br.biluca.crudcidadecliente.rest.apicommon.dto;

import br.biluca.crudcidadecliente.rest.apicommon.core.AbstractDTO;

public class UnidadeFederativaDTO extends AbstractDTO {

    private Long idUnidadeFederativa;

    private String descricao;

    private String sigla;

    public Long getIdUnidadeFederativa() {
        return idUnidadeFederativa;
    }

    public void setIdUnidadeFederativa(Long idUnidadeFederativa) {
        this.idUnidadeFederativa = idUnidadeFederativa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
