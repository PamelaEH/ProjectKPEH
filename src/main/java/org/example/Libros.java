package org.example;

public class Libros {
    private String codigo;
    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private String categoria;
    private String numerodeejemplares;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNumerodeejemplares() {
        return numerodeejemplares;
    }

    public void setNumerodeejemplares(String numerodeejemplares) {
        this.numerodeejemplares = numerodeejemplares;
    }
}
