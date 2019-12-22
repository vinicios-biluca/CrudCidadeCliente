package br.biluca.crudcidadecliente.service.impl;

import br.biluca.crudcidadecliente.model.base.SexoBase;
import br.biluca.crudcidadecliente.model.base.UnidadeFederativaBase;
import br.biluca.crudcidadecliente.model.entity.Sexo;
import br.biluca.crudcidadecliente.model.entity.UnidadeFederativa;
import br.biluca.crudcidadecliente.persistence.repository.SexoRepository;
import br.biluca.crudcidadecliente.persistence.repository.UnidadeFederativaRepository;
import br.biluca.crudcidadecliente.service.DadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DadosServiceImpl implements DadosService {

    @Autowired
    private SexoRepository sexoRepository;

    @Autowired
    private UnidadeFederativaRepository unidadeFederativaRepository;

    @Override
    public String estabelecerBaseDados() {

        List<Sexo> listaBaseSexo = SexoBase.getListaBaseSexo();
        List<UnidadeFederativa> listBaseUnidadeFederativa = UnidadeFederativaBase.getListBaseUnidadeFederativa();

        inserirListaBaseSexo(listaBaseSexo);
        inserirListaBaseUnidadeFederetiva(listBaseUnidadeFederativa);

        return "Foram adicionados os Dados Base para a Aplicação";
    }

    private void inserirListaBaseUnidadeFederetiva(List<UnidadeFederativa> listBaseUnidadeFederativa) {
        for (UnidadeFederativa unidadeFederativa:listBaseUnidadeFederativa) {
            unidadeFederativaRepository.save(unidadeFederativa);
        }

    }

    private void inserirListaBaseSexo(List<Sexo> listaBaseSexo) {
        for (Sexo sexo:listaBaseSexo) {
            sexoRepository.save(sexo);
        }
    }
}
