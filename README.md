# Bolão Copa 2018
 
Uma implementação de um sistema web para apostas de bolão.

### Requisitos

   * instalar o MySQL e setar a senha do usuário root como *root* 
   * instalar o play-framwork (na essência, instalar o sbt... consulte o site) 

### Executar o projeto
   * clonar esse repositório via o git 
   * criar o banco de dados 'bolao' no mysql > create database bolao;
   * para criar a base de dados: mysql -u <username> -p bolao < bolao.sql
   * para criar um novo jogo no mysql: insert into game values (0, "Brasil x Japão", "2018-07-07 19:00:00", "Maracanã");
   * executar o sbt (isso no diretório raiz do projeto)                                                             
   * no shell do sbt, executar "run" 
   * acessar o projeto em http://localhost:9000  
 
