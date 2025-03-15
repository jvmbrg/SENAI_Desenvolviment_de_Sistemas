public class Livro {
    private String titulo;
    private String autor;
    private Integer numeroPaginas;
    private Double preco;
   
    public Livro(String titulo, String autor, Integer numeroPaginas, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return 
        "Titulo: " + titulo + "\n" +
        "Autor: " + autor + "\n" + 
        "Número de páginas: " + numeroPaginas + "\n" +
        "Preço: R$ " + preco;
    }
    
}

