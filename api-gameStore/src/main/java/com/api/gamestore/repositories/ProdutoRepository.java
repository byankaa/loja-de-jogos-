package com.api.gamestore.repositories;

import java.util.List;
import com.api.gamestore.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByDescricaoContainingIgnoreCase( String descricao);

}
