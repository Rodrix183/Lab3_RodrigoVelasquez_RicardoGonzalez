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
public class EVA02 extends EVA {

    public boolean Movimiento(String [][] tokyo3, int posx, int posy, int movx, int movy){
        if (movx > 9 || movx < 0) {
            return false;
        }
        if (movy > 9 || movy < 0) {
            return false;
        }
        if (tokyo3[movx][movy].equals("["+"PM "+"] ") || tokyo3[movx][movy].equals("["+"EV0"+"] ") || tokyo3[movx][movy].equals("["+"EV1"+"] ") || tokyo3[movx][movy].equals("["+"EV2"+"] ") || tokyo3[movx][movy].equals("["+"-S-"+"] ") || tokyo3[movx][movy].equals("["+"-R-"+"] ") || tokyo3[movx][movy].equals("["+"-Z-"+"] ")) {
            return false;
        }
        if (movx == posx+1 && movy == posy+2) {
                return true;
        }
        if (movx == posx+2 && movy == posy+1) {
                return true;
        }
        if (movx == posx+1 && movy == posy-2) {
                return true;
        }
        if (movx == posx+2 && movy == posy-1) {
                return true;
        }
        if (movx == posx-1 && movy == posy-2) {
                return true;
        }
        if (movx == posx-2 && movy == posy-1) {
                return true;
        }
        if (movx == posx-1 && movy == posy+2) {
                return true;
        }
        if (movx == posx-2 && movy == posy+1) {
                return true;
        }
        return false;
    }

    @Override
    public void Atacar() {
        
    }
}
