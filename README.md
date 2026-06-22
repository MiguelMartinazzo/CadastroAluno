# CadastroAluno

O **CadastroAluno** é um sistema desenvolvido em **Java** utilizando a IDE **BlueJ**.

O projeto tem como objetivo realizar o cadastro e gerenciamento de alunos, aplicando conceitos de **programação orientada a objetos**, **herança**, **interface gráfica**, **interface via console**, **tratamento de exceções** e **manipulação de arquivos**.

## Sobre o Projeto

Este projeto foi desenvolvido com fins acadêmicos para praticar conceitos fundamentais da linguagem Java.

A aplicação permite trabalhar com dados de alunos, como nome, idade, RA, curso e nota. O sistema possui classes responsáveis por cadastro, inserção, remoção, carregamento e salvamento de informações.

O projeto também possui duas formas principais de execução:

- Interface via console;
- Interface gráfica utilizando Swing/AWT.

## Funcionalidades

- Cadastro de alunos;
- Inserção de alunos;
- Remoção de alunos;
- Listagem de registros;
- Interface gráfica;
- Interface via console;
- Salvamento de dados em arquivo;
- Carregamento de dados de arquivo;
- Validação de idade;
- Validação de nota;
- Tratamento de dados incorretos;
- Uso de herança entre classes;
- Organização em pacote `model`.

## Tecnologias Utilizadas

- Java
- BlueJ
- Swing
- AWT
- Programação Orientada a Objetos
- Manipulação de arquivos texto

## Estrutura do Projeto

```text
CadastroAluno
├── model
│   ├── Aluno.java
│   ├── NomePessoa.java
│   ├── Pessoa.java
│   ├── TestaAluno.java
│   ├── TestaNome.java
│   ├── TestaPessoa.java
│   ├── TestaTexto.java
│   └── Texto.java
├── Botao.java
├── ButtonHandler.java
├── Cadastro.java
├── CadastroGrafico.java
├── CarregarArquivo.java
├── DadosIncorretosException.java
├── IdadeException.java
├── InsereAluno.java
├── InterfaceConsole.java
├── InterfaceGrafica.java
├── NotaException.java
├── RemoveAluno.java
├── SalvarArquivo.java
├── package.bluej
└── README.md
``
