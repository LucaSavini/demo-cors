package com.example.demoCORS;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@Configuration
public class CorsConfig {

    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("http://localhost:8080"));
        configuration.setAllowedMethods(Arrays.asList("POST"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

//    @Bean
//    public CorsFilter corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  //mantenere e gestire la configurazione CORS per diverse risorse o
//                                                                                         // percorsi specificati attraverso gli URL.
//        CorsConfiguration config = new CorsConfiguration();
//
//        // Configurare le origini consentite
//        config.addAllowedOrigin("http://localhost:8080");
//
//        // Configurare gli headers consentiti
//        config.addAllowedHeader("*");
//
//        // Configurare i metodi HTTP consentiti
//        config.addAllowedMethod("GET");
//
//        //config.addAllowedMethod("POST");
//
//        //specifica il percorso per cui la configurazione CORS sarà applicata. Nel caso in cui desideri applicare
//        // la configurazione CORS a tutte le route, puoi utilizzare "/**"
//        source.registerCorsConfiguration("/api", config);
//
//        return new CorsFilter(source); //per restituire un'istanza di CorsFilter che utilizza la configurazione CORS
//                                      // precedentemente definita in UrlBasedCorsConfigurationSource.
//                                    //  è responsabile di restituire un filtro CORS configurato che verrà poi integrato nel flusso
//                                     // delle richieste HTTP gestite dalla tua applicazione Spring Boot.
//    }
}