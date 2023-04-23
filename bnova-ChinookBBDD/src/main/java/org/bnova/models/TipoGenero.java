package org.bnova.models;

//lombok causes inconsistency | tested with Data, AllArgs
public enum TipoGenero {
    MASCULINO("M"), FEMENINO("F"), NOBINARIO("NB"), OTRO("O");

    private String key;

    private  TipoGenero(String key){
        this.key = key;
    }
}
