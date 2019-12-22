package br.biluca.crudcidadecliente.service.impl;

import br.biluca.crudcidadecliente.model.entity.Cliente;
import br.biluca.crudcidadecliente.persistence.repository.ClienteRepository;
import br.biluca.crudcidadecliente.service.ClienteService;
import br.biluca.crudcidadecliente.service.validation.CidadeValidator;
import br.biluca.crudcidadecliente.service.validation.ClienteValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteValidator clienteValidator;

    @Override
    public Cliente inserir(Cliente cliente) throws Exception {
        clienteValidator.validarInsert(cliente);
        return clienteRepository.save(cliente);
    }

    @Override
    public void deletar(Long idCliente) throws Exception {
        findAndValidadeClienteById(idCliente);
        clienteRepository.deleteById(idCliente);
    }

    @Override
    public Cliente atualizar(Cliente cliente) throws Exception {
        findAndValidadeClienteById(cliente.getId());
        clienteValidator.validarUpdate(cliente);
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente consultarPeloId(Long idCliente) throws Exception {
        return findAndValidadeClienteById(idCliente);
    }

    @Override
    public List<Cliente> consultar() {
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> consultarPeloNome(String nomeCliente) {
        return clienteRepository.consultarPeloNome(nomeCliente);
    }

    private Cliente findAndValidadeClienteById(Long idCliente) throws Exception {
        Optional<Cliente> clienteOptional = clienteRepository.findById(idCliente);
        if(clienteOptional.isPresent()){
            return clienteOptional.get();
        }else{
            throw new Exception("Não foi encontrado Cliente para o ID: " + idCliente);
        }
    }

}
