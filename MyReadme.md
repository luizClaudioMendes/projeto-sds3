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