package com.example.cadastroproduto.service;

import com.example.cadastroproduto.model.ProdutoModel;
import com.example.cadastroproduto.model.dto.ProdutoDto;
import com.example.cadastroproduto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public ProdutoModel cadastrarProduto(ProdutoDto produto){
        var produtoModel = new ProdutoModel(
                produto.getNome(),
                produto.getDescricao()
        );

        return repository.save(produtoModel);
    }

    public List<ProdutoModel> consultarProdutos() {
        return repository.findAll();
    }
}
