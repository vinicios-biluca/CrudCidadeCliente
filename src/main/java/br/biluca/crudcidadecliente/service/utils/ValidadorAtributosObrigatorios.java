package br.biluca.crudcidadecliente.service.utils;

import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ValidadorAtributosObrigatorios {

    private List<String> atributosNulos = new ArrayList<>();

    public ValidadorAtributosObrigatorios add(String descricaoAtributo, Object atributo) {
        Boolean isNullorEmpty = Boolean.FALSE;

        if (atributo instanceof Collection<?>) {
            isNullorEmpty = isCollectionNullOrEmpty(atributo);
        } else if (atributo instanceof CharSequence) {
            isNullorEmpty = isStringNullOrEmpty(atributo);
        } else {
            isNullorEmpty = Objects.isNull(atributo);
        }

        if (isNullorEmpty) {
            atributosNulos.add(descricaoAtributo);
        }
        return this;
    }

    public void validar() throws Exception {
        String mensagemErros = getMensagemErros();
        if (mensagemErros.length() > 0) {
            throw new Exception(mensagemErros);
        }
    }

    private String getMensagemErros() {
        StringBuilder stringBuilder = new StringBuilder();
        if (Objects.nonNull(this.atributosNulos) && this.atributosNulos.size() > 0) {
            stringBuilder.append("Os Atributos: ");
            for (String atributo : this.atributosNulos) {
                stringBuilder.append(atributo);
                stringBuilder.append(", ");
            }
            stringBuilder.append("Devem ser informados obrigatoriamente!");
        }
        return stringBuilder.toString();
    }

    private boolean isStringNullOrEmpty(Object atributo) {
        CharSequence atrinbutoCS = (CharSequence)atributo;
        return Objects.isNull(atrinbutoCS) || atrinbutoCS.toString().trim().isEmpty();
    }

    private boolean isCollectionNullOrEmpty(Object atributo) {
        return Objects.isNull(atributo) || ((Collection<?>) atributo).isEmpty();
    }

}
