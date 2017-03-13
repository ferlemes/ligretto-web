package br.net.lemes.ligretto.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Created by dasilfer on 13/03/2017.
 */
@EnableAutoConfiguration
public class LigrettoApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(LigrettoApp.class, args);
    }

}
