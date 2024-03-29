package com.ps.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //me genera SET and GET
@NoArgsConstructor //Me genera un constructor sin argumentos
@AllArgsConstructor //Me genera un constructor con todos los argumentos
@Entity //Especifica que esta clase representa un modelo de la BD 'Entidad'
@Table(name = "Clientes")  // Especifica el nombre de la tabla  en la base de datos
public class Cliente {

    @Id  //Especifica que este campo es el ID
    @Column(name = "cliente_id") //Especifica el nombre de la base de datos  : la Columna:
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genera solo el ID
    private Long clientId;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;

}
