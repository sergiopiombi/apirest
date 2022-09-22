package com.demo.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Getter
    @Setter

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;

    public Usuario(){

    }
   /*

*/

}
