package br.biluca.crudcidadecliente.service.validation;

import br.biluca.crudcidadecliente.model.core.AbstractEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Validador<T extends AbstractEntity> {

     void validarInsert(T entity) throws Exception;

     void validarDelete(T entity) throws Exception;

     void validarUpdate(T entity) throws Exception;

}
