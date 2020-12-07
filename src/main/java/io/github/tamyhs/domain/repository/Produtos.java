package io.github.tamyhs.domain.repository;

import io.github.tamyhs.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
