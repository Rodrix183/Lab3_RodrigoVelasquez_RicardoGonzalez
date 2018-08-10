package lab3_rodrigovelasquez_ricardogonzalez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Lab3_RodrigoVelasquez_RicardoGonzalez {

    public static Scanner sc = new Scanner(System.in);
    public static String[][] tokyo3 = new String[10][10];
    public static ArrayList<EVA> listaEVA = new ArrayList<>();
    public static ArrayList<Angel> listaAngeles = new ArrayList<>();
//Evas
    public static String PRODMASA = "PM ", EVA_00 = "EV0", EVA_01 = "EV1", EVA_02 = "EV2";
//Angeles
    public static String SACHIEL = "-S-", RAMIEL = "-R-", ZERUEL = "-Z-";

    public static void main(String[] args) {
        int resp = 0;
        while (resp != 5) {
            try {
                //Sachiel
                listaAngeles.add(new Angel(Color.blue, "Se mueve de manera diagonal un cuadro a la vez", Color.orange, new Date(), "Sachiel", "No Vuela", 1));
                listaAngeles.add(new Angel(Color.blue, "Se mueve de manera diagonal un cuadro a la vez", Color.orange, new Date(), "Sachiel", "No Vuela", 1));
                
                //Ramiel
                listaAngeles.add(new Angel(Color.blue, "Se mueve una casilla a la vez", Color.green, new Date(), "Ramiel", "Si Vuela", 2));
                listaAngeles.add(new Angel(Color.blue, "Se mueve una casilla a la vez", Color.green, new Date(), "Ramiel", "Si Vuela", 2));
                
                //Zeruel
                listaAngeles.add(new Angel(Color.black, "Su movimiento es dos casillas por delante", Color.red, new Date(), "Zeruel", "No Vuela", 3));
                listaAngeles.add(new Angel(Color.black, "Su movimiento es dos casillas por delante", Color.red, new Date(), "Zeruel", "No Vuela", 3));
                listaAngeles.add(new Angel(Color.black, "Su movimiento es dos casillas por delante", Color.red, new Date(), "Zeruel", "No Vuela", 3));
                listaAngeles.add(new Angel(Color.black, "Su movimiento es dos casillas por delante", Color.red, new Date(), "Zeruel", "No Vuela", 3));
                
                
                System.out.println("1) Lista de EVAs\n"
                        + "2) Lista de Angeles\n"
                        + "3) CRUD Pilotos\n"
                        + "4) Simulacion\n"
                        + "5) Salir\n"
                        + "Ingrese opcion");
                resp = sc.nextInt();

                switch (resp) {
                    case 1:
                        
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:
                        for (int i = 0; i < 10; i++) {
                            for (int j = 0; j < 10; j++) {
                                if (i == 0 && j == 2) {//aqui van los Angeles
                                    tokyo3[i][j] = "["+RAMIEL+"] "; //ramiel
                                }else if (i == 0 && j == 7) {
                                    tokyo3[i][j] = "["+RAMIEL+"] ";
                                }else if (i == 1 && j == 1) {//zeruel
                                    tokyo3[i][j] = "["+ZERUEL+"] ";
                                }else if (i == 1 && j == 8) {
                                    tokyo3[i][j] = "["+ZERUEL+"] ";
                                }else if (i == 3 && j == 2) {
                                    tokyo3[i][j] = "["+ZERUEL+"] ";
                                }else if (i == 3 && j == 7) {
                                    tokyo3[i][j] = "["+ZERUEL+"] ";
                                }else if (i == 1 && j == 4) { //sachiel
                                    tokyo3[i][j] = "["+SACHIEL+"] ";
                                }else if (i == 1 && j == 5) {
                                    tokyo3[i][j] = "["+SACHIEL+"] ";
                                }
                                
                                //aqui los evas
                                else if (i == 9 && j == 0) {//pm
                                    tokyo3[i][j] = "["+PRODMASA+"] ";
                                } else if (i == 9 && j == 9) {
                                    tokyo3[i][j] = "["+PRODMASA+"] ";
                                } else if (i == 9 && j == 2) {
                                    tokyo3[i][j] = "["+PRODMASA+"] ";
                                } else if (i == 9 && j == 7) {
                                    tokyo3[i][j] = "["+PRODMASA+"] ";
                                } else if (i == 9 && j == 3) { //eva 00
                                    tokyo3[i][j] = "["+EVA_00+"] "; 
                                } else if (i == 9 && j == 6) {
                                    tokyo3[i][j] = "["+EVA_00+"] ";
                                } else if (i == 9 && j == 4) { //eva 01
                                    tokyo3[i][j] = "["+EVA_01+"] ";
                                } else if (i == 9 && j == 5) { //eva 02
                                    tokyo3[i][j] = "["+EVA_02+"] ";
                                }
                                
                                
                                else{
                                    tokyo3[i][j] = "["+"---"+"] ";
                                }
                                
                                System.out.print(tokyo3[i][j]);
                            }
                            System.out.println("");
                        }
                        break;
                    default:
                        resp = 5;
                }

            } catch (Exception e) {
                System.out.println("Opcion no valida! ");
            }

        }
    }

}
