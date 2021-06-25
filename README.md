# ProjetoBemobi
Programa criado para a resolução de um case, proposto em uma das etapas do Programa de Estagio Tech, promovido pela Bemobi.

### Abrir Aplicação

  Acesse o link https://www.eclipse.org/downloads/
  Escolha seu sistema operacional e a IDE eclipse JEE e siga clicando em next.

  Instalar JDK 8+: https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html

  Clone este repositório: https://github.com/leojrs/ProjetoBemobi.git

  Em seguida, abra o eclipse -> File -> Import -> Projects from git -> cole a URL

# Demonstração

  Rode a classe Principal
  
   Informe o caminho onde está seu arquivo .txt junto com o nome:
  ![image](https://user-images.githubusercontent.com/58714316/123477251-2413ea00-d5d4-11eb-9e12-1e8182c6a617.png)
  
  Em seguida, indique a pasta destino e o nome desejado para seu .txt:
  ![image](https://user-images.githubusercontent.com/58714316/123477796-ee233580-d5d4-11eb-9f3a-91ad580194ee.png)

  Sua pasta ficará desta forma no fim do processo:
  
  ![image](https://user-images.githubusercontent.com/58714316/123477991-3b070c00-d5d5-11eb-99b6-5d88e4ffce34.png)
  
  Abra o .txt criado e visualize a resolução do case !!
  
  # Case
  
  A Bemobi precisa de uma aplicação para analisar os logs que contém os registros de mudança de status dos usuários de um novo serviço. Em cada linha do log há um identificador do usuário e seu status (“cancelado” ou “assinado”).
  
Exemplo de registros encontrados no log:

55211298371229 cancelado

56389428347834 assinado

52211298371229 assinado  

55757575756432 cancelado

56121298371289 cancelado

Os dois primeiros dígitos do identificador do usuário representam seu país de origem:

Brasil - 55

Chile - 56 

México - 52

Seu programa receberá o arquivo de log via stdin, que poderá conter milhares de linhas, e precisará no final do processo gerar um novo arquivo informando as respostas paras as seguintes perguntas:

1 - Quantos usuários usaram o serviço em cada país?

2 - Quantos usuários ativos (cujo último status foi “assinado”) existem em cada país?

Exemplo de resposta esperada no novo arquivo:

Brasil, 2, 0

Chile, 2, 1

México, 1, 1


Onde a primeira coluna identifica o país de origem, a segunda coluna a quantidade de usuários em cada país e a terceira coluna a quantidade de usuários ativos em cada país.
   
