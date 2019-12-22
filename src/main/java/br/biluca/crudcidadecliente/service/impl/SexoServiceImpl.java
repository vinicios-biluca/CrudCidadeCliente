package br.biluca.crudcidadecliente.service.impl;

import br.biluca.crudcidadecliente.model.entity.Sexo;
import br.biluca.crudcidadecliente.persistence.repository.SexoRepository;
import br.biluca.crudcidadecliente.service.SexoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SexoServiceImpl implements SexoService {

   @Autowired
   private SexoRepository sexoRepository;

    @Override
    public List<Sexo> consultar() {
        return sexoRepository.findAll();
    }
}
