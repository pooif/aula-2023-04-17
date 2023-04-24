package br.edu.ifrs.riogrande.tads.poo;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import br.edu.ifrs.riogrande.tads.poo.dominio.Autor;
import br.edu.ifrs.riogrande.tads.poo.dominio.Categoria;
import br.edu.ifrs.riogrande.tads.poo.dominio.Editora;
import br.edu.ifrs.riogrande.tads.poo.dominio.Endereco;
import br.edu.ifrs.riogrande.tads.poo.dominio.ISBN;
import br.edu.ifrs.riogrande.tads.poo.dominio.Livro;

class App {
  public static void main(String[] args) {
    
    Endereco end = new Endereco(
      "Alfredo Huch, 475", 
      "Centro", 
      "Rio Grande");

    Editora edit = new Editora("TADS editora", end);

    ISBN isbn = new ISBN("1234567890123");

    Autor autor = new Autor(
      "Marcio", 
      "Mais um programador", 
      LocalDate.of(1976, 10, 25));

    Livro livro = new Livro(
      isbn, 
      "POO", 
      List.of(autor), 
      edit,
      Categoria.AVENTURA);

    // Navegar no Grafo de Objetos (Traverse)
    // Cidade do Endereço da Editora do Livro
    System.out.println(livro.getEditora().getEndereco().getCidade());

    // Bio do primeiro Autor do Livro
    System.out.println(livro.getAutores().get(0).getBio());
  }  
}
