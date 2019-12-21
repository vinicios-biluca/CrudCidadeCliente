package br.biluca.crudcidadecliente.service.impl;

import br.biluca.crudcidadecliente.mu.entity.Cidade;
import br.biluca.crudcidadecliente.pu.repository.CidadeRepository;
import br.biluca.crudcidadecliente.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeServiceImpl implements CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Override
    public Cidade inserir(Cidade cidade) {
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
