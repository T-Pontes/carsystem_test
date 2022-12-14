package com.devsystem.carsystem.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.devsystem.carsystem.entities.Marca;
import com.devsystem.carsystem.entities.Modelo;
import com.devsystem.carsystem.entities.Usuario;
import com.devsystem.carsystem.entities.enums.Perfil;
import com.devsystem.carsystem.entities.enums.Tipo;
import com.devsystem.carsystem.repositories.MarcaRepository;
import com.devsystem.carsystem.repositories.ModeloRepository;
import com.devsystem.carsystem.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private MarcaRepository marcaRepository;
	@Autowired
	private ModeloRepository modeloRepository;
	
	@Autowired
	private BCryptPasswordEncoder pe;

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Tiago Pontes", "00797", pe.encode("123"));
		u1.addPerfil(Perfil.ADMIN);
		Usuario u2 = new Usuario(null, "Arthur Pontes", "01000", pe.encode("321"));
		
		Marca mc1 = new Marca(null, "Volkswagen");
		Marca mc2 = new Marca(null, "Fiat");
		Marca mc3 = new Marca(null, "Ford");

		Modelo md1 = new Modelo(null, "Voyage 1.6", 2012, 2013, Tipo.NACIONAL, mc1);
		Modelo md2 = new Modelo(null, "Gol 1.0", 2022, 2022, Tipo.NACIONAL, mc1);
		Modelo md3 = new Modelo(null, "Territory 2.5", 2020, 2021, Tipo.IMPORTADO, mc3);
		Modelo md4 = new Modelo(null, "Argo Trecking 1.8", 2023, 2023, Tipo.NACIONAL, mc2);

		usuarioRepository.saveAll(Arrays.asList(u1, u2));
		marcaRepository.saveAll(Arrays.asList(mc1, mc2, mc3));
		modeloRepository.saveAll(Arrays.asList(md1, md2, md3, md4));
	}
}
