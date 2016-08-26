package br.ufjf.dcc171;

public class PrincipalAlternativo {
     public static void main(String[] args) {
        Livro l1 = new Livro("Java com programar", 1977, 50, 123.25F);
        Livro l2 = new Livro("Java com programar 2", 1980, 60, 156.25F);
        System.out.println(l1);
        System.out.println(l2);
    }
}
