package com.produtos.apirest.resources;

import com.produtos.apirest.models.Veiculo;
import com.produtos.apirest.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class VeiculoResource {
    @Autowired
    VeiculoRepository veiculosRepository;

    @GetMapping("/veiculos")
    public List<Veiculo> listaVeiculos(){
        return veiculosRepository.findAll();
    }

    @PostMapping("/veiculo")
    public Veiculo salvaVeiculo(@RequestBody Veiculo veiculo){
        return veiculosRepository.save(veiculo);
    }
}
