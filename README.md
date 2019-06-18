						MongoDB2Spring



Aplicação spring usando banco MongoDB.



Passos para testes:

________________________________

Deve fazer o checkout desse projeto (mongoDB2Spring) e seguir o passo abaixo:

git checkout https://github.com/farzac/mongoDB2Spring.git /n
cd mongoDB2Spring
sudo chmod 777 mvnw
./mvnw spring-boot:run


________________________________


Após checkout do projeto no github, será preciso pegar imagem do docher que contém o servidor MongoDB

docker run -i -t --net="host" zaccantte/ubuntu-16.04-case-srbr




________________________________


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


________________________________









