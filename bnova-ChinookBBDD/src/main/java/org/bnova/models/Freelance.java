package org.bnova.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Set;

//¿Single Table o Joined Table? * Joined
@Data
@PrimaryKeyJoinColumn(name = "idFreelance")
public class Freelance extends Empleado{

//    Inherited field
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_emp")
//    private Long idEmpleado;
    @Column(name = "horas_mes")
    private Integer horasMensuales;
    @Column
    private Float salarioHora;
    private Set<Proyecto> proyectos;
}
