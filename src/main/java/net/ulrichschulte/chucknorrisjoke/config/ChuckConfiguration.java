package net.ulrichschulte.chucknorrisjoke.config;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ChuckConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
