
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


