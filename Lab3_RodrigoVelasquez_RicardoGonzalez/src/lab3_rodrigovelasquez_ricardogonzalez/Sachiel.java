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
public class Sachiel extends Angel{
    
    public boolean Movimiento(int posx, int posy, int movx, int movy){
        if (movx == posx+1 && movy == posy+1) {
            return true;
        }
        if (movx == posx+1 && movy == posy-1) {
            return true;
        }
        if (movx == posx-1 && movy == posy+1) {
            return true;
        }
        if (movx == posx-1 && movy == posy-1) {
            return true;
        }
        return false;
    }
    
    @Override
    public void Atacar() {

    }
    
}
