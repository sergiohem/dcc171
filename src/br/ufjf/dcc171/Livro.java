package br.ufjf.dcc171;

public class Livro {
    private String titulo;
    private Integer ano;
    private Integer paginas;
    private Double preco;
    private String autor;
    
    public Livro() {
    }

    public Livro(String titulo, Integer ano, Integer paginas, Double preco, String autor) {
        this.titulo = titulo;
        this.ano = ano;
        this.paginas = paginas;
        this.preco = preco;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", ano=" + ano + ", paginas=" + paginas + ", preco=" + preco + '}';
    }
}
