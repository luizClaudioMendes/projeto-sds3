# Semana spring react - devsuperior

## instalação windows
### java jdk 11
instalação do java jdk zulu
https://www.azul.com/downloads/zulu-community/

1. baixar o arquivo zip da versao 11 e descompactar na pasta pretendida.

2. configurar as variaveis de ambiente
2.1 na barra de pesquisa do windows, digitar var e abrir as variaveis do sistema.

2.2 clicar na aba avançado, variaveis de sistema

2.3 clicar em novo e dar o nome da variavel
**JAVA_HOME**

2.4 o valor da variavel é o local onde foi descompactado o zip
**c:\programFiles......**

2.5 localizar a variavel path e editar
2.6 clicar em novo e copiar e colar a localizacao onde esta o zip mais \bin

e pronto.

2.6 no cmd, digitar java -version e deve aparecer a versao do java.

### STS 
em https://spring.io/
1. baixar o sts

2. extrair os arquivos 

3. abrir o arquivo contents.zip e descompactar

4. executar o sts

### Postman
1. digitar no navegador *getpostman*

2. fazer o download do postman

3. basta executar o programa.

### Postgresql e pgAdmin
1. no google, digitar **postgresql download windows**
1.2 abrir https://www.postgresql.org/download/windows/

2. clicar no botao de download installer
2.1 neste exemplo vamos usar a versao 12

3. executar o arquivo de instalaçao
3.1 instalar:
- postgresql server
- pgAdmin 4
- stack builder
- command line tools

4. criar uma senha padrao para o superusuario da maquina local
**1234567**

5. porta **5432**

6. para ver se o servidor postgres esta rodando (ele roda como um serviço do windows)
6.1 na pesquisa do windows digitar serviços
6.2 na lista devera estar **postgressql** e devera estar em **execuçao**.

**testar o pgAdmin**
1. na pesquisa do windows digitar **pgAdmin** e o programa devera aparecer

2. colocar a senha de superusuario
**1234567**

### instalar Heroku CLI
1. digitar no google heroku cli download
https://devcenter.heroku.com/articles/heroku-cli

2. baixar o arquivo de instalação
3. executar o instalador

4. deixar marcado:
- heroku cli 7.42.13
- set PATH to heroku
- add %LOCALAPPDATA%

5. para testar se esta funcionando, no cmd digitar:
**heroku -v**

### instalar NPM
1. digitar no google npm download
https://nodejs.org/en/download/

2. baixar o instalador do windows

3. executar o instalador

4. instalar chocolate

5. para testar: 
5.1 no cmd digitar:
**npm -v**

### instalar VS code no windows
1. digitar no google **vs code install windows**

2. baixar o instalador

3. executar o instalador
3.1 deixar marcado a opçao
**"adicione em PATH"**

### instalar o git no windows
1. digitar no google git download
https://git-scm.com/downloads

2. baixar o instalador
3. executar o instalador

4. para testar, basta em qualquer pasta clicar com o botao direito e deve aparercer: 
**git bash here**


## Aula 1
>  *Crie um app inédito para seu portfólio com as tecnologias mais demandadas do mercado*

## Realização
[DevSuperior - Escola de programação](https://devsuperior.com.br)

## Objetivos do projeto para esta aula
- Criar projetos backend e frontend
- Salvar os projeto no Github em monorepo (tanto o projeto do frontend quanto do banckend vai ficar no mesmo repositorio)
- Montar o visual estático do front end
- Publicar o front end no Netlify

## Checklist
- Projeto que vamos desenvolver
o projeto que vamos desenvolver se chama dsvendas, é um projeto  de analise de vendas com dashboard, com rodapé e cabeçalho, com o backend hospedado no heroku. 
no dashboard vai ter graficos de barras e de donut e uma tabela paginada.

- Conferir ferramentas
  - *Dica: extensões do VS Code*
  	- Color Highlight
	- CSS formatter
	- ESLint
	- JSX HTML <tags/>
	- Markdown preview Github
	- Red Hat Commons
	- Visual Studio IntelliCode
	- XML
	
- Criar pastas do projeto
o projeto deverá estar nesta config:

**pasta de trabalho**(workspace)
|---->**projeto-sds3**
|########|----> **backend**
|########|----> **frontend**

- Conferir Yarn
no terminal que usamos com o git, na pasta do projeto (projeto-sds3) digitar:
**yarn -v**

deverá aparecer a versao do yarn.

caso nao apareça, no mesmo terminal, digite:
**npm install - -global yarn**

o que é o yarn? é um gerenciador de dependencias e build, similar ao maven, só que para o frontend.
ele é concorrente do npm


### Passo 1: criar projetos
- Criar projeto ReactJS com `create-react-app`:
com este comando, ele irá criar o projeto com uma estrutura básica que vai ajudar na inicio do projeto.

basta executar:
```bash
npx create-react-app frontend --template typescript
```
OBS:
 -> frontend -- é o nome da projeto
 -> template typescript -- é o template do typescript, pois vamos usar a linguagem do typescript como base do projeto.*

**Lembrete**: excluir repositório .git do projeto ReactJS

para verificar se o projeto esta funcionando, podemos:

1. no terminal do git, dentro da pasta frontend
1.1 dar o comando:
`**yarn start**```

1.2 no navegador, basta acessar http://localhost:3000 e veremos a tela incial do react

para terminar o programa basta clicar em **ctrl + c**

---------------------
o projeto do backend será irmao do projeto frontend.

- Criar projeto Spring Boot no `Spring Initializr` com as seguintes opçoes:
	- maven project
	- java
	- spring boot 2.4.5
	- group: com.devsuperior
	- artifact: dsvendas
	- packaging: jar
	- java: 11 

e com as seguintes dependências:
  - spring Web
  - Spring Data JPA
  - H2 database
  - PostgreSQL driver
  - Spring Security

o spring intializr gera o projeto como .zip, basta descompactar na pasta do projeto.

a pasta descompactada, renomear para 'backend'

abrir o STS e importar o projeto como um 'existing maven project'

  OBS: **Se tiver com erro no pom.xml**, tentar:
  - **Botão direito no projeto -> Maven -> Update project (force update)**
  - **Menu Project -> Clean**
  - **Apagar pasta .m2 e deixar o STS refazer o download**
  
  ----------------------------
  
- **COMMIT: Project created**

- *Lembrete: ver extensões e arquivos ocultos*

- Como salvar o projeto no seu Github

na pasta do projeto, no terminal do git:

caso o seu usuario nao esteja configurado, executar os comandos :

**git config --global user.name "seu nome"**
**git config --global user.email "seu.email@email.com"**

para inicializar a pasta no controle de versao do git:

**git init**

**git add .**

**git commit -m "Project created"**

**git remote add origin  https://github.com/blablabla/projeto-sds3.git**

**git push -u origin main**

para verificar as configs do git basta executar o comando:
**git config --list**

### Passo 2: "limpar" o projeto ReactJS
Limpar projeto ReactJS / tsconfig.json para deixar o projeto o mais simples possivel, sem lixo

- abrir um terminal na pasta 'frontend'
- executar o comando:
**yarn start** para inicializar o projeto

- abrir o projeto no VSCode
- na pasta 'public' deixar apenas os arquivos index.html e favicon.ico e apagar todo o resto
- no arquivo index.html, limpar os comentarios, alterar a mensagem do 'noscript' para portugues, colocar o titulo da aplicaçao e a descriçao e trocar a lang de en para pt_BR

arquivo index.html
```html
<!DOCTYPE html>
<html lang="pt_BR">
  <head>
    <meta charset="utf-8" />
    <link rel="icon" href="%PUBLIC_URL%/favicon.ico" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="theme-color" content="#000000" />
    <meta
      name="description"
      content="Este app foi desenvolvido na Semana Spring React"
    />
    <title>DSVendas</title>
  </head>
  <body>
    <noscript>Voce precisa habilitar o javascript para executar este aplicativo.</noscript>
    <div id="root">
      <!-- aqui que a aplicação react executa o aplicativo-->
    </div>
  </body>
</html>
```
- na pasta 'src', apagar os arquivos:
	- App.test.tsx
	- App.css
	- index.css
	- logo.svg
	- reportWebVitals.ts
	- setupTests.ts

- agora abrir o arquivo tsconfig.json, que é um arquivo que tem varias configuraçoes para oritentar sobre como o typescript vai ser compilado

- dentro do campo 'compilerOptions, inserir:
"baseUrl": "./src",

    {
      "compilerOptions": {
        "baseUrl": "./src",
        "target": "es5",
    	...

isto ira orientar o typescript que todos os arquivos que serao compilados estarao na pasta src

-salvar o arquivo e fechar o arquivo

- Criar o Arquivo '_redirects' , na pasta 'public' com o seguinte conteúdo:

**/* /index.html 200**

este arquivo é necessario para que ele funcione corretamente no netlify

- abrir o arquivo App.tsx e limpar e deixar desta forma:

```javascript
function App() {
  return (
    <div>
      <h1>Olá mundo!</h1>
    </div>
  );
}

export default App;


```
no arquivo index.tsx deixar desta forma:
```javascript

import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';

ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);


```

- para testar, basta subir a aplicacao pelo yarn e deverá aparecer "olá mundo"


- **COMMIT: Project clean**
