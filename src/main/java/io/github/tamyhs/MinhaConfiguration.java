package io.github.tamyhs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//Para configurar essa configuração para um ambiente especifico
@Profile("development")
public class MinhaConfiguration {

    @Bean
    public CommandLineRunner executar(){
        //Pode colocar todos os argumentos que quiser
        return  args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }

    //Criação da configuração da Bean
    /*@Bean(name = "applicationName")
    public String applicationName() {
        return "Sistema de Vendas";
    }*/
}

