package com.ps.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Prestamos")

public class Prestamo {
    @Id  //Especifica que este campo es el ID
    @Column(name = "loan_id") //Especifica el nombre de la base de datos  : la Columna:
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genera solo el ID
    private Long loanId;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;
    private BigDecimal monto;
    private BigDecimal tasaInteres;
    private Integer plazo;
    private LocalDate fechaInicio;
    private String estado;

}
