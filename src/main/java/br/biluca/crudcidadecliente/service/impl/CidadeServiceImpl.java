package br.biluca.crudcidadecliente.service.impl;

import br.biluca.crudcidadecliente.model.entity.Cidade;
import br.biluca.crudcidadecliente.persistence.repository.CidadeRepository;
import br.biluca.crudcidadecliente.service.CidadeService;
import br.biluca.crudcidadecliente.service.validation.CidadeValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeServiceImpl implements CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private CidadeValidator cidadeValidator;

    @Override
    public Cidade inserir(Cidade cidade) throws Exception {
        cidadeValidator.validarInsert(cidade);
        return cidadeRepository.save(cidade);
    }

    @Override
    public void deletar(Long idCidade) {
        cidadeRepository.deleteById(idCidade);
    }

    @Override
    public Cidade atualizar(Cidade cidade) throws Exception {
        cidadeValidator.validarUpdate(cidade);
        return cidadeRepository.save(cidade);
    }

    @Override
    public List<Cidade> consultar() {
        return cidadeRepository.findAll();
    }

    @Override
    public List<Cidade> consultarPeloNome(String nomeCidade) {
        return cidadeRepository.consultarPeloNome(nomeCidade);
    }

    @Override
    public List<Cidade> consultarPelaSiglaUnidadeFederativa(String siglaUnidadeFederativa) {
        return cidadeRepository.consultarPelaSiglaUnidadeFederativa(siglaUnidadeFederativa);
    }
}
