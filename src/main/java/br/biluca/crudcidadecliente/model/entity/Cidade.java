package br.biluca.crudcidadecliente.model.entity;

import br.biluca.crudcidadecliente.model.core.AbstractEntity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;


@Entity
@Table(name = "cidade")
@EntityListeners(AuditingEntityListener.class)
public class Cidade extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCidade;

    @Column(name = "nome",nullable = false)
    private String nome;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "idUnidadeFederativa", nullable = false)
    private UnidadeFederativa unidadeFederativa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Long idCidade) {
        this.idCidade = idCidade;
    }

    public UnidadeFederativa getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

    @Override
    public Long getId() {
        return idCidade;
    }

}
