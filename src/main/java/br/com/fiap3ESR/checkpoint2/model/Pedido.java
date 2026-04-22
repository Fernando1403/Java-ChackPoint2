package br.com.fiap3ESR.checkpoint2.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Pedidos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    // Chave primária gerada automaticamente pelo banco
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nome do cliente — obrigatório, não pode ser vazio
    @NotBlank(message = "O nome do cliente é obrigatório.")
    @Column(nullable = false)
    private String clienteNome;

    // Data do pedido — preenchida automaticamente antes de salvar
    private LocalDate dataPedido;

    // Valor total — não pode ser negativo
    @PositiveOrZero(message = "O valor total não pode ser negativo.")
    @Column(nullable = false)
    private double valorTotal;

    // Executado automaticamente antes de inserir no banco
    @PrePersist
    public void prePersist() {
        if (this.dataPedido == null) {
            this.dataPedido = LocalDate.now();
        }
    }
}
