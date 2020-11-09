package com.example.cursorestfulspringboot.dto;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public class ClienteDTO {

    
    @NotBlank(message = "Nome é obrigatorio!")
    @Length(min=4,max = 200, message = "Nome mínimo de 4 e o máximo de 200 caracteres!")
    private String nome;
    

    @NotBlank(message = "Endereço é obrigatorio!")
    @Length(min=4,max = 200, message = "Endereço mínimo de 4 e o máximo de 200 caracteres!")
    private String endereco;

    public ClienteDTO(){

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
}
