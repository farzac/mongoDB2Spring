# mongoDB2Spring
Aplicação spring usando banco MongoDB


Para testes, será preciso utilizar o Postman

https://www.getpostman.com/downloads/

Feito o download do Postan, informar o seguinte endereço:



http://localhost:8080/api/clientes

Para Gravar os dados, usar no body do Postman:
{
  "id" : "123",
	"name": "fulando",
	"email": "fulano@gmail"
}

Para consultar os dados, passar o link acima usando o GET


Para deletar os dados, passar o link abaixo no Postman usando o Delete

http://localhost:8080/api/clientes/123
