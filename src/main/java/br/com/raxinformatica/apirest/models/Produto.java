package br.com.raxinformatica.apirest.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="TB_PRODUTO")
@Getter @Setter
public class Produto implements Serializable {

    private static final long serialVersionUID = 1037282630039577021L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String nome;

    private BigDecimal quantidade;

    private BigDecimal valor;
}
