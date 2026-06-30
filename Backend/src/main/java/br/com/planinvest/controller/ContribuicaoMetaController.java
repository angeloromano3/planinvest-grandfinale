package br.com.planinvest.controller;

import br.com.planinvest.model.ContribuicaoMeta;
import br.com.planinvest.service.ContribuicaoMetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contribuicoes")
public class ContribuicaoMetaController {

    @Autowired
    private ContribuicaoMetaService contribuicaoMetaService;

    @GetMapping
    public ResponseEntity<List<ContribuicaoMeta>> listarTodos() {
        return ResponseEntity.ok(contribuicaoMetaService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContribuicaoMeta> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(contribuicaoMetaService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<ContribuicaoMeta> salvar(@RequestBody ContribuicaoMeta contribuicaoMeta) {
        return ResponseEntity.status(HttpStatus.CREATED).body(contribuicaoMetaService.salvar(contribuicaoMeta));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContribuicaoMeta> atualizar(@PathVariable Long id, @RequestBody ContribuicaoMeta contribuicaoMeta) {
        return ResponseEntity.ok(contribuicaoMetaService.atualizar(id, contribuicaoMeta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        contribuicaoMetaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}