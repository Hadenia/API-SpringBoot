package com.produtos.apirest.models;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

@Entity(name = "tb_veiculo")
public class Veiculo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String marca;

    private String modelo;

    @Column(length = 4)
    private BigInteger ano;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigInteger getAno() {
        return ano;
    }

    public void setAno(BigInteger ano) {
        this.ano = ano;
    }
}
