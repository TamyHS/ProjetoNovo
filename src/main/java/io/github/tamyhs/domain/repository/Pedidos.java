package io.github.tamyhs.domain.repository;

import io.github.tamyhs.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
}
