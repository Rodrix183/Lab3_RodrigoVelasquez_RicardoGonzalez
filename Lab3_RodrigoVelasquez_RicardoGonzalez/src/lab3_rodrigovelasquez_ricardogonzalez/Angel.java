package lab3_rodrigovelasquez_ricardogonzalez;

import java.awt.Color;
import java.util.Date;

public class Angel extends PRA{
    private Color color;
    private String descripcion;
    private Color sangre;
    private Date date;
    private String nombre;
    private String volar;
    private int potencia;

    public Angel() {
    }

    public Angel(Color color, String descripcion, Color sangre, Date date, String nombre, String volar, int potencia) {
        this.color = color;
        this.descripcion = descripcion;
        this.sangre = sangre;
        this.date = date;
        this.nombre = nombre;
        this.volar = volar;
        this.potencia = potencia;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Color getSangre() {
        return sangre;
    }

    public void setSangre(Color sangre) {
        this.sangre = sangre;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVolar() {
        return volar;
    }

    public void setVolar(String volar) {
        this.volar = volar;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Angel{" + "color=" + color + ", descripcion=" + descripcion + ", sangre=" + sangre + ", date=" + date + ", nombre=" + nombre + ", volar=" + volar + ", potencia=" + potencia + '}';
    }
    
    @Override
    public void Moverse() {
        super.Moverse(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void Atacar(){
        super.Atacar();
    }
    
}
