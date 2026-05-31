package br.com.planinvest.controller;

import br.com.planinvest.model.Conta;
import br.com.planinvest.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @GetMapping
    public ResponseEntity<List<Conta>> listarTodos() {
        return ResponseEntity.ok(contaService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Conta> buscarPorId(@PathVariable Long id) {
        Conta conta = contaService.buscarPorId(id);
        if (conta == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(conta);
    }

    @PostMapping
    public ResponseEntity<Conta> salvar(@RequestBody Conta conta) {
        return ResponseEntity.status(HttpStatus.CREATED).body(contaService.salvar(conta));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Conta> atualizar(@PathVariable Long id, @RequestBody Conta conta) {
        return ResponseEntity.ok(contaService.atualizar(id, conta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        contaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}