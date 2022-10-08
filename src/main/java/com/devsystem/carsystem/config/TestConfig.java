package com.devsystem.carsystem.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devsystem.carsystem.entities.Marca;
import com.devsystem.carsystem.entities.Modelo;
import com.devsystem.carsystem.repositories.MarcaRepository;
import com.devsystem.carsystem.repositories.ModeloRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private MarcaRepository marcaRepository;

	@Autowired
	private ModeloRepository modeloRepository;

	@Override
	public void run(String... args) throws Exception {
		Marca mc1 = new Marca(null, "Volkswagen");
		Marca mc2 = new Marca(null, "Fiat");
		Marca mc3 = new Marca(null, "Ford");

		Modelo md1 = new Modelo(null, "Voyage 1.6", 2012, 2013, mc1);
		Modelo md2 = new Modelo(null, "Gol 1.0", 2022, 2022, mc1);
		Modelo md3 = new Modelo(null, "EcoSport 1.8", 2020, 2021, mc3);
		Modelo md4 = new Modelo(null, "Argo Trecking 1.8", 2023, 2023, mc2);

		marcaRepository.saveAll(Arrays.asList(mc1, mc2, mc3));
		modeloRepository.saveAll(Arrays.asList(md1, md2, md3, md4));
	}
}
