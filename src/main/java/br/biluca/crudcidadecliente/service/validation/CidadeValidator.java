package br.biluca.crudcidadecliente.service.validation;

import br.biluca.crudcidadecliente.model.entity.Cidade;
import br.biluca.crudcidadecliente.service.utils.ValidadorAtributosObrigatorios;
import org.springframework.stereotype.Service;

@Service
public class CidadeValidator implements Validador<Cidade> {
    @Override
    public void validarInsert(Cidade cidade) throws Exception {
        ValidadorAtributosObrigatorios validadorAtributosObrigatorios = new ValidadorAtributosObrigatorios();
        validadorAtributosObrigatorios.add("Nome da Cidade", cidade.getNome());
        validadorAtributosObrigatorios.add("Unidade Federativa", cidade.getUnidadeFederativa());
        validadorAtributosObrigatorios.validar();
    }

    @Override
    public void validarDelete(Cidade cidade) throws Exception {
    }

    @Override
    public void validarUpdate(Cidade cidade) throws Exception {
        ValidadorAtributosObrigatorios validadorAtributosObrigatorios = new ValidadorAtributosObrigatorios();
        validadorAtributosObrigatorios.add("Nome da Cidade", cidade.getNome());
        validadorAtributosObrigatorios.add("Unidade Federativa", cidade.getUnidadeFederativa());
        validadorAtributosObrigatorios.validar();
    }
}
