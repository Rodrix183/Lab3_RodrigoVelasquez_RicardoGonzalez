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
    
    public boolean Movimiento(String [][] tokyo3, int posx, int posy, int movx, int movy){
        if (movx > 9 || movx < 0) {
            return false;
        }
        if (movy > 9 || movy < 0) {
            return false;
        }
        if (tokyo3[movx][movy].equals("["+"PM "+"] ") || tokyo3[movx][movy].equals("["+"EV0"+"] ") || tokyo3[movx][movy].equals("["+"EV1"+"] ") || tokyo3[movx][movy].equals("["+"EV2"+"] ") || tokyo3[movx][movy].equals("["+"-S-"+"] ") || tokyo3[movx][movy].equals("["+"-R-"+"] ") || tokyo3[movx][movy].equals("["+"-Z-"+"] ") || tokyo3[movx][movy].equals("["+"---"+"] ")) {
            return false;
        }
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
