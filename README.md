# tp3fundamentosjava
Elaboração de sistema de cadastro de alunos e notas, verificando a média e o status do aluno, além de exibição dos dados dos cadastrado e o encerramento do sistema.

Para este TP3 foi utilizado SO Windows 10, Apache Netbeans IDE 12.1 e JDK 14.

## Java Development Kit
Kit necessário para que o desenvolvimento do sistema no ambiente, sendo estes JDK 8 ou superior juntamente | Eclipse IDE for Java EE Developers ou Apache Netbeans IDE.

###### 1. Preparativos - instalando.
Instale o JDK, preferível realizar o download pelo site da Oracle, lembre-se de escolher o link de acordo com o seu sistema operacional vigente. 
Após o download, execute o instalador. Iniciará pela tela de Boas-vindas, verifique o diretório onde será instalado e anote-o em algum bloco de notas. Clique em "next" e a instalação será iniciada.

###### 1.1 Preparativos - configurando JDK (variáveis de ambiente de sistema).
Inicie em "Meu Computador", posteriormente clique em "Configurações Avançadas de Sistema" e, por fim, "Variáveis de Ambiente". Ou como alternativa, no espaço de pesquisa da barra de ferramentas de seu windows, pesquise por "Editar variáveis de ambiente do sistema" que chegará no mesmo ponto. 

Em seguida, com a tela das variáveis, vamos iniciar a configuração. Abrirá a janela com dois espaços separados, o primeiro referente as variáveis do usuário e o segundo sobre as variáveis do sistema. Trabalharemos no segundo espaço.<br/>

**PRIMEIRO PASSO - EDITAR PATH**<br/>
a. Procure "PATH" na primeira coluna (chamada "Variável") e clique em "Editar". <br/>
b. Com a tela de "Editar variáveis do sistema" aberta, clique em "Novo" e abrirá um espaço para você digitar o comando.<br/>
c. Digite exatamente o seguinte comando, sem aspas: "path=%JAVA_HOME%\bin" e clique em OK.<br/>

**SEGUNDO PASSO - CRIAR UMA NOVA VARIÁVEL**<br/>
Vamos criar uma nova variável, lembre-se que estamos trabalhando com o segundo espaço referente as variáveis do sistema.<br/>
a. Clique em "Novo".<br/>
b. Configure da seguinte forma: em nome da variável, digite (sem aspas): "JAVA_HOME".<br/>
c. Em "Valor da variável", vocês devem colocar o DIRETÓRIO DO JDK, como informei anteriormente para anotar.Clique em "OK".<br/>

**TERCEIRO PASSO - CRIAR UMA SEGUNDA VARIÁVEL**<br/>
a. Clique em "Novo".<br/>
b. Configure da seguinte forma: em nome da variável, digite (sem aspas): "CLASSPATH".<br/>
c. Em "Valor da variável", digite (sem aspas): " %JAVA_HOME%;." e clique em OK.<br/>

**QUARTO PASSO - VERIFICAÇÃO**<br/>
Para verificar se está tudo dentro do esperado, vamos utilizar o CMD do sistema operacional. Digite CMD no seu espaço de busca do Windows e abra o Prompt de Comando.<br/>
a. Digite (sem aspas): "javac". Informará as informações do Java instalado, sendo as últimas informações os comandos possíveis para utilização.<br/>
b. Posteriormente, digite (sem aspas): "java -version". Informará sua versão instalada, verifique se todas as versões estão de acordo com as que foram instaladas por você.<br/>
