package com.devsystem.carsystem.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devsystem.carsystem.entities.Marca;
import com.devsystem.carsystem.repositories.MarcaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private MarcaRepository marcaRepository;

	@Override
	public void run(String... args) throws Exception {
		Marca mc1 = new Marca(null,"Volkswagen");
		Marca mc2 = new Marca(null,"Fiat");
		Marca mc3 = new Marca(null,"Ford");
		
		marcaRepository.saveAll(Arrays.asList(mc1,mc2,mc3));
	}
}
