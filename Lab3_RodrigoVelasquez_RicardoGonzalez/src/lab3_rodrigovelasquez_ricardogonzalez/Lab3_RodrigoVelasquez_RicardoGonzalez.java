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
    public static ArrayList<Piloto> listaPilotos = new ArrayList<>();

    public static int x = 0, y = 0;//actuales
    public static int xNueva = 0, yNueva = 0;//nuevas
    public static int turno = 0;
    public static String caracter = "";//actuales
    static int actualJ = 0;
    //posiciones angeles
    public static int xS1 = 1, xS2 = 1, xR1 = 0, xR2 = 0, xZ1 = 1, xZ2 = 1, xZ3 = 3, xZ4 = 3, yS1 = 4, yS2 = 5, yR1 = 2, yR2 = 7, yZ1 = 1, yZ2 = 8, yZ3 = 2, yZ4 = 7;

    //posiciones EVAS
    public static int xPM1 = 9, xPM2 = 9, xPM3 = 9, xPM4 = 9, x00p = 9, x00s = 9, x01 = 9, x02 = 9, yPM1 = 0, yPM2 = 2, yPM3 = 7, yPM4 = 9, y00p = 3, y00s = 6, y01 = 4, y02 = 5;

    //Evas
    public static String PRODMASA = "PM ", EVA_00 = "EV0", EVA_01 = "EV1", EVA_02 = "EV2";

    //Angeles
    public static String SACHIEL = "-S-", RAMIEL = "-R-", ZERUEL = "-Z-";

    //Neutro
    public static String neutro = "---";

    public static void main(String[] args) {
        int resp = 0;
        while (resp != 5) {
            try {
                //Engels
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

                //pilotos
                listaPilotos.add(new Piloto("Ricardo", 20, "Quacker", "Encargado del EVA", "Dowal", 84.34, "EVA-00"));
                listaPilotos.add(new Piloto("Rodrigo", 20, "Max", "Encargado del EVA", "IST", 70.43, "EVA-00"));
                listaPilotos.add(new Piloto("Nelson", 19, "Avila Crusoe el Rio", "Encargado del EVA", "DelCampo", 84.34, "EVA-01"));
                listaPilotos.add(new Piloto("Shinji", 15, "Dr. Hikari", "Encargado del EVA", "Americana", 84.34, "EVA-02"));

                //EVAS
                //produccion en masa
                listaEVA.add(new EVA(Color.yellow, 1998, 3.4, "Salvaje", 2, null, 99, 65));
                listaEVA.add(new EVA(Color.yellow, 1998, 3.4, "Hostil", 2, null, 99, 65));
                listaEVA.add(new EVA(Color.yellow, 1998, 3.4, "Salvaje", 2, null, 99, 65));
                listaEVA.add(new EVA(Color.yellow, 1998, 3.4, "Nuevo", 2, null, 99, 65));

                //eva00
                listaEVA.add(new EVA(Color.yellow, 1998, 17, "Pura", 2, listaPilotos.get(0), 99, 65));
                listaEVA.add(new EVA(Color.yellow, 1998, 17, "Corrupta", 2, listaPilotos.get(1), 99, 65));

                //eva01
                listaEVA.add(new EVA(Color.yellow, 1998, 13, "Pura", 2, listaPilotos.get(2), 99, 65));

                //eva02
                listaEVA.add(new EVA(Color.yellow, 1998, 11, "Nueva", 2, listaPilotos.get(3), 99, 65));
                System.out.println("1) Lista de EVAs\n"
                        + "2) Lista de Angeles\n"
                        + "3) CRUD Pilotos\n"
                        + "4) Simulacion\n"
                        + "5) Salir\n"
                        + "Ingrese opcion");
                resp = sc.nextInt();

                switch (resp) {
                    case 1:
                        for (EVA ev : listaEVA) {
                            System.out.println(ev);
                        }
                        break;
                    case 2:
                        for (Angel ang : listaAngeles) {
                            System.out.println(ang);
                        }
                        break;
                    case 3:

                        break;
                    case 4:
                        try {
                            imprimir(tokyo3);
                            if (turno % 2 == 0) {
                                actualJ = 1;
                            } else {
                                actualJ = 2;
                            }
                            switch (actualJ) {
                                case 1:
                                    try {
                                        System.out.println("Escoja un Eva\n"
                                                + "X: ");
                                        x = sc.nextInt();
                                        System.out.println("\nY: ");
                                        y = sc.nextInt();
                                        //verificar si hay un EVA
                                        for (int i = 0; i < tokyo3.length; i++) {
                                            for (int j = 0; j < tokyo3[i].length; j++) {
                                                if (i == x && j == y) {
                                                    //PRODMASA = "PM ", EVA_00 = "EV0", EVA_01 = "EV1", EVA_02 = "EV2"
                                                    if (tokyo3[i][j] == PRODMASA) {
                                                        caracter = PRODMASA;
                                                    } else if (tokyo3[i][j] == EVA_00) {
                                                        caracter = EVA_00;
                                                    } else if (tokyo3[i][j] == EVA_01) {
                                                        caracter = EVA_01;
                                                    } else if (tokyo3[i][j] == EVA_02) {
                                                        caracter = EVA_02;
                                                    } else {
                                                        System.out.println("No es un EVA");
                                                    }
                                                }
                                            }
                                        }
                                        System.out.println("1 Mover\n"
                                                + "2 Atacar\n"
                                                + "Ingrese que desea hacer");
                                        int valid = sc.nextInt();
                                        switch(valid){
                                            case 1:
                                                break;
                                            case 2:
                                                break;
                                            default:
                                                System.out.println("Opcion no valida");
                                        
                                        }
                                    } catch (Exception e) {
                                    }

                                    break;
                                case 2:
                                    break;
                            }
                        } catch (Exception e) {

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

    public static String[][] imprimir(String[][] tokyo3) {
        String[][] matriz = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == xR1 && j == yR1) {//aqui van los Angeles
                    tokyo3[i][j] = "[" + RAMIEL + "] "; //ramiel
                } else if (i == xR2 && j == yR2) {
                    tokyo3[i][j] = "[" + RAMIEL + "] ";
                } else if (i == xZ1 && j == yZ1) {//zeruel #1
                    tokyo3[i][j] = "[" + ZERUEL + "] ";
                } else if (i == xZ2 && j == yZ2) { //#2
                    tokyo3[i][j] = "[" + ZERUEL + "] ";
                } else if (i == xZ3 && j == yZ3) { //#3
                    tokyo3[i][j] = "[" + ZERUEL + "] ";
                } else if (i == xZ4 && j == yZ4) { //#4
                    tokyo3[i][j] = "[" + ZERUEL + "] ";
                } else if (i == xS1 && j == yS1) { //sachiel
                    tokyo3[i][j] = "[" + SACHIEL + "] ";
                } else if (i == xS2 && j == yS2) {
                    tokyo3[i][j] = "[" + SACHIEL + "] ";
                } //aqui los evas
                else if (i == xPM1 && j == yPM1) {//pm
                    tokyo3[i][j] = "[" + PRODMASA + "] ";
                } else if (i == xPM2 && j == yPM2) {
                    tokyo3[i][j] = "[" + PRODMASA + "] ";
                } else if (i == xPM2 && j == yPM3) {
                    tokyo3[i][j] = "[" + PRODMASA + "] ";
                } else if (i == xPM4 && j == yPM4) {
                    tokyo3[i][j] = "[" + PRODMASA + "] ";
                } else if (i == x00p && j == y00p) { //eva 00
                    tokyo3[i][j] = "[" + EVA_00 + "] ";
                } else if (i == x00s && j == y00s) {
                    tokyo3[i][j] = "[" + EVA_00 + "] ";
                } else if (i == x01 && j == y01) { //eva 01
                    tokyo3[i][j] = "[" + EVA_01 + "] ";
                } else if (i == x02 && j == y02) { //eva 02
                    tokyo3[i][j] = "[" + EVA_02 + "] ";
                } else {
                    tokyo3[i][j] = "[" + neutro + "] ";
                }

                System.out.print(tokyo3[i][j]);
            }
            System.out.println("");
        }
        return matriz;
    }
}
