package org.bnova.models;

import lombok.Data;
import org.hibernate.annotations.Check;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Set;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "emp")
@PrimaryKeyJoinColumn(name = "PK_emp")
@Check(constraints = "Comm <= Sal * 0.25"/*, name = "CK_emp_com_porcentaje_sal"*/)
public class Empleado extends Persona{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_emp")
    private Long idEmpleado;
    @Column(name = "Empno")
    private String numero;
    private Direccion direccion;
    @Column(name = "Job")
    private String oficio;
    @Column(name = "Hiredate")
    private LocalDate fechaContratacion;
    @Transient
    //Not method implemented yet "calcularAntiguedad()"
    private Period antiguedad;
    @Column(name = "Mgr")
    @ManyToOne
    @JoinColumn(name = "FK_emp_mgr")
    private Empleado jefe;
    @Column(name = "Sal")
    //Not validation implemented yet "\\d{7}\\.\\d{2}"
    private Float salario;
    @Column(name = "Comm")
    //Not validation implemented yet "\\d{7}\\.\\d{2}"
    private Float comision;
    @Column(name = "Deptno")
    @ManyToOne
    @JoinColumn(name = "FK_emp_dept")
    private Departamento departamento;
    @OneToMany
    private Set<Proyecto> proyectos;

}
