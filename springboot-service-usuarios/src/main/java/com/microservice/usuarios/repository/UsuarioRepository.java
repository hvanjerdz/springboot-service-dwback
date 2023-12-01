package com.microservice.usuarios.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.microservice.usuarios.entity.Usuario;

public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long>{
	
	//select u from Usuario where u.username = ?1
	public Usuario FindByUsername(String username);
	
	//select u from Usuario where u.username = ?1 and u.email = ?2
	public Usuario FindByUsernameAndEmail(String username, String email);
	
	@Query(value = "select u from Usuario where u.username = ?1")
	public Usuario obtenerPorUsername(String username);
	
	@Query(value = "select u from Usuario where u.username = ?1 and u.email = ?2")
	public Usuario obtenerPorUsernameYEmail(String username, String email);
}
