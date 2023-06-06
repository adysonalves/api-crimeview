package com.crimeview.api.api.dados;

import java.time.LocalDate;

import com.crimeview.api.modelo.dados.Dados;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class DadosRequest {

   private String regiao;

   private LocalDate data;

   private String natureza;

   private String municipio;

   private String vitima;

   private Boolean status_dado;

   private Integer id_usuario;

   public Dados build() {

       return Dados.builder()
               .regiao(regiao)
               .data(data)
               .natureza(natureza)
               .municipio(municipio)
               .vitima(vitima)
               .statusDado(status_dado)
               .id_usuario(id_usuario)
               .build();
   }
}
