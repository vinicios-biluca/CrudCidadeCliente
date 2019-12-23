package br.biluca.crudcidadecliente.rest.apicommon.dto;

import br.biluca.crudcidadecliente.rest.apicommon.core.AbstractDTO;

import java.util.Date;

public class ClienteDTO extends AbstractDTO {

    private Long idCliente;

    private String nome;

    private SexoDTO sexo;

    private Date dataNascimento;

    private Integer idade;

    private CidadeDTO cidadeResidencia;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SexoDTO getSexo() {
        return sexo;
    }

    public void setSexo(SexoDTO sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public CidadeDTO getCidadeResidencia() {
        return cidadeResidencia;
    }

    public void setCidadeResidencia(CidadeDTO cidadeResidencia) {
        this.cidadeResidencia = cidadeResidencia;
    }
}
