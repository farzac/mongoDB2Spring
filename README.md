						MongoDB2Spring


							
                                                        
																				
																				

Aplicação Crud no banco MongoDB em spring utilizando API Rest com Swagger.


Segue abaixo os passos para execução dos testes:

________________________________

Deve fazer o checkout desse projeto (mongoDB2Spring) e seguir o passo abaixo:

git checkout https://github.com/farzac/mongoDB2Spring.git

cd mongoDB2Spring

sudo chmod 777 mvnw

./mvnw spring-boot:run


________________________________


Após checkout do projeto no github, será preciso pegar imagem do docher que contém o servidor MongoDB

docker run -i -t --net="host" zaccantte/ubuntu-16.04-case-srbr



________________________________


Para testes, utilizar interface do Swagger informando o seguinte endereço:


http://localhost:8080/swagger-ui.html#/



________________________________

Documentos de referência:


https://www.youtube.com/watch?v=dkMSHEpJGYQ


https://www.youtube.com/watch?v=qtHUwMqOYC0







