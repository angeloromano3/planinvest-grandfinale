package br.com.planinvest.service;

import br.com.planinvest.model.Meta;
import br.com.planinvest.repository.MetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetaService {

    @Autowired
    private MetaRepository metaRepository;

    public List<Meta> listarTodos() {
        return metaRepository.findAll();
    }

    public Meta buscarPorId(Long id) {
        return metaRepository.findById(id).orElse(null);
    }

    public Meta salvar(Meta meta) {
        return metaRepository.save(meta);
    }

    public Meta atualizar(Long id, Meta meta) {
        meta.setIdMeta(id);
        return metaRepository.save(meta);
    }

    public void deletar(Long id) {
        metaRepository.deleteById(id);
    }
}