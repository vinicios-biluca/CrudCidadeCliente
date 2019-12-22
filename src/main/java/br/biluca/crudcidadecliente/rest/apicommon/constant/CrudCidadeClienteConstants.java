package br.biluca.crudcidadecliente.rest.apicommon.constant;

public class CrudCidadeClienteConstants {

    public static final String API_CRUD_CIDADE_CLIENTE_V1 = "/api/crudcidadecliente/v1";

    private static final String PATH_ID = "/{id}";

    private static final String INSERIR = "/inserir";
    private static final String CONSULTAR = "/consultar";
    private static final String DELETAR = "/deletar";
    private static final String ATUALIZAR = "/atualizar";

    public static final String CIDADE = "/cidade";
    public static final String CIDADE_INSERIR = CIDADE + INSERIR;
    public static final String CIDADE_DELETAR =  CIDADE + DELETAR;
    public static final String CIDADE_ATUALIZAR = CIDADE + ATUALIZAR;
    public static final String CIDADE_CONSULTAR = CIDADE + CONSULTAR;
    public static final String CIDADE_CONSULTAR_NOME = CIDADE + "/consultarpelonome";
    public static final String CIDADE_CONSULTAR_SIGLA_UF = CIDADE + "/consultarpelasiglaunidadefederativa";

    public static final String CLIENTE = "/cliente";
    public static final String CLIENTE_INSERIR = CLIENTE + INSERIR;
    public static final String CLIENTE_DELETAR = CLIENTE + DELETAR + PATH_ID;
    public static final String CLIENTE_ATUALIZAR = CLIENTE + ATUALIZAR;
    public static final String CLIENTE_CONSULTAR_ID = CLIENTE + PATH_ID;
    public static final String CLIENTE_CONSULTAR = CLIENTE + CONSULTAR;
    public static final String CLIENTE_CONSULTAR_NOME = CLIENTE + "/consultarpelonome";


    public static final String DADOS_BASE = "/dadosbase";

    public static final String SEXO = "/sexo";
    public static final String SEXO_CONSULTAR = SEXO + CONSULTAR;

    public static final String UNIDADE_FEDERATIVA = "/unidadefederativa";
    public static final String UNIDADE_FEDERATIVA_CONSULTAR = UNIDADE_FEDERATIVA + CONSULTAR;

}


