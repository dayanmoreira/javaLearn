package me.sacola.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.sacola.enumeration.FormaPagamento;
import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Sacola {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> itens;
    private Double valorTotal;
    @Enumerated
    private FormaPagamento FormaPagamento;
    private boolean fechada;

}
