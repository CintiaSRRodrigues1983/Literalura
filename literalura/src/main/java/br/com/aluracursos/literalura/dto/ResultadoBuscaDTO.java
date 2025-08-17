package br.com.aluracursos.literalura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * DTO para mapear o objeto de resposta da API Gutendex.
 * O campo 'results' do JSON é mapeado para 'resultados'.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultadoBuscaDTO {

    @JsonAlias("results")
    private List<DadosLivroDTO> resultados;

    public ResultadoBuscaDTO() {}

    public ResultadoBuscaDTO(List<DadosLivroDTO> resultados) {
        this.resultados = resultados;
    }

    public List<DadosLivroDTO> getResultados() {
        return resultados;
    }

    public void setResultados(List<DadosLivroDTO> resultados) {
        this.resultados = resultados;
    }

    /**
     * Método utilitário para verificar se existem resultados.
     */
    public boolean temResultados() {
        return resultados != null && !resultados.isEmpty();
    }

    @Override
    public String toString() {
        return "ResultadoBuscaDTO{" +
                "resultados=" + resultados +
                '}';
    }
}