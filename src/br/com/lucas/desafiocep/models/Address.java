package br.com.lucas.desafiocep.models;

import com.google.gson.annotations.SerializedName;

public record Address (
        String cep,
        @SerializedName("logradouro") String street,
        @SerializedName("complemento") String complement,
        @SerializedName("bairro") String neighborhood,
        @SerializedName("localidade") String locale,
        String uf,
        @SerializedName("estado") String state
) {}
