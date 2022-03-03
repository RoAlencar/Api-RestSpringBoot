package br.com.raxinformatica.apirest.repository;

import br.com.raxinformatica.apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
