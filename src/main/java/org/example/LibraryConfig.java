package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class LibraryConfig {


    @Bean
    @Primary
    public Book info(){
        return new Book("Беседы с богом", "Ник Долнальд Уолш");
    }

    @Bean
    public Book infoNotFound(){
        return  new Book("NOT FOUND", "NOT FOUND");
    }

    @Bean
    OwnerBook ownerBook(){
        return new OwnerBook();
    }

}
