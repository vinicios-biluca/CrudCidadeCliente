package br.biluca.crudcidadecliente.model.entity;

import br.biluca.crudcidadecliente.model.core.AbstractEntity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cliente")
@EntityListeners(AuditingEntityListener.class)
public class Cliente extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCliente;

    @Column(name = "nome", nullable = false)
    private String nome;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idSexo", nullable = false)
    private Sexo sexo;

    @Column(name = "datanascimento", nullable = false)
    private Date dataNascimento;

    @Column(name = "idade", nullable = false)
    private Integer idade;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idCidade", nullable = false)
    private Cidade cidadeResidencia;

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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
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

    public Cidade getCidadeResidencia() {
        return cidadeResidencia;
    }

    public void setCidadeResidencia(Cidade cidadeResidencia) {
        this.cidadeResidencia = cidadeResidencia;
    }

    @Override
    public Long getId() {
        return idCliente;
    }


}
