package br.ufjf.dcc171;

public class PrincipalAlternativo {
     public static void main(String[] args) {
        Livro l1 = new Livro("Java com programar", 1977, 50, 123.25, "Eu3");
        Livro l2 = new Livro("Java com programar 2", 1980, 60, 156.25, "Eu4");
        System.out.println(l1);
        System.out.println(l2);
    }
}
