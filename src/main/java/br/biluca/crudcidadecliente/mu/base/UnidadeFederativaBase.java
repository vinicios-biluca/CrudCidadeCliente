package br.biluca.crudcidadecliente.mu.base;

import br.biluca.crudcidadecliente.mu.entity.UnidadeFederativa;

import java.util.ArrayList;
import java.util.List;

public class UnidadeFederativaBase {

    private static final UnidadeFederativa ACRE = new UnidadeFederativa("Acre", "AC");
    private static final UnidadeFederativa ALAGOAS = new UnidadeFederativa("Alagoas", "AL");
    private static final UnidadeFederativa AMAPA = new UnidadeFederativa("Amapá", "AP");
    private static final UnidadeFederativa AMAZONAS = new UnidadeFederativa("Amazonas", "AM");
    private static final UnidadeFederativa BAHIA = new UnidadeFederativa("Bahia", "BA");
    private static final UnidadeFederativa CEARA = new UnidadeFederativa("Ceará", "CE");
    private static final UnidadeFederativa DISTRITO_FEDERAL = new UnidadeFederativa("Distrito Federal", "DF");
    private static final UnidadeFederativa ESPIRITO_SANTO = new UnidadeFederativa("Espírito Santo", "ES");
    private static final UnidadeFederativa GOIAS = new UnidadeFederativa("Goiás", "GO");
    private static final UnidadeFederativa MARANHAO = new UnidadeFederativa("Maranhão", "MA");
    private static final UnidadeFederativa MATO_GROSSO = new UnidadeFederativa("Mato Grosso", "MT");
    private static final UnidadeFederativa MATO_GROSSO_SUL = new UnidadeFederativa("Mato Grosso do Sul", "MS");
    private static final UnidadeFederativa MINAS_GERAIS = new UnidadeFederativa("Minas Gerais", "MG");
    private static final UnidadeFederativa PARA = new UnidadeFederativa("Pará", "PA");
    private static final UnidadeFederativa PARAIBA = new UnidadeFederativa("Paraíba", "PB");
    private static final UnidadeFederativa PARANA = new UnidadeFederativa("Paraná", "PR");
    private static final UnidadeFederativa PERNAMBUCO = new UnidadeFederativa("Pernambuco", "PE");
    private static final UnidadeFederativa PIAUI = new UnidadeFederativa("Piauí", "PI");
    private static final UnidadeFederativa RIO_JANEIRO = new UnidadeFederativa("Rio de Janeiro", "RJ");
    private static final UnidadeFederativa RIO_GRANDE_NORTE = new UnidadeFederativa("Rio Grande do Norte", "RN");
    private static final UnidadeFederativa RIO_GRANDE_SUL = new UnidadeFederativa("Rio Grande do Sul", "RS");
    private static final UnidadeFederativa RONDONIA = new UnidadeFederativa("Rondônia", "RO");
    private static final UnidadeFederativa RORAIMA = new UnidadeFederativa("Roraima", "RR");
    private static final UnidadeFederativa SANTA_CATARINA = new UnidadeFederativa("Santa Catarina", "SC");
    private static final UnidadeFederativa SAO_PAULO = new UnidadeFederativa("São Paulo", "SP");
    private static final UnidadeFederativa SERGIPE = new UnidadeFederativa("Sergipe", "SE");
    private static final UnidadeFederativa TOCANTINS = new UnidadeFederativa("Tocantins", "TO");


    public static List<UnidadeFederativa> getListBaseUnidadeFederativa() {
        List<UnidadeFederativa> listBaseUnidadeFederativa = new ArrayList<>();
        listBaseUnidadeFederativa.add(ACRE);
        listBaseUnidadeFederativa.add(ALAGOAS);
        listBaseUnidadeFederativa.add(AMAPA );
        listBaseUnidadeFederativa.add(AMAZONAS);
        listBaseUnidadeFederativa.add(BAHIA );
        listBaseUnidadeFederativa.add(CEARA );
        listBaseUnidadeFederativa.add(DISTRITO_FEDERAL);
        listBaseUnidadeFederativa.add(ESPIRITO_SANTO);
        listBaseUnidadeFederativa.add(GOIAS );
        listBaseUnidadeFederativa.add(MARANHAO );
        listBaseUnidadeFederativa.add(MATO_GROSSO );
        listBaseUnidadeFederativa.add(MATO_GROSSO_SUL );
        listBaseUnidadeFederativa.add(MINAS_GERAIS);
        listBaseUnidadeFederativa.add(PARA );
        listBaseUnidadeFederativa.add(PARAIBA);
        listBaseUnidadeFederativa.add(PARANA );
        listBaseUnidadeFederativa.add(PERNAMBUCO);
        listBaseUnidadeFederativa.add(PIAUI );
        listBaseUnidadeFederativa.add(RIO_JANEIRO);
        listBaseUnidadeFederativa.add(RIO_GRANDE_NORTE);
        listBaseUnidadeFederativa.add(RIO_GRANDE_SUL);
        listBaseUnidadeFederativa.add(RONDONIA );
        listBaseUnidadeFederativa.add(RORAIMA);
        listBaseUnidadeFederativa.add(SANTA_CATARINA);
        listBaseUnidadeFederativa.add(SAO_PAULO );
        listBaseUnidadeFederativa.add(SERGIPE);
        listBaseUnidadeFederativa.add(TOCANTINS);
        return listBaseUnidadeFederativa;
    }

}
