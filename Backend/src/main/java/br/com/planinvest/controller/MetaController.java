package br.com.planinvest.controller;

import br.com.planinvest.model.Meta;
import br.com.planinvest.service.MetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metas")
public class MetaController {

    @Autowired
    private MetaService metaService;

    @GetMapping
    public ResponseEntity<List<Meta>> listarTodos() {
        return ResponseEntity.ok(metaService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Meta> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(metaService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Meta> salvar(@RequestBody Meta meta) {
        return ResponseEntity.status(HttpStatus.CREATED).body(metaService.salvar(meta));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Meta> atualizar(@PathVariable Long id, @RequestBody Meta meta) {
        return ResponseEntity.ok(metaService.atualizar(id, meta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        metaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}