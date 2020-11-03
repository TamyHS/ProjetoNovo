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

    /*@Autowired
    @Qualifier("applicationName")*/
    //@Value("${application.name}")
    private String applicationName;

    /*@Gato
    private Animal animal;

    @Bean(name = "executarAnimal")
    public CommandLineRunner executar(){
        return args -> {
          this.animal.fazerBarulho();
        };
    }*/

    /*@GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }*/

    @Bean
    public CommandLineRunner init (@Autowired Clientes clientes){
        return args -> {
            clientes.salvar(new Cliente("Tamy"));
            clientes.salvar(new Cliente("Outro cliente"));

            List<Cliente> todosClientes = clientes.obertTodos();
            todosClientes.forEach(System.out::println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
