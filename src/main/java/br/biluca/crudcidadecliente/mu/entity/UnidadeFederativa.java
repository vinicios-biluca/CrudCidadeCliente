package br.biluca.crudcidadecliente.mu.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "unidadefederativa")
@EntityListeners(AuditingEntityListener.class)
public class UnidadeFederativa extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUnidadeFederativa;

    @Column(name = "descricao",nullable = false)
    private String descricao;

    @Column(name = "sigla",nullable = false)
    private String sigla;

    public UnidadeFederativa() {

    }

    public UnidadeFederativa(String descricao, String sigla) {
        this.descricao = descricao;
        this.sigla = sigla;
    }

    @Override
    public Long getId() {
        return idUnidadeFederativa;
    }

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
