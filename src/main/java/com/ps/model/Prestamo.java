package com.ps.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;


@Data   //me genera SET and GET
@NoArgsConstructor  //Me genera un constructor sin argumentos
@AllArgsConstructor  //Me genera un constructor con todos los argumentos
@Entity   //Especifica que esta clase representa un modelo de la BD 'Entidad'
@Table(name = "Prestamos") // Especifica el nombre de la tabla  en la base de datos

public class Prestamo {
    @Id  //Especifica que este campo es el ID
    @Column(name = "loan_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genera solo el ID
    private Long loan_id;
    private Cliente cliente_id;
    private BigDecimal monto;
    private BigDecimal tasaInteres;
    private Integer plazo;
    private LocalDate fechaInicio;
    private String estado;

}
