package com.toysblizz.onboarding.serviceclient;

import com.library.mytoysblizz.configs.ConexionDb;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.SQLException;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.library.mytoysblizz")
@EntityScan(basePackages = "com.toyblizz.colombia")
@ComponentScan({"com.library.mytoysblizz","com.toysblizz.onboarding"})
@RequiredArgsConstructor
public class ServiceClientApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(ServiceClientApplication.class, args);
	}

}
