package br.com.planinvest.repository;

import br.com.planinvest.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmlEmail(String emlEmail);
}