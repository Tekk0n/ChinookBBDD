package org.bnova.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "proy",
        uniqueConstraints = {@UniqueConstraint(name = "UQ_proy_nombre",
                columnNames = "nombre")})
@PrimaryKeyJoinColumn(name = "PK_proy")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dept")
    private long idProyecto;
    @Column(name = "codigo", length = 35)
    private String codigo;
    @Column(name = "nombre", length = 35)
    private String nombre;
    @Embedded
    private Periodo periodo;
    @ManyToOne
    private Empleado jefe;
    @ManyToMany
    private Set<Empleado> empleados;
}
