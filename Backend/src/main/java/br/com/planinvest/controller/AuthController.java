package br.com.planinvest.controller;

import br.com.planinvest.dto.LoginRequest;
import br.com.planinvest.model.Usuario;
import br.com.planinvest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findByEmlEmail(loginRequest.getEmail());

        if (usuarioOpt.isEmpty()) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("erro", "Credenciais inválidas"));
        }

        Usuario usuario = usuarioOpt.get();

        if (!usuario.getSenSenha().equals(loginRequest.getSenha())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("erro", "Credenciais inválidas"));
        }

        return ResponseEntity.ok(Map.of(
                "id", usuario.getIdUsuario(),
                "nome", usuario.getNmUsuario(),
                "email", usuario.getEmlEmail()
        ));
    }
}
