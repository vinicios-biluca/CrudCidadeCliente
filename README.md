# CrudCidadeCliente
Projeto Rest Api desenvolvido com base no SpringBoot.

> Ferramentas Utilizadas:
>
> - MySQL
> - Postman
> - Spring Boot
> - JPA 
> - Maven
> - IntelliJ IDEA
>

Para acesso ao Banco de Dados, deverão ser informados no arquivo
[CrudCidadeCliente/src/main/resources/application.properties]
os parametros a seguir:
    
> spring.datasource.url = jdbc:mysql://localhost:3306/[NOME_DO_BANCO]?useSSL=false
> spring.datasource.username = [USERNAME]
>  spring.datasource.password = [PASSWORD]

Para rodar a API basta importar o projeto na IDE de escolha e rodar o comando:
> sudo mvn spring-boot:run


### Projeto Postman para consumo da API (Endpoints + Json Exemplos)
[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/b7b8aeea2086c8aba7e4)

https://documenter.getpostman.com/view/8695520/SWLYCWg4

Alternativo ao Link acima, segue o arquivo de importação em .json para ser utilizado no postman (ProjetoPostMan.postman_collection.json)
