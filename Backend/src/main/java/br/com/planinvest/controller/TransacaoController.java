package br.com.planinvest.controller;

import br.com.planinvest.model.Transacao;
import br.com.planinvest.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    @GetMapping
    public ResponseEntity<List<Transacao>> listarTodos() {
        return ResponseEntity.ok(transacaoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transacao> buscarPorId(@PathVariable Long id) {
        Transacao transacao = transacaoService.buscarPorId(id);
        if (transacao == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(transacao);
    }

    @PostMapping
    public ResponseEntity<Transacao> salvar(@RequestBody Transacao transacao) {
        return ResponseEntity.status(HttpStatus.CREATED).body(transacaoService.salvar(transacao));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transacao> atualizar(@PathVariable Long id, @RequestBody Transacao transacao) {
        return ResponseEntity.ok(transacaoService.atualizar(id, transacao));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        transacaoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}