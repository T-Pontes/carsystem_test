package com.devsystem.carsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsystem.carsystem.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{	
}
