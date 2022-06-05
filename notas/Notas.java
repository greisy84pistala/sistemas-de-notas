package com.cuarto;

public  class Notas {
   
    private String materia;
    private double parcial1;
    private double parcial2;
    private double pfinal;

    public Notas(String materia, double parcial1, double parcial2, double pfinal) {
        this.materia = materia;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.pfinal = pfinal;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getParcial1() {
        return parcial1;
    }

    public void setParcial1(double parcial1) {
        this.parcial1 = parcial1;
    }

    public double getParcial2() {
        return parcial2;
    }

    public void setParcial2(double parcial2) {
        this.parcial2 = parcial2;
    }

    public double getPfinal() {
        return pfinal;
    }

    public void setPfinal(double pfinal) {
        this.pfinal = pfinal;
    }

   
    
    
}
