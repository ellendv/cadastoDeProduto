package com.example.cadastroproduto.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "PRODUTOS")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "NOME_PRODUTO")
    private String nome;
    @NotBlank
    @Column(name = "DESCRICAO")
    private String descricao;

    public ProdutoModel() {
    }

    public ProdutoModel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }


}
