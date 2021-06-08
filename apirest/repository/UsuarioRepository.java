package com.produtos.apirest.repository;

import com.produtos.apirest.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findById(long id);
}

