package br.biluca.crudcidadecliente.mu.base;

import br.biluca.crudcidadecliente.mu.entity.Sexo;

import java.util.ArrayList;
import java.util.List;

public class SexoBase {

    private static final Sexo MASCULINO = new Sexo ("Masculino", "M");
    private static final Sexo FEMININO = new Sexo ("Feminino", "F");
    private static final Sexo NAO_INFORMAR = new Sexo ("Não Informado", "NI");


    public static List<Sexo> getListaBaseSexo(){
        List<Sexo> listaBaseSexo = new ArrayList<>();
        listaBaseSexo.add(MASCULINO);
        listaBaseSexo.add(FEMININO);
        listaBaseSexo.add(NAO_INFORMAR);
        return listaBaseSexo;
    }

}
