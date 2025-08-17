package br.com.aluracursos.literalura.dto;

public class DadosAutorDTO {
    private String nome;
    private Integer anoNascimento;
    private Integer anoFalecimento;

    public DadosAutorDTO() {}

    public DadosAutorDTO(String nome, Integer anoNascimento, Integer anoFalecimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.anoFalecimento = anoFalecimento;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Integer getAnoFalecimento() {
        return anoFalecimento;
    }

    public void setAnoFalecimento(Integer anoFalecimento) {
        this.anoFalecimento = anoFalecimento;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "Nome='" + nome + '\'' +
                ", Ano de Nascimento=" + anoNascimento +
                ", Ano de Falecimento=" + anoFalecimento +
                '}';
    }
}