package br.biluca.crudcidadecliente.model.core;

import java.util.Objects;

public abstract class AbstractEntity {

    public abstract Long getId();

    public Boolean hasId(){
        return Objects.nonNull(getId());
    }

}
