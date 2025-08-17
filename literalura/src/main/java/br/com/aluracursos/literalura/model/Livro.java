package br.com.aluracursos.literalura.model;

import br.com.aluracursos.literalura.dto.DadosLivroDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String idioma;
    private Integer numeroDownloads;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    // Construtor padrão JPA
    public Livro() {}

    // Construtor para criar um livro a partir dos dados da API Gutendex
    public Livro(DadosLivroDTO dadosLivroDTO, Autor autor) {
        this.titulo = dadosLivroDTO.titulo();
        this.idioma = (dadosLivroDTO.idiomas() != null && !dadosLivroDTO.idiomas().isEmpty())
                ? dadosLivroDTO.idiomas().get(0)
                : "desconhecido";
        this.numeroDownloads = dadosLivroDTO.numeroDownloads();
        this.autor = autor;
    }

    // Construtor adicional (caso queira criar manual ou em testes)
    public Livro(String titulo, String idioma, Integer numeroDownloads, Autor autor) {
        this.titulo = titulo;
        this.idioma = idioma;
        this.numeroDownloads = numeroDownloads;
        this.autor = autor;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Integer getNumeroDownloads() {
        return numeroDownloads;
    }
    public void setNumeroDownloads(Integer numeroDownloads) {
        this.numeroDownloads = numeroDownloads;
    }

    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", idioma='" + idioma + '\'' +
                ", numeroDownloads=" + numeroDownloads +
                ", autor=" + (autor != null ? autor.getNome() : "desconhecido") +
                '}';
    }
}