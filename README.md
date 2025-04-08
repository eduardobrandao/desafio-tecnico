# desafio-tecnico

No cooperativismo, cada associado possui um voto e as decisões são tomadas em assembleias, por votação. 
A partir disso, você precisa criar uma solução back-end para gerenciar essas sessões de votação.
Essa solução deve promover as seguintes funcionalidades através de uma API REST:
- Cadastrar uma nova pauta;
- Abrir uma sessão de votação em uma pauta (a sessão de votação deve ficar aberta por um tempo determinado na chamada de abertura ou 1 minuto por default);
- Receber votos dos associados em pautas (os votos são apenas 'Sim'/'Não'. Cada associado é identificado por um id único e pode votar apenas uma vez por pauta.
- Contabilizar os votos e dar o resultado da votação na pauta.
É importante que as pautas e os votos sejam persistidos e que não sejam perdidos com o restart da aplicação.

## Technologies

- [Git](https://git-scm.com)
- [Java 17](https://www.oracle.com/br/java/technologies/javase/jdk17-archive-downloads.html)
- [Sprint Boot 3.4.4](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/download.cgi)
- [PostgreSQL](https://www.postgresql.org/download/)
- [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)
- [Eclipse](https://www.eclipse.org/downloads/) *Alternative IDE for IntelliJ IDEA*
- [Postman](https://www.postman.com/downloads/)
- [Insomnia](https://insomnia.rest/download) *Alternative for Postman*



## Desenvolvido
- Criação de uma pauta.
- Após a criação da pauta, daí podemos entrar na votação da pauta.
- Foi feito a validação de que cada associado só pode votar uma unica vez por pauta.

##Passo a passo para testar a aplicação.
- Depois de iniciar a aplicação acesse esse link do Swagger http://localhost:8080/swagger-ui/index.html.
- Em seguida dê inicio criando uma pauta.
- em seguida você pode votar SIM ou NÂO para a pauta.
- Para saber se algumas validações estão acontecendo, tente votar novamente na mesma pauta, é para tomar um erro 500 no log vai estar descrito que você não pode votar duas vezes na mesma pauta


  ## Pendente fazer:
  - Teste unitário, (não se trata de justificativa, mais comecei a fazer muito tarde, e só conseguir fazer essa parte se tivesse mais tempo eu terminaria todas as tarefas bonus.
  - Um README melhor, pois foi muito em cima da hora. 
