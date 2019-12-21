package br.biluca.crudcidadecliente.service.impl;

import br.biluca.crudcidadecliente.mu.entity.UnidadeFederativa;
import br.biluca.crudcidadecliente.pu.repository.UnidadeFederativaRepository;
import br.biluca.crudcidadecliente.service.UnidadeFederativaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadeFederativaServiceImpl implements UnidadeFederativaService {

    @Autowired
    private UnidadeFederativaRepository unidadeFederativaRepository;

    @Override
    public List<UnidadeFederativa> consultar() {
        return unidadeFederativaRepository.findAll();
    }
}
