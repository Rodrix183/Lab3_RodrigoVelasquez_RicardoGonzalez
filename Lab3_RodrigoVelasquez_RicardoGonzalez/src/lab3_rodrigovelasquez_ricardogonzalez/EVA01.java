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
public class EVA01 extends EVA{
    
    public boolean Movimiento(int posx, int posy, int movx, int movy){
        if (movx == posx-3 || movx == posx-2 || movx == posx-1 || movx == posx+1 || movx == posx+2 || movx == posx+3) {
            if (movy == posy-3 || movy == posy-2 || movy == posy-1 || movy == posy+1 || movy == posy+2 || movy == posy+3) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void Atacar(){
        
    }
}
