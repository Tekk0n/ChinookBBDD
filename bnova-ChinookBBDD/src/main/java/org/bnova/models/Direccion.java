package org.bnova.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDate;

@Data
@Embeddable
public class Direccion {

    @Column
    private String tipoVia;
    @Column
    private String Via;
    @Column
    private Integer Numero;
    @Column
    private Integer Piso;
    @Column
    private String Puerta;
    @Column
    private String Ciudad;
    @Column
    private LocalDate Region;
    @Column
    private String codigoPostal;
}
