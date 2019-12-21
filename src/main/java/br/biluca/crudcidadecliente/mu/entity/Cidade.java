package br.biluca.crudcidadecliente.mu.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;


@Entity
@Table(name = "cidade")
@EntityListeners(AuditingEntityListener.class)
public class Cidade implements IEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCidade;

    @Column(name = "nome",nullable = false)
    private String nome;

    @Column(name = "siglauf",nullable = false)
    private String siglaUF;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSiglaUF() {
        return siglaUF;
    }

    public void setSiglaUF(String siglaUF) {
        this.siglaUF = siglaUF;
    }

    @Override
    public Long getId() {
        return idCidade;
    }

}
