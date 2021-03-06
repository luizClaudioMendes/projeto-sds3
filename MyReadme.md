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

    /* /index.html 200

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


### Passo 3: adicionar Bootstrap e CSS ao projeto
- para adicionar o Bootstrap, para facilicar o desenvolvimento do frontend, executar o comando:
```
yarn add bootstrap
yarn add @popperjs/core@^2.9.2
```

- no arquivo index.tsx, colocar este import, embaixo do reactDOM:
```
(index.tsx) import 'bootstrap/dist/css/bootstrap.css';
```


- Assets e CSS
- na pasta src, criar uma nova pasta com o nome 'assets'
	- dentro do assets, criar uma nova pasta com o nome 'css'
		-	dentro da pasta css, criar um arquivo chamado 'styles.css' e colocar o seguinte codigo:

```css
@import url('https://fonts.googleapis.com/css2?family=Ubuntu:wght@300;400;500;700&display=swap');
:root {
    --color-primary: #FF8400;
}

html, body {
    height: 100%;
    font-family: "Ubuntu", sans-serif;
}

#root {
    display: flex;
    flex-direction: column;
    height: 100%;
}

.content {
    flex: 1 0 auto;
}

.footer {
    flex-shrink: 0;
    text-align: center;
}

.bg-primary {
    background-color: var(--color-primary) !important;
}

.text-primary {
    color: var(--color-primary) !important;
}
```
o import é para colocar uma nova fonte, encontrada no google fonts (https://fonts.google.com/) onde voce pode escolher as fontes e o tamanho e o site gerará o codigo para voce importar

definindo as variaveis:
 --color-primary: #FF8400;
 
 e para usar:
  background-color: var(--color-primary) !important;
  

podem ser definidas quiaisquer variaveis.

este codigo aplica a fonte no projeto todo
html, body {
    height: 100%;
    font-family: "Ubuntu", sans-serif;
}

os css do bootstrap podem ser alterados neste arquivo.


voce pode consultar isso no bootstrap 
https://getbootstrap.com/docs/4.0/utilities/colors/


- agora no arquivo App.tsx e adicionar no h1 do ola mundo, para ele ficar laranja:

```html
<h1 className="text-primary">Olá mundo!</h1>
```

- agora no arquivo index.tsx, como ultimo import, colocar:

```
(index.tsx) import 'assets/css/styles.css';
```
- **COMMIT: Bootstrap**

## componentes do React JS
### Passo 4: adicionar componentes estáticos básicos
onde obtemos a informaçao sobre como montar os componentes?
no site do bootstrap tem exemplos e os componentes como botoes, etc
https://getbootstrap.com/docs/4.0/components/buttons/

os componentes sao o coraçao do react. toda montagem da tela deve ser compostar de componentes, que sao blocos de html, so que tem a sintaxe do JSX.

como criar um componente?
um componente nada mais é do que uma function do javascript que retorna os elementos da tela.
exemplo o App.tsx

o export diz o que fica visivel nos outros componentes.

- Navbar
index.jsx
    
    
    import NavBar from "components/NavBar";
    
    function App() {
      return (
        <div>
          <h1 className="text-primary">Olá mundo!</h1>
          <NavBar />
        </div>
      );
    }
    
    export default App;
    
    
    
    

e no App.tsx para testar:


import NavBar from "components/NavBar";
    
    function App() {
      return (
        <>
          <NavBar />
          <div>
            <h1 className="text-primary">Olá mundo!</h1>
    
          </div>
        </>
      );
    }
    
    export default App;
    
    
    
    
repara que foi necessário colocar o fragment <> e fechar o fragment </>

o retorno da funcao do componente pode ter apenas 1 elemento. para delimitar tudo como um elemento só basta colocar o fragment.




```html
<div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-light border-bottom shadow-sm">
  <div className="container">
    <nav className="my-2 my-md-0 mr-md-3">
      <img src={ImgDsDark} alt="DevSuperior" width="120" />
    </nav>
  </div>
</div>
```
ok. so que o conteudo da pagina ainda esta colado no lado esquerdo da tela, enquanto o navbar esta com um padding.

para consertar isso vamos usar uma classe do bootstrap,
que se chama container, que ele delimitar uma area no meio da tela.

para isso, basta adicionar na div principal, a **className="container"**

pronto.

agora vamos criar o footer.

- do mesmo jeito, na pasta 'components' criar uma pasta chamada 'Footer'.
- nela, criar um arquivo chamado index.tsx e colar o codigo abaixo:

- Footer
```html
<footer className="footer mt-auto py-3 bg-dark">
  <div className="container">
    <p className="text-light">App desenvolvido por <a href="https://github.com/acenelio" target="_blank" rel="noreferrer">Nelio Alves</a></p>
    <p className="text-light"><small><strong>Semana Spring React</strong><br/>
      Evento promovido pela escola DevSuperior: <a href="https://instagram.com/devsuperior.ig" target="_blank" rel="noreferrer">@devsuperior.ig</a></small></p>
  </div>
</footer>
```

index.tsx
    
      const Footer = ()  => {
        return (
            <footer className="footer mt-auto py-3 bg-dark">
      <div className="container">
        <p className="text-light">App desenvolvido por <a href="https://www.linkedin.com/in/luizclaudiomendes" target="_blank" rel="noreferrer">Luiz Mendes</a></p>
        <p className="text-light"><small><strong>Semana Spring React</strong><br/>
          Evento promovido pela escola DevSuperior: <a href="https://instagram.com/devsuperior.ig" target="_blank" rel="noreferrer">@devsuperior.ig</a></small></p>
          <p className="text-light"><small>em maio de 2021</small></p>
      </div>
    </footer>
        );
    }
    
    export default Footer;
    
    

beleza, agora vamos criar o componente da tabela de vendas

- na pasta 'components' criar nova pasta chamada 'DataTable'

index.tsx
    
    
    const DataTable = () => {
      return (
        <div className="table-responsive">
          <table className="table table-striped table-sm">
            <thead>
              <tr>
                <th>Data</th>
                <th>Vendedor</th>
                <th>Clientes visitados</th>
                <th>Negócios fechados</th>
                <th>Valor</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>22/04/2021</td>
                <td>Barry Allen</td>
                <td>34</td>
                <td>25</td>
                <td>15017.00</td>
              </tr>
            </tbody>
          </table>
        </div>
      );
    }
    
    export default DataTable;
    
    
    


com o codigo original:
```html
<div className="table-responsive">
    <table className="table table-striped table-sm">
        <thead>
            <tr>
                <th>Data</th>
                <th>Vendedor</th>
                <th>Clientes visitados</th>
                <th>Negócios fechados</th>
                <th>Valor</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>22/04/2021</td>
                <td>Barry Allen</td>
                <td>34</td>
                <td>25</td>
                <td>15017.00</td>
            </tr>
        </tbody>
    </table>
</div>
```

e incluir no App.tsx o componente da tabela para que possamos ve-la



- **COMMIT: Basic static components**


### Passo 5: adicionar gráficos estáticos
bom agora para os graficos, precisamos instalar umas bibliotecas, a **apexcharts** e a **react-apexcharts**.

elas que vao criar os graficos para nós.

- Apex Charts
```bash
yarn add apexcharts
yarn add react-apexcharts
```

agora vamos criar os componentes, um vai ser o grafico de barras e o outro o grafico de donut

no site do apex charts (https://apexcharts.com/docs/react-charts/) voce encontra os dados e outros graficos.

de novo, seguir os mesmos passos para criar componentes e adicionar o codigo abaixo, lembrando que o codigo abaixo somente sao o mock dos dados:

- BarChart
```javascript
const options = {
    plotOptions: {
        bar: {
            horizontal: true,
        }
    },
};

const mockData = {
    labels: {
        categories: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
    },
    series: [
        {
            name: "% Sucesso",
            data: [43.6, 67.1, 67.7, 45.6, 71.1]                   
        }
    ]
};
```
entao o index.tsx ficará assim, lembrando que ainda estamos com os dados mockados:
    
    
    import Chart from "react-apexcharts";
    
    const BarChart = () => {
        const options = {
            plotOptions: {
                bar: {
                    horizontal: true,
                }
            },
        };
    
        const mockData = {
            labels: {
                categories: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
            },
            series: [
                {
                    name: "% Sucesso",
                    data: [43.6, 67.1, 67.7, 45.6, 71.1]
                }
            ]
        };
    
        return (
            <Chart 
                options={{...options, xaxis: mockData.labels}} 
                series={mockData.series} 
                type="bar" 
                height={240} />
        );
    }
    
    export default BarChart;
    
    
    

e adicionamos no App.tsx o grafico.
fizemos um pequeno truque agora. o grafico ocupara metade da tela, logo como ainda nao fizemos o grafico de donut, vamos colocar o grafico de barras duas vezes:

    
    
    import BarChart from "components/BarChart";
    import DataTable from "components/DataTable";
    import Footer from "components/Footer";
    import NavBar from "components/NavBar";
    
    function App() {
      return (
        <>
          <NavBar />
          <div className="container">
            <h1 className="text-primary py-3">Dashboard de vendas</h1>
            <div className="row px-3">
              <div className="col-sm-6">
                <h5>Todas Vendas</h5>
                <BarChart />
              </div>
              <div className="col-sm-6">
                <h5>Todas Vendas</h5>
                <BarChart />
              </div>
    
            </div>
            <DataTable />
          </div>
          <Footer />
        </>
      );
    }
    
    export default App;
    
    
```

agora vamos criar o grafico de donut, do mesmo jeito que criamos o bar chart:



- DonutChart
```javascript
const mockData = {
    series: [477138, 499928, 444867, 220426, 473088],
    labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
}

const options = {
    legend: {
        show: true
    }
}
```


entao o index.tsx ficou:
    
    import Chart from "react-apexcharts";
    
    const DonutChart = () => {
        const mockData = {
            series: [477138, 499928, 444867, 220426, 473088],
            labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
        }
    
        const options = {
            legend: {
                show: true
            }
        }
    
        return (
            <Chart
                options={{ ...options, labels: mockData.labels }}
                series={mockData.series}
                type="donut"
                height={240} />
        );
    }
    
    export default DonutChart;
    
    


- **COMMIT: Static charts**


### Passo 6: implantação no Netlify

se voce ainda nao tem uma conta no netlify, crie uma agora.

digite no navegador:
netlify.com

- se logue.

o netlify faz deploy continuo, ou seja, quando a branch que eles estiver monitorando alterar, ele irá fazer o build deploy automatico. 

mas agora vamos ao primeiro deploy
- clique no 'new site from git'
- escolha github
- procure o repositorio do projeto
- configure o deploy
- branch: main
  - Comando: yarn build
  - Diretório: build
  - Deploy! (vai quebrar)
  - Site settings -> Build & Deploy: (colocar o nome da sua subpasta do projeto frontend)
  - Site settings -> Domain Management: (colocar o nome que você quiser)
  - Deploys -> Trigger deploy

# Aula 2

## Objetivos do projeto para esta aula
- Implementar o back end
  - Modelo de domínio
  - Estruturar o back end no padrão camadas
  - Consulta paginada de vendas
  - Consultas agrupadas para gráficos
  - Implantação na nuvem

## Checklist

OBS:
comando git para ver o log de commits "encolhido"

 **git log --oneline**
 
 caso voce tenha desinstalado o projeto localmente e queira coloca-lo para funcionar, basta clonar o projeto do github.
 
 no frontend, abra um terminado do git e digite:
 **yarn**
 
 para que ele baixe novamente os node_modules
 
 depois basta digitar
 **yarn start**
 
 para inicializar a aplicacao localmente.
 
 

### Passo 1: configuração de segurança
é preciso liberar o cors para que o front possa acessar o backend. por padrao os navegadores nao permitem que o frontend acesse outros dominios. para isso é preciso liberar o cors.

entao vamos fazer a configuracao de segurança.
este codigo é um codigo padrao do framework.

entao vamos criar uma nova classe, com o nome 'securityConfig' no package config

```java
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private Environment env;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		if (Arrays.asList(env.getActiveProfiles()).contains("test")) {
			http.headers().frameOptions().disable();
		}
		
		http.cors().and().csrf().disable();
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.authorizeRequests().anyRequest().permitAll();
	}

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration().applyPermitDefaultValues();
		configuration.setAllowedMethods(Arrays.asList("POST", "GET", "PUT", "DELETE", "OPTIONS"));
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}
}
```

pronto. agora se acessarmos no navegador o localhost:8080 nao deverá mais exibir aquela tela de login e sim 
*"Whitelabel Error Page
This application has no explicit mapping for /error, so you are seeing this as a fallback."*


- **COMMIT: Security config**

### Passo 2: criar as entidades e o seed do banco

#### application.properties

vamos agora configurar a aplicacao para usar o banco de dados H2.

colocar o codigo abaixo no arquivo application.properties

```
spring.jpa.open-in-view=false

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```
pronto. agora vamos criar um script para popular o banco h2 (em memoria)

#### Seed do banco de dados
em src/main/resources

criar um novo arquivo com nome de data.sql
e colar o codigo abaixo:

```sql
INSERT INTO tb_sellers(name) VALUES ('Logan');
INSERT INTO tb_sellers(name) VALUES ('Anakin');
INSERT INTO tb_sellers(name) VALUES ('BarryAllen');
INSERT INTO tb_sellers(name) VALUES ('Kal-El');
INSERT INTO tb_sellers(name) VALUES ('Padme');

INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,83,66,5501.0,'2021-04-01');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,113,78,8290.0,'2021-03-31');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,36,12,6096.0,'2021-03-30');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,42,22,3223.0,'2021-03-27');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,38,12,15017.0,'2021-03-26');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,88,52,20899.0,'2021-03-21');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,95,66,12383.0,'2021-03-17');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,117,78,10748.0,'2021-03-17');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,114,71,22274.0,'2021-03-15');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,127,96,19284.0,'2021-03-14');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,44,13,6871.0,'2021-03-09');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,49,25,9034.0,'2021-03-05');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,105,84,8114.0,'2021-03-04');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,94,65,21628.0,'2021-03-03');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,97,46,21707.0,'2021-02-28');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,104,71,12652.0,'2021-02-10');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,76,14,19349.0,'2021-02-09');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,154,78,21216.0,'2021-02-08');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,133,88,12561.0,'2021-02-03');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,50,31,15963.0,'2021-01-31');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,137,70,19349.0,'2021-01-25');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,53,33,9103.0,'2021-01-16');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,184,93,12927.0,'2021-01-10');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,35,12,6537.0,'2021-01-08');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,93,55,19890.0,'2021-01-01');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,168,92,6299.0,'2020-12-28');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,48,13,22411.0,'2020-12-26');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,107,67,9788.0,'2020-12-24');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,106,62,18942.0,'2020-12-20');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,40,26,11731.0,'2020-12-18');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,101,68,19882.0,'2020-12-18');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,185,100,14618.0,'2020-12-17');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,82,47,7951.0,'2020-12-15');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,86,45,4147.0,'2020-12-14');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,95,88,12943.0,'2020-12-09');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,75,58,18747.0,'2020-12-02');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,96,50,12624.0,'2020-12-01');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,79,40,14770.0,'2020-11-21');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,73,46,14124.0,'2020-11-20');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,92,58,20953.0,'2020-11-20');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,43,30,9690.0,'2020-11-18');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,58,30,11396.0,'2020-11-14');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,49,14,5119.0,'2020-11-14');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,53,23,8206.0,'2020-11-12');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,49,25,8269.0,'2020-11-10');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,53,29,17984.0,'2020-11-09');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,43,26,3056.0,'2020-11-08');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,51,21,8624.0,'2020-11-06');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,64,41,10959.0,'2020-11-03');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,75,23,15883.0,'2020-10-30');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,51,44,14038.0,'2020-10-27');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,141,81,13535.0,'2020-10-26');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,135,98,17241.0,'2020-10-25');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,116,66,16415.0,'2020-10-19');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,60,44,5329.0,'2020-10-14');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,63,32,16618.0,'2020-10-07');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,176,100,5062.0,'2020-10-01');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,118,45,22235.0,'2020-09-29');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,150,97,14484.0,'2020-09-26');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,115,63,18081.0,'2020-09-24');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,159,88,16101.0,'2020-09-23');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,76,45,11150.0,'2020-09-22');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,65,63,17982.0,'2020-09-09');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,90,68,15927.0,'2020-09-08');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,22,12,9793.0,'2020-09-06');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,19,11,4185.0,'2020-09-05');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,68,21,15541.0,'2020-09-04');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,64,47,7287.0,'2020-09-04');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,153,92,17913.0,'2020-09-04');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,93,53,12648.0,'2020-09-02');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,78,32,12021.0,'2020-08-30');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,94,49,18787.0,'2020-08-29');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,54,28,3974.0,'2020-08-28');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,45,25,5681.0,'2020-08-26');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,11,1,4008.0,'2020-08-14');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,118,80,5218.0,'2020-08-13');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,52,21,21220.0,'2020-08-09');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,127,23,8831.0,'2020-08-06');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,78,23,13900.0,'2020-08-04');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,102,52,22086.0,'2020-08-03');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,54,53,15731.0,'2020-07-31');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,173,93,10816.0,'2020-07-22');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,60,45,17633.0,'2020-07-20');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,138,72,14528.0,'2020-07-19');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,147,96,21582.0,'2020-07-17');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,32,12,9751.0,'2020-07-13');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,83,59,8496.0,'2020-07-08');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,58,48,5283.0,'2020-07-07');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,55,35,20474.0,'2020-07-05');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,84,34,5787.0,'2020-07-01');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,79,68,11976.0,'2020-06-27');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,121,67,18196.0,'2020-06-16');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,26,14,4255.0,'2020-06-14');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,55,42,13249.0,'2020-06-14');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,73,65,20751.0,'2020-06-10');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,47,25,7318.0,'2020-06-04');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,72,60,15608.0,'2020-06-03');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,97,68,8901.0,'2020-06-03');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,68,26,13231.0,'2020-06-02');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,73,53,19476.0,'2020-05-22');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,28,23,20530.0,'2020-05-18');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,83,44,4864.0,'2020-05-13');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,82,43,21753.0,'2020-05-06');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,43,26,7362.0,'2020-05-03');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,54,23,10549.0,'2020-04-28');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,125,84,13333.0,'2020-04-25');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,44,26,7431.0,'2020-04-23');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,46,25,21099.0,'2020-04-19');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,42,28,7217.0,'2020-04-19');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,52,21,10107.0,'2020-04-18');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,121,90,18174.0,'2020-04-17');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,65,14,8095.0,'2020-04-12');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,107,74,11507.0,'2020-04-12');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,140,74,11709.0,'2020-04-09');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,95,91,8288.0,'2020-04-08');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,68,43,17016.0,'2020-04-07');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,21,20,17126.0,'2020-04-03');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,38,15,7957.0,'2020-03-31');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,53,29,20903.0,'2020-03-29');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,19,10,3987.0,'2020-03-28');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,78,34,20795.0,'2020-03-27');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,83,44,4938.0,'2020-03-26');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,32,12,6926.0,'2020-03-13');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,64,33,8193.0,'2020-03-13');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,39,39,10557.0,'2020-03-05');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,158,84,21601.0,'2020-03-02');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,12,6,7625.0,'2020-02-29');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,82,82,22465.0,'2020-02-27');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,68,56,12595.0,'2020-02-17');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,27,13,4636.0,'2020-02-16');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,52,33,10155.0,'2020-02-14');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,142,81,13610.0,'2020-02-13');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,81,45,15306.0,'2020-02-08');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,64,35,17460.0,'2020-02-07');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,48,24,21413.0,'2020-02-03');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,150,82,6505.0,'2020-01-26');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,138,95,7983.0,'2020-01-18');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,70,48,9564.0,'2020-01-16');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,162,84,7302.0,'2020-01-15');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,57,54,9126.0,'2020-01-12');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,78,60,5253.0,'2020-01-06');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,81,53,11553.0,'2020-01-04');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,90,34,16020.0,'2019-12-31');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,57,39,10253.0,'2019-12-28');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,90,53,14398.0,'2019-12-21');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,30,25,16429.0,'2019-12-16');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,58,21,5368.0,'2019-12-13');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,79,12,9928.0,'2019-12-13');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,98,77,8860.0,'2019-12-12');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,100,69,13335.0,'2019-12-09');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,41,21,7009.0,'2019-12-06');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,141,78,6100.0,'2019-12-04');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,52,36,7050.0,'2019-12-02');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,76,51,21591.0,'2019-12-01');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,38,35,19416.0,'2019-11-29');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,54,12,9400.0,'2019-11-26');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,43,25,4854.0,'2019-11-23');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (4,70,51,10740.0,'2019-11-21');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,84,78,6990.0,'2019-11-17');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,126,94,14183.0,'2019-11-17');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,89,89,17044.0,'2019-11-02');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,149,83,20988.0,'2019-11-01');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,139,76,7682.0,'2019-10-31');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,39,14,7996.0,'2019-10-29');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,44,25,5546.0,'2019-10-24');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (5,127,92,12347.0,'2019-10-23');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,53,35,16423.0,'2019-10-20');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (1,14,8,7705.0,'2019-10-16');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (2,71,18,6436.0,'2019-10-07');
INSERT INTO tb_sales(seller_id,visited,deals,amount,date) VALUES (3,78,60,6723.0,'2019-10-07');
```
agora vamos criar as entities

- no projeto criar um novo package chamado entities
- criar uma nova classe chamada '**Seller**'


@Entity
@Table(name = "tb_sallers")
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "seller")
	private List<Sale> sales = new ArrayList<>();
	
	public Seller() {
	}

	public Seller(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	... GETTER AND SETTERS


- criar uma nova classe chamada '**Sale**'


@Entity
@Table(name = "tb_sales")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;

	public Sale() {
	}

	public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	
	...GETTERS AND SETTERS



- **COMMIT: Domain model, database seed**

### Passo 3: Estruturar o projeto em camadas

### Padrão camadas adotado
- Criar repositories
- Criar DTO's
- Criar service
- Criar controller

-criar uma nova package chamada 'repositories'
-criar uma nova interface chamada 'sellerRepository' que deverá extender JpaRepository

    public interface SellerRepository extends JpaRepository<Seller, Long>{
    
    }
    

- criar um novo package chamado 'services'
-criar uma nova classe chamada 'SellerService'
    
@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList())
	}

}
    

- criar um novo package chamado 'dto'
- criar uma nova classe chamada 'SellerDTO'
    
    public class SellerDTO implements Serializable{
    
    	private static final long serialVersionUID = 5717099817218715058L;
    
    	private Long id;
    	private String name;
    	
    	public SellerDTO() {
    	}
    
    	public SellerDTO(Long id, String name) {
    		this.id = id;
    		this.name = name;
    	}
    	
    	public SellerDTO(Seller seller) {
    		id = seller.getId();
    		name = seller.getName();
    	}
    
    	public Long getId() {
    		return id;
    	}
    
    	public void setId(Long id) {
    		this.id = id;
    	}
    
    	public String getName() {
    		return name;
    	}
    
    	public void setName(String name) {
    		this.name = name;
    	}
    
    }
    
    


- criar um novo package chamado 'controllers'
- criar uma nova classe chamada 'SellerController'
    
    @RestController
    @RequestMapping(value = "/sellers")
    public class SellerController {
    	
    	@Autowired
    	private SellerService service;
    	
    	@GetMapping
    	public ResponseEntity<List<SellerDTO>> findAll () {
    		List<SellerDTO> list = service.findAll();
    		
    		return ResponseEntity.ok(list);
    	}
    	
    
    }
    
    
    


pronto. vamos testar e commitar

no navegador, basta colocar :

http://localhost:8080/sellers

que será retornado o json com os resultados.

para testes é melhor usar o postman.

#### como criar enviroments no postman
- clicar em new e selecionar 'enviroments'
- colocar o nome dele
- criar uma variavel chamada host com o valor http://localhost:8080/

pronto. agora para utilizar ele basta 
usar {{host}}/

ex:
{{host}}/sellers

- **COMMIT: Layers**

### Passo 4: Busca paginada de vendas

- Pageable
- page, size, sort
- Evitando interações repetidas ao banco de dados

- criar as classes das camadas anteriores conforme o topico anterior de sales


quando queremos buscar dados paginados, agente deve fazer um response usando o objeto Page, conforme abaixo:
    
    	public Page<SaleDTO> findAll(Pageable pageable) {
    		Page<Sale> result = repository.findAll(pageable);
    		
    		return result.map(x -> new SaleDTO(x));
    	}
    

e o controller:
    
    
    @RestController
    @RequestMapping(value = "/sales")
    public class SaleController {
    	
    	@Autowired
    	private SaleService service;
    	
    	@GetMapping
    	public ResponseEntity<Page<SaleDTO>> findAll (Pageable pageable) {
    		Page<SaleDTO> list = service.findAll(pageable);
    		
    		return ResponseEntity.ok(list);
    	}
    	
    
    }
    
	
o page retorna um objeto especial que dentro dele tem:
- content -- **que é onde tem a lista de resultados**

mais os seguintes objetos:
 "pageable": {
        "sort": {
            "sorted": false,
            "unsorted": true,
            "empty": true
        },
        "offset": 0,
        "pageSize": 20,
        "pageNumber": 0,
        "paged": true,
        "unpaged": false
    },
    "last": false, --** indica se é a ultima pagina**
    "totalPages": 9, -- **total de paginas**
    "totalElements": 170, -- **total de elementos da lista**
    "size": 20, -- **tamanho da pagina**
    "number": 0, -- **numero da pagina**
    "sort": {
        "sorted": false,
        "unsorted": true,
        "empty": true
    },
    "numberOfElements": 20,
    "first": true, --**se é a primeira pagina**
    "empty": false -- **se a lista de resultados esta vazia**

ok. mas e se quisermos consultar a segunda pagina por exemplo?
basta adicionar na requisicao o parametro page

ex:
/sales?page=1

e se quisermos  alterar a quantidade de objetos por pagina?
basta adicionar o parametro size

ex:
/sales?page=1&size=5

e para ordenar por data?
/sales?page=0&size=10&sort=date

e pela data mais antiga?
/sales?page=0&size=10&sort=date,desc

bom neste momento, agente tem um problema.
toda vez que a consulta de sales roda, ele faz um monte de selects de seller desnecessarios (uma para cada seller que existe no BD)

na classe Sale, tem um relacionamento com Seller e o padrao do JPA é ir buscar eles todas as vezes.

existem varias formas de se resolver este problema, mas a mais simples neste caso particular (temos poucos vendedores, se tivessemos muitos nao serviria) é:

- buscar a lista de todos os vendedores antes do select final

ex:
    
    
    public Page<SaleDTO> findAll(Pageable pageable) {
    		sellerRepository.findAll();//solucao do problema de varios selects (somente porque temos poucos vendedores
    		Page<Sale> result = repository.findAll(pageable);
    		
    		return result.map(x -> new SaleDTO(x));
    	}
    
    

- **COMMIT: Pagination**

### Passo 5: Buscas agrupadas (GROUP BY)

- Total de vendas por vendedor
- Taxa de sucesso por vendedor

agora vamos fazer selects especiais, como por exemplo o total de vendas por vendedor, que usaremos para preencher os graficos

a primeira coisa que precisamos preparar é o objeto com o tipo de dados que precisamos retornar

ex:
taxa de sucesso 

entao no front agente precisa de
[
	{
		"sellerName": "Anakin",
		"sum": 13123.0
	},
	{
		"sellerName": "Barry",
		"sum": 13123.0
	}
]

entao precisamos criar no java um DTO com esses dados

SaleSumDTO
    
    public class SaleSumDTO implements Serializable{
    
    	private static final long serialVersionUID = 1946535240281446349L;
    
    	private String sellerName;
    	private Double sum;
    	
    	public SaleSumDTO() {
    	}
    
    	public SaleSumDTO(Seller seller, Double sum) {
    		this.sellerName = seller.getName();
    		this.sum = sum;
    	}
    	
    	..GETTERS AND SETTERS
    


agora no repository agente vai acrescentar um metodo customizado para fazer a consulta

    public interface SaleRepository extends JpaRepository<Sale, Long>{
    
    	@Query("SELECT new com.luizmendes.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount) "
    			+ " FROM Sale AS obj GROUP BY obj.seller")
    	List<SaleSumDTO> amountGroupedBySeller ();
    }
    

e agora criamos os metodos na service e na controller para podermos testar:

[
    {
        "sellerName": "Logan",
        "sum": 220426.0
    },
    {
        "sellerName": "Anakin",
        "sum": 477138.0
    },
    {
        "sellerName": "BarryAllen",
        "sum": 499928.0
    },
    {
        "sellerName": "Kal-El",
        "sum": 444867.0
    },
    {
        "sellerName": "Padme",
        "sum": 473088.0
    }
]


agora vamos fazer a porcentagem de sucesso:

o tipo de objeto que agente vai querer é:

[
	{
		"sellerName": "Anakin",
		"visited": 1000,
		"deals": 800
	},
	.....
]

entao precisamos fazer um DTO com esses dados:
    
    public class SaleSuccessDTO implements Serializable{
    
    	private static final long serialVersionUID = 1946535240281446349L;
    
    	private String sellerName;
    	private Long visited;
    	private Long deals;
    	
    	
    	public SaleSuccessDTO() {
    	}
    
    	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
    		this.sellerName = seller.getName();
    		this.visited = visited;
    		this.deals = deals;
    	}
    
    
    
    	public Long getVisited() {
    		return visited;
    	}
    
    	public void setVisited(Long visited) {
    		this.visited = visited;
    	}
    
    	public Long getDeals() {
    		return deals;
    	}
    
    	public void setDeals(Long deals) {
    		this.deals = deals;
    	}
    
    	public String getSellerName() {
    		return sellerName;
    	}
    
    	public void setSellerName(String sellerName) {
    		this.sellerName = sellerName;
    	}
    	
    }
    
    
    
	
e no repository:
    
    @Query("SELECT new com.luizmendes.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
    			+ " FROM Sale AS obj GROUP BY obj.seller")
    	List<SaleSuccessDTO> successGroupedBySeller ();
    	
    	

pronto:

[
    {
        "sellerName": "Logan",
        "visited": 1495,
        "deals": 684
    },
    {
        "sellerName": "Anakin",
        "visited": 2396,
        "deals": 1028
    },
    {
        "sellerName": "BarryAllen",
        "visited": 3385,
        "deals": 2164
    },
    {
        "sellerName": "Kal-El",
        "visited": 3040,
        "deals": 1958
    },
    {
        "sellerName": "Padme",
        "visited": 3426,
        "deals": 2369
    }
]



- **COMMIT: Group by search**


### Passo 6: Validação no Postgres local

- Criar três perfis de projeto: test, dev, prod
- Gerar script SQL no perfil dev
- Testar projeto no banco Postgres local
------------------------------

- criar um perfil de aplicacao dev com o seguinte conteudo:


#### application-dev.properties
```
#spring.jpa.properties.javax.persistence.schema-generation.create-source=metadata
#spring.jpa.properties.javax.persistence.schema-generation.scripts.action=create
#spring.jpa.properties.javax.persistence.schema-generation.scripts.create-target=create.sql
#spring.jpa.properties.hibernate.hbm2ddl.delimiter=;

spring.datasource.url=jdbc:postgresql://localhost:5432/dsvendas
spring.datasource.username=postgres
spring.datasource.password=1234567

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
spring.jpa.hibernate.ddl-auto=none
```

isto é a configuração do postgres local, considerando que o schema local se chama dsvendas

as 4 linhas comentadas geram o script do banco automaticamente.

nos vamos descomenta-las e rodar a aplicacao novamente, agora no perfil dev

#### application.properties
```
spring.profiles.active=dev

spring.jpa.open-in-view=false
```
ao fazer isso, na raiz do projeto será criado um arquivo sql chamado create.sql

nos abrimos esse arquivo e copiamos o conteudo para o pgadmin executar em nosso bd.

após a execuçao, o melhor é apagar o script no pgadmin para nao correr o risco de executar novamente.

agora vamos popular as tabelas.

pegamos o arquivo data.sql e copiamos o seu conteudo para o pgadmin e executamos o script.

pronto. nosso banco de dados local esta criado e populado.

vamos testar.

voltamos agora e comentamos de novo as 4 linhas no arquivo de dev.

agora vamos criar o arquivo de produçao e colocamos o codigo abaixo:

#### application-prod.properties
```
spring.datasource.url=${DATABASE_URL}
```
esse codigo é o que vai rodar no banco de produçao no heroku.

agora vamos fazer o macete de usar uma variavel de ambiente no application properties.

o que ele faz? ele procura pela variavel e caso nao exista, assume o profile de test

#### application.properties
```
spring.profiles.active=${APP_PROFILE:test}

spring.jpa.open-in-view=false
```

agora vamos criar o arquivo system.properties, que é necessario para a implantaçao no heroku.

ele tem que ser exatamente com esse nome e ele tem que estar na raiz do projeto.

#### system.properties
```
java.runtime.version=11
```
vamos fazer o commit agora

- **COMMIT: First homolog**


### Passo 7: Implantação no Heroku
- Criar app no Heroku
- Provisionar banco Postgres
- Definir variável APP_PROFILE=prod
- Conectar ao banco via pgAdmin
- Criar seed do banco
---------

- se logue na sua conta no heroku e clique no botao 'new' e 'create a new app'

- em app name colocar o nome do projeto no heroku
- regiao deixar US
- clicar em 'create app'

proximo passo é provisionar o BD postgres

- dentro do app criado no heroku, clicar em 'resources' e no campo 'add-ons' procurar por postgres e selecionar 'heroku postgres'

vamos agora definir no heroku a variavel de ambiente APP_PROFILE

- no heroku, na aba 'settings', procurar pelo campo 'config vars' e clicar no botao 'reveal config vars'

ja vai aparecer a variavel DATABASE_URL que foi criada automaticamente com a url do banco de dados do postgres, que ja configuramos no arquivo application-prod.properties

- agora vamos criar uma nova chamada 'APP_PROFILE' com o valor 'prod'

-------

agora vamos nos conectar no banco de produçao via pgAdmin.

para fazer isso, agente pega o valor da variavel DATABASE_URL

nela tem todas as informaçoes para se conectar no BD de prod

ela é composta por:

postgres://
askdjhqwjaskjd     (NOME DE USUARIO)
:
12378971298712376128976 (SENHA)
@
asodjasdkjoj4.ajhasihd9qa.ihqwuihe. (HOST)
:
9090			(PORTA)
/
9kjlj838oijfds (NOME DA BASE DE DADOS)


agora no pgAdmin, clicar com o botao direito em 'servers'
e em 'create a new server'

-colocamos o nome do servidor (que vai aparecer no pgAdmin)
- na aba connections preenchemos com os dados que obtivemos no heroku
	- host
	- maintenance database (nome da database)
	- username
	- password
	- save password (marcar)
- agora na aba 'advanced', em 'db restrictions' colocar novamente o nome da database, porque senao vai aparecer todas as databases que o heroku colocou nesse BD (que nao sao suas tambem)
- salvar

pronto. agora o postgres de prod esta configurado no pgadmin.

agora vamos executar nele os mesmos scripts de create.sql e data.sql

--------------------

agora agente precisa enviar a nossa aplicacao do backend para o heroku.

no terminal, na pasta do projeto (a principal que tem o backend e o frontend):


```bash
heroku -v
heroku login
```
após o procedimento de login no terminal clicar em ctrl + c para sair (se perguntar se deseja sair digite s)

ainda no terminal executar:

```bash
heroku git:remote -a nome do projeto no heroku
git remote -v
git subtree push --prefix backend heroku main
```

este comando "git subtree push --prefix backend heroku main" serve para enviar para o heroku o seu projeto

- 'backend' é o nome da pasta onde esta o backend

no final da publicacao, é exibida a url do projeto ou voce pode ir pelo heroku, no botao 'open app'

ele ira abrir no navegador a url do projeto.

neste momento devera aparecer o erro de white label

com essa url agora podemos configurar o ambiente de produçao no postman e executar as requests para testar.

#Aula 3

## Objetivos do projeto para esta aula
- Integrar back end e front end
- Três pilares do React
  - Componentes
  - Props
  - Estado
- React Hooks
  - useState
  - useEffect
- Libs
  - React Router DOM
  - Axios

### Passo 1: Rotas

- Instalar React Router DOM


**yarn add react-router-dom**

**yarn add @types/react-router-dom -D**


- Criar páginas Home e Dashboard
Home

- dentro da pasta 'src' criar uma nova pasta chamada 'pages' e dentro delas criar duas outras pastas chamadas 'Home' e 'Dashboard'

- dentro de dashboard e home criar um arquivo index.tsx

as paginas nada mais sao do que componentes typescript.
entao sao identicos aos components, mas para uma questao de organizacao e de rotas, nós dividimos elas em pastas separadas.

neste momento elas estarao assim:

home
    
    
    
    const Home = ()  => {
        return (
            <div>
               <h1>Página home</h1>
            </div>
        );
    }
    
    export default Home;
    
    

e Dashboard
    
    const Dashboard = ()  => {
        return (
            <div>
               <h1>Página dashboard</h1>
            </div>
        );
    }
    
    export default Dashboard;
    

pronto.
agora vamos pegar o conteudo que esta no App.tsx e colocar lá no devido lugar

Dashboard
    
    import BarChart from "components/BarChart";
    import DataTable from "components/DataTable";
    import DonutChart from "components/DonutChart";
    import Footer from "components/Footer";
    import NavBar from "components/NavBar";
    
    const Dashboard = () => {
        return (
            <>
                <NavBar />
                <div className="container">
                    <h1 className="text-primary py-3">Dashboard de vendas</h1>
                    <div className="row px-3">
                        <div className="col-sm-6">
                            <h5 className="text-center text-secondary">Taxa de sucesso (%)</h5>
                            <BarChart />
                        </div>
                        <div className="col-sm-6">
                            <h5 className="text-center text-secondary">Todas as Vendas</h5>
                            <DonutChart />
                        </div>
    
                    </div>
                    <div className="py-3">
                        <h2 className="text-primary">Todas as vendas</h2>
                    </div>
                    <DataTable />
                </div>
                <Footer />
            </>
        );
    }
    
    export default Dashboard;
    

e no App.tsx, o retorno que esta vazio agora, ele vai virar um componente que nos vamos criar que será o Routes

----------

- Criar arquivo de rotas `Routes.tsx`

- na raiz do projeto (src), vamos criar o Routes.tsx

este arquivo routes vai definir as rotas do sistema

no retorno dele vamos usar um componente do react DOM chamado BrowserRoutes, como abaixo:
    
    
    import Dashboard from "pages/Dashboard";
    import Home from "pages/Home";
    import { BrowserRouter, Route, Switch } from "react-router-dom";
    
    const Routes = () => {
        return (
            <BrowserRouter>
                <Switch>
                    <Route path="/" exact>
                        <Home/>
                    </Route>
                    <Route path="/dashboard">
                        <Dashboard/>
                    </Route>
                </Switch>
            </BrowserRouter>
        );
    }
    
    export default Routes;
    

vamos testar

- **COMMIT: Routes**


### Passo 2: Página Home e navegações

a pagina home tem uma apresentaçao mais bonita.

```html
<div className="container">
    <div className="jumbotron">
        <h1 className="display-4">DSVendas</h1>
        <p className="lead">Analise o desempenho das suas vendas por diferentes perspectivas</p>
        <hr/>
        <p>Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.</p>
    </div>
</div>
```

ela devera ficar desta forma:

    
    import Footer from "components/Footer";
    import NavBar from "components/NavBar";
    
    const Home = () => {
        return (
            <>
                <NavBar />
                <div className="container">
                    <div className="jumbotron">
                        <h1 className="display-4">DSVendas</h1>
                        <p className="lead">Analise o desempenho das suas vendas por diferentes perspectivas</p>
                        <hr />
                        <p>Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.</p>
                    </div>
                </div>
                <Footer />
            </>
        );
    }
    
    export default Home;
    

agora vamos criar um botao para levar para o dashboard:




- Fazer um link na Home para Dashboard

para fazer esse link usaremos um link na pagina home, que parecerá um botao:
    
    <Link className="btn-primary btn-lg" to="/dashboard"> 
                            Acessar o Dashboard
                        </Link>
    
  
  
entao a home ficará assim:
    
    
    import Footer from "components/Footer";
    import NavBar from "components/NavBar";
    import { Link } from "react-router-dom";
    
    const Home = () => {
        return (
            <>
                <NavBar />
                <div className="container">
                    <div className="jumbotron">
                        <h1 className="display-4">DSVendas</h1>
                        <p className="lead">Analise o desempenho das suas vendas por diferentes perspectivas</p>
                        <hr />
                        <p>Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.</p>
                        <Link className="btn-primary btn-lg" to="/dashboard"> 
                            Acessar o Dashboard
                        </Link>
                    </div>
                </div>
                <Footer />
            </>
        );
    }
    
    export default Home;
    

- Fazer um link na NavBar para Home

agora na navbar, no lugar onde temos a imagem escrita 'devsuperior' vamos colocar um link para voltar para a home:
    
    import ImgDsDark from 'assets/img/ds-dark.svg'
    import { Link } from 'react-router-dom';
    const NavBar = () => {
        return (
            <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-light border-bottom shadow-sm">
                <div className="container">
                    <nav className="my-2 my-md-0 mr-md-3">
                        <Link to="/">
                            <img src={ImgDsDark} alt="DevSuperior" width="120" />
                        </Link>
                    </nav>
                </div>
            </div>
        );
    }
    
    export default NavBar;
    


vamos testar


- **COMMIT: Home, navigation**


### Passo 3: First request
o axios é uma biblioteca bem simples para fazer requisiçoes

- Instalar Axios
```bash
yarn add axios
```
- Definir BASE_URL
a BASE_URL é o endereço do backend. entao vamos defini-la e tambem a possibilidade de colocar tambem o do heroku.

- entao em 'src', vamos criar uma pagina chamada 'utils'
- dentro dela criar um arquivo chamado 'requests.ts'

este arquivo é somente .ts e nao .tsx como os outros. o .ts nao sao componentes react

requests.ts
    
    export const BASE_URL = 'http://localhost:8080'
    

agora vamos lembrar o que o endpoint do grafico de rosca, /amount-by-sellers

ao chamar esse endpoint ele retornara uma lista de objetos com atributo de sellerName e Sum.

- Definir tipo local ChartData em DonutChart

entao em 'src', vamos criar uma nova pasta chamada 'types' e vamos criar nela um novo arquivo chamado 'sale.ts'

sale.ts
    
    
    export type SaleSum =  {
        sellerName: string,
        sum: number
    }
    

agora vamos definir o tipo do chartData. 

dentro do arquivo index.tsx, em DonutChart, antes da function (**const DonutChart = () => {**)  vamos definir o tipo do chartData assim (vai estar da forma errada, sem os hooks):

    
    
    import axios from "axios";
    import Chart from "react-apexcharts";
    import { BASE_URL } from "utils/requests";
    
    type ChartData = {
        labels: string[];
        series: number[];
    }
    
    const DonutChart = () => {
    
        //FORMA ERRADA
        let chartData: ChartData = { labels: [], series: [] }
    
        //FORMA ERRADA
        axios.get(`${BASE_URL}/sales/amount-by-seller`)
            .then(response => {
                console.log(response.data)
            })
    
        const options = {
            legend: {
                show: true
            }
        }
    
        return (
            <Chart
                options={{ ...options, labels: chartData.labels }}
                series={chartData.series}
                type="donut"
                height={240} />
        );
    }
    
    export default DonutChart;
    
    
    



esta chamada é assincrona. o problema desta implementaçao o get usa a estrutura de promise.

**o problema é que ele esta chamado a request mais de uma vez.** mas porque?

**o componente grafico de um componente web tem um ciclo de vida que ele vai rendenrizar mais de uma vez, passando na logica mais de uma vez e fazendo a requisicao varias vezes desnecessariamente**

o grafico trabalha com dados diferentes dos que sao retornados na API. ele trabalha com series e com labels.

entao precisamos colocar um map no get do axios:
    
    
    import axios from "axios";
    import Chart from "react-apexcharts";
    import { SaleSum } from "types/sale";
    import { BASE_URL } from "utils/requests";
    
    type ChartData = {
        labels: string[];
        series: number[];
    }
    
    const DonutChart = () => {
    
        //FORMA ERRADA
        let chartData: ChartData = { labels: [], series: [] }
    
        //FORMA ERRADA
        axios.get(`${BASE_URL}/sales/amount-by-seller`)
            .then(response => {
                const data = response.data as SaleSum[];
                const myLabels = data.map(x => x.sellerName);
                const mySeries = data.map(x => x.sum);
    
                chartData = { labels: myLabels, series: mySeries }
                console.log(chartData)
            });
    
        const options = {
            legend: {
                show: true
            }
        }
    
        return (
            <Chart
                options={{ ...options, labels: chartData.labels }}
                series={chartData.series}
                type="donut"
                height={240} />
        );
    }
    
    export default DonutChart;
    


- Definir tipo SaleSum

- Fazer a requisição e tratar os dados

- **COMMIT: First request**



### Passo 4: DonutChart integration

agora precisamos usar os hooks.

o useState mantem o estado do componente.
embora os dados estejam na variavel, o grafico nao aparece porque ele nao pegou os dados atualizados, por causa do ciclo de vida.

o js chama o componente e antes de ele receber os dados ele ja montou a tela vazia.

para corrigir isso, precisamos usar o useState:
    
    
    import axios from "axios";
    import { useState } from "react";
    import Chart from "react-apexcharts";
    import { SaleSum } from "types/sale";
    import { BASE_URL } from "utils/requests";
    
    type ChartData = {
        labels: string[];
        series: number[];
    }
    
    const DonutChart = () => {
    
        const [chartData, setChartData] = useState<ChartData>( {labels: [], series: []});
    
        //FORMA ERRADA
        axios.get(`${BASE_URL}/sales/amount-by-seller`)
            .then(response => {
                const data = response.data as SaleSum[];
                const myLabels = data.map(x => x.sellerName);
                const mySeries = data.map(x => x.sum);
    
                setChartData({labels: myLabels, series: mySeries })
                console.log(chartData)
            });
    
        const options = {
            legend: {
                show: true
            }
        }
    
        return (
            <Chart
                options={{ ...options, labels: chartData.labels }}
                series={chartData.series}
                type="donut"
                height={240} />
        );
    }
    
    export default DonutChart;
    


desta forma parece ter resolvido o problema, mas nao, criou outro pior.

**a request entrou em loop infinito!**

no componente react tem mais um detalhe do ciclo de vida.
quando voce usa o useState, quando voce atualiza o valor dele o componente vai verificar se houve atualizacao de valor e passa novamente pela logica, que altera o valor e faz o componente verificar novamente, entrando em loop infinito.

a chamada do axios ainda esta da forma errada.

temos que fazer um controla para que a logica seja executada somente uma vez, quando é instanciada.

mas como fazer isso?

usando o outro hook, o useEffect

o useEffect recebe 2 argumentos, o primeiro a funcao que se quer executar, no nosso caso a chamada do axios, e no segundo o componente que se quer observar. ainda neste caso, nao queremos que ele observe ninguem entao colocamos um array vazio ([])
    
    import axios from "axios";
    import { useEffect, useState } from "react";
    import Chart from "react-apexcharts";
    import { SaleSum } from "types/sale";
    import { BASE_URL } from "utils/requests";
    
    type ChartData = {
        labels: string[];
        series: number[];
    }
    
    const DonutChart = () => {
    
        const [chartData, setChartData] = useState<ChartData>({ labels: [], series: [] });
    
    
        useEffect(() => {
            axios.get(`${BASE_URL}/sales/amount-by-seller`)
                .then(response => {
                    const data = response.data as SaleSum[];
                    const myLabels = data.map(x => x.sellerName);
                    const mySeries = data.map(x => x.sum);
    
                    setChartData({ labels: myLabels, series: mySeries })
                });
        }, []);
    
    
    
        const options = {
            legend: {
                show: true
            }
        }
    
        return (
            <Chart
                options={{ ...options, labels: chartData.labels }}
                series={chartData.series}
                type="donut"
                height={240} />
        );
    }
    
    export default DonutChart;
    


pronto. agora sim esta correto!

```
Hook: useState
Manter estado no componente
```
```
Hook: useEffect
Executar algo na instanciação ou destruição do componente, observar estado
```

- **COMMIT: DonutChart integration**

### Passo 5: BarChart integration
vamos começar criando uma funcao auxiliar para arredondar o numero

- Definir função auxiliar round:
- dentro da pasta 'utils', criar um novo arquivo chamado 'format.ts' e dentro dele colocar este codigo:

```javascript
export const round = (value: number, precision: number) => {
    var multiplier = Math.pow(10, precision || 0);
    return Math.round(value * multiplier) / multiplier;
}
```

- Definir tipo SaleSuccess
este é o tipo da API retornado no endpoint /sales/success-by-seller

ex:
     {
            "sellerName": "Logan",
            "visited": 1495,
            "deals": 684
        }
	
entao no arquivo sale.ts vamos adicionar o novo type:

export type SaleSum =  {
    sellerName: string,
    sum: number
}

export type SaleSuccess =   {
    sellerName: string,
    visited: number,
    deals: number
}


- Definir tipo local ChartData em BarChart

no barchart é necessario fazer o mesmo procedimento que fizemos no donut chart, no inicio declarar o type do dado que vem da API, conforme abaixo:
    
    import axios from "axios";
    import { useEffect, useState } from "react";
    import Chart from "react-apexcharts";
    import { SaleSuccess } from "types/sale";
    import { round } from "utils/format";
    import { BASE_URL } from "utils/requests";
    
    type SeriesData = {
        name: string;
        data: number[];
    }
    
    type CharData = {
        labels: {
            categories: string[]
        };
        series: SeriesData[];
    }
    
    const BarChart = () => {
    
        const [chartData, setChartData] = useState<CharData>( {
            labels: {
                categories: []
            },
            series: [
                {
                    name: "",
                    data: []
                }
            ]
        });
    
        useEffect(() => {
            axios.get(`${BASE_URL}/sales/success-by-seller`)
                .then(response => {
                    const data = response.data as SaleSuccess[];
                    const myLabels = data.map(x => x.sellerName);
                    const mySeries = data.map(x => round(100 * x.deals / x.visited, 1));
    
                    setChartData({
                        labels: {
                            categories: myLabels
                        },
                        series: [
                            {
                                name: "% sucesso",
                                data: mySeries
                            }
                        ]
                    })
                });
        }, []);
    
        const options = {
            plotOptions: {
                bar: {
                    horizontal: true,
                }
            },
        };
    
        return (
            <Chart 
                options={{...options, xaxis: chartData.labels}} 
                series={chartData.series} 
                type="bar" 
                height={240} />
        );
    }
    
    export default BarChart;
    


- **COMMIT: BarChart integration**


### Passo 6: DataTable integration

- Instalar date-fns ao projeto
```bash
yarn add date-fns
```
- Criar tipos Seller, Sale, SalePage
na pasta de types, criar um novo arquivo chamado de 'seller.ts'

export type Seller =  {
    id: number;
    name: string;
}

e no arquivo sale.ts adicionar o type de sale e o de salePage:

import { Seller } from "./seller"

export type Sale = {
    id: number;
    visited: number;
    deals: number;
    amount: number;
    date: string;
    seller: Seller
}

export type SalePage = {
    content: Sale[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    number: number;
    size: number;
    first: boolean;
    numberOfElements: number;
    empty: boolean;
}

export type SaleSum =  {
    sellerName: string;
    sum: number;
}

export type SaleSuccess =   {
    sellerName: string;
    visited: number;
    deals: number;
}


- Criar função auxiliar formatLocalDate
no arquivo format.ts vamos adicionar o codigo abaixo:

```javascript
export const formatLocalDate = (date: string, pattern: string) => {
    const dt = new Date(date);
    const dtDateOnly = new Date(dt.valueOf() + dt.getTimezoneOffset() * 60 * 1000);
    return format(dtDateOnly, pattern);
}
```

e ele vai ficar assim:
    
    import { format } from 'date-fns'
    
    export const round = (value: number, precision: number) => {
        var multiplier = Math.pow(10, precision || 0);
        return Math.round(value * multiplier) / multiplier;
    }
    
    export const formatLocalDate = (date: string, pattern: string) => {
        const dt = new Date(date);
        const dtDateOnly = new Date(dt.valueOf() + dt.getTimezoneOffset() * 60 * 1000);
        return format(dtDateOnly, pattern);
    }
    
    agora vamos fazer a integraçao dos types no Datatable, que vai ficar assim:
    
    import axios from "axios";
    import { useEffect, useState } from "react";
    import { SalePage } from "types/sale";
    import { formatLocalDate } from "utils/format";
    import { BASE_URL } from "utils/requests";
    
    const DataTable = () => {
    
      const [page, setPage] = useState<SalePage>({
        first: true,
        number: 0,
        totalElements: 0,
        totalPages: 0,
        last: true
      });
    
      useEffect(() => {
        axios.get(`${BASE_URL}/sales?page=0&size=20&sort=date,desc`)
          .then(response => {
            setPage(response.data);
          })
      }, [])
      return (
        <div className="table-responsive">
          <table className="table table-striped table-sm">
            <thead>
              <tr>
                <th>Data</th>
                <th>Vendedor</th>
                <th>Clientes visitados</th>
                <th>Negócios fechados</th>
                <th>Valor</th>
              </tr>
            </thead>
            <tbody>
              {page.content?.map(item => (
                <tr key={item.id}>
                  <td>{formatLocalDate(item.date, "dd/MM/yyyy")}</td>
                  <td>{item.seller.name}</td>
                  <td>{item.visited}</td>
                  <td>{item.deals}</td>
                  <td>{item.amount.toFixed(2)}</td>
                </tr>
              ))
              }
            </tbody>
          </table>
        </div>
      );
    }
    
    export default DataTable;
    

- **COMMIT: DataTable integration**

### Passo 7: Pagination

para fazer um componente de paginaçao vamos usar as Props
```
Props
Argumentos que um componente React pode receber
```

- Criar componente Pagination
criar um novo componente chamado de 'Pagination' e o 'index.tsx'

```html
<div className="row d-flex justify-content-center">
    <nav>
        <ul className="pagination">
            <li className="page-item">
                <button className="page-link">Anterior</button>
            </li>
            <li className="page-item disabled">
                <span className="page-link">1</span>
            </li>
            <li className="page-item disabled">
                <button className="page-link">Próxima</button>
            </li>
        </ul>
    </nav>
</div>
```
ele vai ficar assim:
    
    import { SalePage } from "types/sale";
    
    type Props = {
        page: SalePage;
        onPageChange: Function;
    }
    
    const Pagination = ({ page, onPageChange } : Props) => {
    
        return (
            <div className="row d-flex justify-content-center">
                <nav>
                    <ul className="pagination">
                        <li className={`page-item ${page.first ? 'disabled': ''}`}>
                            <button className="page-link" onClick={() => onPageChange(page.number - 1)}>Anterior</button>
                        </li>
                        <li className="page-item disabled">
                            <span className="page-link">{page.number + 1}</span>
                        </li>
                        <li className={`page-item ${page.last ? 'disabled': ''}`}>
                            <button className="page-link" onClick={() => onPageChange(page.number + 1)}>Próxima</button>
                        </li>
                    </ul>
                </nav>
            </div>
        )
    }
    
    export default Pagination;

e alteramos o datatable para usar o pagination:
    
    import axios from "axios";
    import Pagination from "components/Pagination";
    import { useEffect, useState } from "react";
    import { SalePage } from "types/sale";
    import { formatLocalDate } from "utils/format";
    import { BASE_URL } from "utils/requests";
    
    const DataTable = () => {
    
      const [activePage, setActivePage] = useState(0);
    
      const [page, setPage] = useState<SalePage>({
        first: true,
        number: 0,
        totalElements: 0,
        totalPages: 0,
        last: true
      });
    
      useEffect(() => {
        axios.get(`${BASE_URL}/sales?page=${activePage}&size=20&sort=date,desc`)
          .then(response => {
            setPage(response.data);
          })
      }, [activePage]);
    
      const changePage = (index: number) => {
        setActivePage(index);
      }
      return (
        <>
          <Pagination page={page} onPageChange={changePage}/>
          <div className="table-responsive">
            <table className="table table-striped table-sm">
              <thead>
                <tr>
                  <th>Data</th>
                  <th>Vendedor</th>
                  <th>Clientes visitados</th>
                  <th>Negócios fechados</th>
                  <th>Valor</th>
                </tr>
              </thead>
              <tbody>
                {page.content?.map(item => (
                  <tr key={item.id}>
                    <td>{formatLocalDate(item.date, "dd/MM/yyyy")}</td>
                    <td>{item.seller.name}</td>
                    <td>{item.visited}</td>
                    <td>{item.deals}</td>
                    <td>{item.amount.toFixed(2)}</td>
                  </tr>
                ))
                }
              </tbody>
            </table>
          </div>
        </>
      );
    }
    
    export default DataTable;
    



- **COMMIT: Pagination**


Agora, abrimos o Heroku e clicamos para abrir o nosso projeto no navegador.

pegamos o link do projeto de produçao

abrimos o netlify, entramos no projeto, em site settings,
build e deploy e procuramos por 'enviroment variables'

criamos a variavel BACKEND_URL e colocamos a url do heroku.

no projeto frontend, no arquivo requests.ts, colocamos:

export const BASE_URL = process.env.REACT_APP_BACKEND_URL ?? 'http://localhost:8080'

se essa variavel nao estiver definida, ele ira para o localhost mas em prod ele ira para o heroku.


