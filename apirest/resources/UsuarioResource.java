package com.produtos.apirest.resources;

import com.produtos.apirest.models.Usuario;
import com.produtos.apirest.models.Veiculo;
import com.produtos.apirest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class UsuarioResource {
    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/usuarios")
    public List<Usuario> listaUsuarios() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/usuario/{id}/veiculos")
    public List<Veiculo> listaVeiculos(@PathVariable(value="id") long id){
        return usuarioRepository.findById(id).getVeiculoList();
    }

    @PostMapping("/usuario")
    public Usuario salvaProduto(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}

