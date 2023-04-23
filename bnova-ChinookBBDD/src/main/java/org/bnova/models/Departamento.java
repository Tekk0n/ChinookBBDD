package org.bnova.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dept",
        indexes = @Index(name = "IDX_dept_dname",
                columnList = "Dname"))
@PrimaryKeyJoinColumn(name = "PK_dept")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dept")
    private long idDepartamento;
    @Column(name = "Deptno", length = 35)
    private String numero;
    @Column(name = "Dname", length = 35)
    private String nombre;
    @Column(name = "Loc", length = 35)
    private String localidad;
}
