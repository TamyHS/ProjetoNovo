package io.github.tamyhs;

import io.github.tamyhs.domain.entity.Cliente;
import io.github.tamyhs.domain.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class VendasApplication {

    private String applicationName;

    @Bean
    public CommandLineRunner init (@Autowired Clientes clientes){
        return args -> {
            System.out.println("Salvando clientes");
            clientes.salvar(new Cliente("Tamy"));
            clientes.salvar(new Cliente("Outro Cliente"));

            List<Cliente> todosClientes = clientes.obertTodos();
            todosClientes.forEach(System.out::println);
//
//            System.out.println("Atualizando clientes");
//            todosClientes.forEach(c -> {
//                c.setNome(c.getNome() + " atualizado.");
//                clientes.atualizar(c);
//            });
//
//            todosClientes = clientes.obertTodos();
//            todosClientes.forEach(System.out::println);
//
//            System.out.println("Buscando clientes");
//            clientes.buscarPorNome("Cli").forEach(System.out::println);

//            System.out.println("Deletando clientes");
//            clientes.obertTodos().forEach(c -> {
//                clientes.deletar(c);
 //           });

//            todosClientes = clientes.obertTodos();
//            if (todosClientes.isEmpty()){
//                System.out.println("Nenhum cliente foi encontrado.");
//            } else {
//                todosClientes.forEach(System.out::println);
//            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
