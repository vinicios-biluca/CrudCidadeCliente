package br.biluca.crudcidadecliente.mu.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "sexo")
@EntityListeners(AuditingEntityListener.class)
public class Sexo extends  AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSexo;

    @Column(name = "descricao",nullable = false)
    private String descricao;

    @Column(name = "sigla",nullable = false)
    private String sigla;

    public Sexo (){

    }

    public Sexo (String descricao,String sigla){
        this.descricao = descricao;
        this.sigla = sigla;
    }

    @Override
    public Long getId() {
        return idSexo;
    }

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
