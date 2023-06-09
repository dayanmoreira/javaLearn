package me.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Embeddable
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Endereco {
    private String cep;
    private String complemento;
}
