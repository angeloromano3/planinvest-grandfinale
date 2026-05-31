package br.com.planinvest.repository;

import br.com.planinvest.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
