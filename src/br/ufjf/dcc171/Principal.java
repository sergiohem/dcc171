package br.ufjf.dcc171;

public class Principal {

    public static void main(String[] args) {
        Livro l1 = new Livro("Java com programar", 1977, 50, 123.25, "Eu");
        Livro l2 = new Livro("Java com programar 2", 1980, 60, 156.25, "Eu2");
        System.out.println("Livros disponiveis: ");
        System.out.println(l1.getTitulo());
        System.out.print(l1.getAno());
        System.out.print(l1.getPaginas() + " pgs ");
        System.out.println("R$ " + l1.getPreco());
        System.out.println(l1.toString());
    }
    
}
