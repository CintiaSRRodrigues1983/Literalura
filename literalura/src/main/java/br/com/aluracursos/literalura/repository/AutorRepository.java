package br.com.aluracursos.literalura.repository;

import br.com.aluracursos.literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {

    Optional<Autor> findByNome(String nome);

    /**
     * Retorna autores que estavam vivos em determinado ano.
     * Aceita autores com anoNascimento/anoFalecimento = null.
     */
    @Query("SELECT a FROM Autor a WHERE " +
            "(:ano IS NULL OR a.anoNascimento IS NULL OR a.anoNascimento <= :ano) AND " +
            "(:ano IS NULL OR a.anoFalecimento IS NULL OR a.anoFalecimento >= :ano)")
    List<Autor> findAutoresVivosNoAno(@Param("ano") Integer ano);
}