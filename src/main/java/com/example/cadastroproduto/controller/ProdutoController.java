package com.example.cadastroproduto.controller;

import com.example.cadastroproduto.model.ProdutoModel;
import com.example.cadastroproduto.model.dto.ProdutoDto;
import com.example.cadastroproduto.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }
    @PostMapping
    public ProdutoModel cadastrar(@Valid @RequestBody ProdutoDto produtoDto){
        return service.cadastrarProduto(produtoDto);
    }
    @GetMapping
    public List<ProdutoModel> listar(){
        return service.consultarProdutos();
    }
}
