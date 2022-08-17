/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.chelodevf1.Dto;

import javax.validation.constraints.NotBlank;

public class dtoSkill {
    @NotBlank
    private String nombreS;
    @NotBlank
    private int porcentajeS;
    
    // Constructores

    public dtoSkill() {
    }

    public dtoSkill(String nombreS, int porcentajeS) {
        this.nombreS = nombreS;
        this.porcentajeS = porcentajeS;
    }
    
    // Getters and Setters

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public int getPorcentajeS() {
        return porcentajeS;
    }

    public void setPorcentajeS(int porcentajeS) {
        this.porcentajeS = porcentajeS;
    }
    
    
}
