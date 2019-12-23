package br.biluca.crudcidadecliente.rest.apicommon.dto;


import br.biluca.crudcidadecliente.rest.apicommon.core.AbstractDTO;

public class SexoDTO extends AbstractDTO {

    private Long idSexo;

    private String descricao;

    private String sigla;

    public Long getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Long idSexo) {
        this.idSexo = idSexo;
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
