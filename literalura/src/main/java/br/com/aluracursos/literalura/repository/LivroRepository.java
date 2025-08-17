package br.com.aluracursos.literalura.repository;

import br.com.aluracursos.literalura.model.Livro;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {


    Page<Livro> findByIdioma(String idioma, Pageable pageable);

    @Transactional(readOnly = true)
    List<Livro> findByIdioma(String idioma);

    @Transactional(readOnly = true)
    List<Livro> findByIdiomaIgnoreCase(String idioma);

    @Transactional(readOnly = true)
    List<Livro> findByTituloContainingIgnoreCase(String titulo);

    @Transactional(readOnly = true)
    List<Livro> findByAutorId(Long autorId); // Busca livros por ID do autor

    /**
     * Útil para evitar duplicidade no cadastro vindo da API
     */
    boolean existsByTituloAndAutor_Nome(String titulo, String autorNome);
}