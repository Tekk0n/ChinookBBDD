package org.bnova.models;

import lombok.Data;

import javax.persistence.*;

//¿Single Table o Joined Table? * Joined
@Data
@PrimaryKeyJoinColumn(name = "idBecario")
public class Becario extends Empleado{

//    Inherited field
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_emp")
//    private Long idEmpleado;
    @Column(name = "horas_semana")
    private Integer horasSemanales;
    private Empleado mentor;
}
