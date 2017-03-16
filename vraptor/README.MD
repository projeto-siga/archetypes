1. Execute o seguinte comando no diretório do projeto siga para criar um novo projeto e defina o nome do projeto.

```
c:\Trabalhos\Repositorios\siga\> mvn archetype:generate -DarchetypeGroupId=projeto-siga -DarchetypeArtifactId=siga-vraptor -DarchetypeVersion=1.0 -DgroupId=projeto-siga -Dpackage=br.jus.trf2 -DarchetypeRepository=%HOME%\.m2\repository

...
...
...


Define value for property 'artifactId': : novo-projeto   <--- informe o nome do novo projeto

```

2. Faça um build.

```
c:\Trabalhos\Repositorios\siga\> mvn clean package
```

3. Faça deploy (ou importe na IDE) e acesse:

```
página principal - http://servidor/novo-projeto/app/principal
API - http://servidor/novo-projeto/api/v1/info
Informações da API - http://servidor/novo-projeto/api/v1/swagger.json
```
