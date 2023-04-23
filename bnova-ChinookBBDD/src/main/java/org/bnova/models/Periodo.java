package org.bnova.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDate;

@Data
@Embeddable
public class Periodo {

    @Column
    private LocalDate fechaInicio;
    @Column
    private LocalDate fechaFin;
}
