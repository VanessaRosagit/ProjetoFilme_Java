# ProjetoFilme_Java
Projeto de Filmes - Trabalho P1 (POO)
Olá! Este é o meu projeto para a P1 da disciplina Desenvolvimento para servidores. Criei um sistema simples em Java para gerenciar dados de filmes, usando as informações de um banco de dados do IMDb.

📌 O que foi feito no projeto?
Apliquei os conceitos de Programação Orientada a Objetos (POO) aprendidos em aula:

Classes e Objetos: Criei as classes para representar a estrutura e instanciei os objetos no código.

Encapsulamento: Coloquei todos os atributos como private e criei os métodos getters e setters.

Herança: A classe Filme herda da classe Midia, e a classe FilmePremiado herda da classe Filme.

Construtores: Criei construtores para inicializar os dados dos filmes na memória.

Sobrecarga de Método: Criei duas opções do método exibeDetalhes() para escolher se mostro ou não o gênero do filme.

Reescrita de Método (@Override): Reescrevi o método exibeDetalhes() nas classes filhas para personalizar as informações que aparecem na tela.

📁 Estrutura das Classes
Midia: Classe base com as informações principais (id, titulo, ano, notaImdb).

Filme: Herda de Midia e adiciona diretor e genero.

FilmePremiado: Herda de Filme e adiciona a quantidade de oscars.

Main: Classe onde rodo os testes para mostrar o funcionamento.
