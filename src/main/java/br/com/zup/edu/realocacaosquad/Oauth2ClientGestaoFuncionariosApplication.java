package br.com.zup.edu.realocacaosquad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Oauth2ClientGestaoFuncionariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ClientGestaoFuncionariosApplication.class, args);
	}

}
