package br.com.planinvest.service;

import br.com.planinvest.model.ContribuicaoMeta;
import br.com.planinvest.repository.ContribuicaoMetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContribuicaoMetaService {

    @Autowired
    private ContribuicaoMetaRepository contribuicaoMetaRepository;

    public List<ContribuicaoMeta> listarTodos() {
        return contribuicaoMetaRepository.findAll();
    }

    public ContribuicaoMeta buscarPorId(Long id) {
        return contribuicaoMetaRepository.findById(id).orElse(null);
    }

    public ContribuicaoMeta salvar(ContribuicaoMeta contribuicaoMeta) {
        return contribuicaoMetaRepository.save(contribuicaoMeta);
    }

    public ContribuicaoMeta atualizar(Long id, ContribuicaoMeta contribuicaoMeta) {
        contribuicaoMeta.setIdContribuicao(id);
        return contribuicaoMetaRepository.save(contribuicaoMeta);
    }

    public void deletar(Long id) {
        contribuicaoMetaRepository.deleteById(id);
    }
}