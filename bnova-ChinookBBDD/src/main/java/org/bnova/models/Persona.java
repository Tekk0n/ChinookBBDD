package org.bnova.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@Data
@MappedSuperclass
public class Persona {

    @Column
    @Enumerated(EnumType.STRING)
    private TipoGenero Genero;
    @Column
    private LocalDate fechaNacimiento;
}
