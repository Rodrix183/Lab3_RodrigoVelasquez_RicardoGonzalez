/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_rodrigovelasquez_ricardogonzalez;

/**
 *
 * @author Richard
 */
public class Piloto {
    private String nombre;
    private int edad;
    private String familiar;
    private String encargado;
    private String escuela;
    private double sinc;
    private EVA asignado;

    public Piloto() {
    }
    
    

    public Piloto(String nombre, int edad, String familiar, String encargado, String escuela, double sinc, EVA asignado) {
        this.nombre = nombre;
        this.edad = edad;
        this.familiar = familiar;
        this.encargado = encargado;
        this.escuela = escuela;
        this.sinc = sinc;
        this.asignado = asignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFamiliar() {
        return familiar;
    }

    public void setFamiliar(String familiar) {
        this.familiar = familiar;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public double getSinc() {
        return sinc;
    }

    public void setSinc(double sinc) {
        this.sinc = sinc;
    }

    public EVA getAsignado() {
        return asignado;
    }

    public void setAsignado(EVA asignado) {
        this.asignado = asignado;
    }

    @Override
    public String toString() {
        return "Piloto{" + "nombre=" + nombre + ", edad=" + edad + ", familiar=" + familiar + ", encargado=" + encargado + ", escuela=" + escuela + ", sinc=" + sinc + ", asignado=" + asignado + '}';
    }
    
}