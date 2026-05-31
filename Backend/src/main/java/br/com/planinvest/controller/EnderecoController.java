package br.com.planinvest.controller;

import br.com.planinvest.model.Endereco;
import br.com.planinvest.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public ResponseEntity<List<Endereco>> listarTodos() {
        return ResponseEntity.ok(enderecoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Endereco> buscarPorId(@PathVariable Long id) {
        Endereco endereco = enderecoService.buscarPorId(id);
        if (endereco == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(endereco);
    }

    @PostMapping
    public ResponseEntity<Endereco> salvar(@RequestBody Endereco endereco) {
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.salvar(endereco));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Endereco> atualizar(@PathVariable Long id, @RequestBody Endereco endereco) {
        return ResponseEntity.ok(enderecoService.atualizar(id, endereco));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        enderecoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}