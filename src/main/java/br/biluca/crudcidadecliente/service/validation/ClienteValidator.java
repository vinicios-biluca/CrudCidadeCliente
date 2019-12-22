package br.biluca.crudcidadecliente.service.validation;

import br.biluca.crudcidadecliente.model.entity.Cidade;
import br.biluca.crudcidadecliente.model.entity.Cliente;
import br.biluca.crudcidadecliente.service.utils.ValidadorAtributosObrigatorios;
import org.springframework.stereotype.Service;

import java.lang.reflect.Executable;

@Service
public class ClienteValidator implements Validador<Cliente> {

    @Override
    public void validarInsert(Cliente cliente) throws Exception {
        ValidadorAtributosObrigatorios validadorAtributosObrigatorios = new ValidadorAtributosObrigatorios();
        validadorAtributosObrigatorios.add("Nome", cliente.getNome());
        validadorAtributosObrigatorios.add("Cidade Residência", cliente.getCidadeResidencia());
        validadorAtributosObrigatorios.add("Data Nascimento", cliente.getDataNascimento());
        validadorAtributosObrigatorios.add("Idade", cliente.getIdade());
        validadorAtributosObrigatorios.add("Sexo", cliente.getSexo());
        validadorAtributosObrigatorios.validar();
    }

    @Override
    public void validarDelete(Cliente cliente) throws Exception {
    }

    @Override
    public void validarUpdate(Cliente cliente) throws Exception {
        ValidadorAtributosObrigatorios validadorAtributosObrigatorios = new ValidadorAtributosObrigatorios();
        validadorAtributosObrigatorios.add("Nome", cliente.getNome());
        validadorAtributosObrigatorios.add("Cidade Residência", cliente.getCidadeResidencia());
        validadorAtributosObrigatorios.add("Data Nascimento", cliente.getDataNascimento());
        validadorAtributosObrigatorios.add("Idade", cliente.getIdade());
        validadorAtributosObrigatorios.add("Sexo", cliente.getSexo());
        validadorAtributosObrigatorios.validar();
    }
}
