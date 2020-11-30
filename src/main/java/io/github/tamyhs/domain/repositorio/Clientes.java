package io.github.tamyhs.domain.repositorio;

import io.github.tamyhs.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Clientes extends JpaRepository<Cliente, Integer> {

    //select c from Cliente c where c.nome like :nome - Query
    //nativeQuery = true - Para mostrar que a query é nativa do SQL
    @Query(value = " select * from Cliente c where c.nome like '%:nome%' ", nativeQuery = true)
    List<Cliente> encontrarPorNome( @Param("nome") String nome);

    @Query(" delete from Cliente c where c.nome =:nome ")
    @Modifying
    void deleteByNome(String nome);

    boolean existsByNome(String nome);
}
