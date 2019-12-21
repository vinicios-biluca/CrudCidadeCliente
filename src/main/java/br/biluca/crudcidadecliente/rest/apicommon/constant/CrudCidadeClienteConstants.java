package br.biluca.crudcidadecliente.rest.apicommon.constant;

public class CrudCidadeClienteConstants {

    public static final String CONSULTAR = "/consultar";

    public static final String API_CRUD_CIDADE_CLIENTE_V1 = "/api/crudcidadecliente/v1";

    public static final String CIDADE = "/cidade";
    public static final String CIDADE_CONSULTAR = CIDADE + CONSULTAR;
    public static final String CIDADE_CONSULTAR_NOME = CIDADE + "/consultarpelonome";
    public static final String CIDADE_CONSULTAR_SIGLA_UF = CIDADE + "/consultarpelasiglaunidadefederativa";

    public static final String CLIENTE = "/cliente";
    public static final String CLIENTE_CONSULTAR = CLIENTE + CONSULTAR;
    public static final String CLIENTE_CONSULTAR_NOME = CLIENTE + "/consultarpelonome";

    public static final String DADOS_BASE = "/dadosbase";

    public static final String SEXO = "/sexo";
    public static final String SEXO_CONSULTAR = SEXO + CONSULTAR;

    public static final String UNIDADE_FEDERATIVA = "/unidadefederativa";
    public static final String UNIDADE_FEDERATIVA_CONSULTAR = UNIDADE_FEDERATIVA + CONSULTAR;

}

