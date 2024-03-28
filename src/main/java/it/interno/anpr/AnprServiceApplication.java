package it.interno.anpr;

import it.interno.anpr.dto.E002ConsultazioneDto;
import it.interno.anpr.service.AnprService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnprServiceApplication /*implements CommandLineRunner */{


//    @Autowired
//    private AnprService anprService;

    public static void main(String[] args) {
        System.setProperty("javax.net.ssl.trustStore", "keystore/cacerts");
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        SpringApplication.run(AnprServiceApplication.class, args);
    }


//    @Override
//    public void run(String... args) throws Exception {
//        E002ConsultazioneDto e002ConsultazioneDto = new E002ConsultazioneDto();
//        e002ConsultazioneDto.setCodiceFiscale("STTSGT90A01H501J");
//       anprService.consultazioneSoggetti(e002ConsultazioneDto);
//    }
}
