/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_rodrigovelasquez_ricardogonzalez;

import java.awt.Color;

/**
 *
 * @author Richard
 */
public class EVA extends PRA {

    private Color color;
    private int añoproduccion;
    private double altura;
    private String alma;
    private int ojos;
    private Piloto pilot;
    private int codigoserie;
    private double daño;

    public EVA() {
    }

    public EVA(Color color, int añoproduccion, double altura, String alma, int ojos, Piloto pilot, int codigoserie, double daño) {
        this.color = color;
        this.añoproduccion = añoproduccion;
        this.altura = altura;
        this.alma = alma;
        this.ojos = ojos;
        this.pilot = pilot;
        this.codigoserie = codigoserie;
        this.daño = daño;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAñoproduccion() {
        return añoproduccion;
    }

    public void setAñoproduccion(int añoproduccion) {
        this.añoproduccion = añoproduccion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getAlma() {
        return alma;
    }

    public void setAlma(String alma) {
        this.alma = alma;
    }

    public int getOjos() {
        return ojos;
    }

    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    public Piloto getPilot() {
        return pilot;
    }

    public void setPilot(Piloto pilot) {
        this.pilot = pilot;
    }

    public int getCodigoserie() {
        return codigoserie;
    }

    public void setCodigoserie(int codigoserie) {
        this.codigoserie = codigoserie;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "EVA{" + "color=" + color + ", a\u00f1oproduccion=" + añoproduccion + ", altura=" + altura + ", alma=" + alma + ", ojos=" + ojos + ", pilot=" + pilot + ", codigoserie=" + codigoserie + ", da\u00f1o=" + daño + '}';
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
