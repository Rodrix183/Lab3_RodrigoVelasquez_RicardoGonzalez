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
//Evas
    public static String PRODMASA = "PM ", EVA_00 = "EV0", EVA_01 = "EV1", EVA_02 = "EV2";
//Angeles
    public static String SACHIEL = "-S-", RAMIEL = "-R-", ZERUEL = "-Z-";

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
                        imprimir(tokyo3);
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
                if (i == 0 && j == 2) {//aqui van los Angeles
                    tokyo3[i][j] = "[" + RAMIEL + "] "; //ramiel
                } else if (i == 0 && j == 7) {
                    tokyo3[i][j] = "[" + RAMIEL + "] ";
                } else if (i == 1 && j == 1) {//zeruel
                    tokyo3[i][j] = "[" + ZERUEL + "] ";
                } else if (i == 1 && j == 8) {
                    tokyo3[i][j] = "[" + ZERUEL + "] ";
                } else if (i == 3 && j == 2) {
                    tokyo3[i][j] = "[" + ZERUEL + "] ";
                } else if (i == 3 && j == 7) {
                    tokyo3[i][j] = "[" + ZERUEL + "] ";
                } else if (i == 1 && j == 4) { //sachiel
                    tokyo3[i][j] = "[" + SACHIEL + "] ";
                } else if (i == 1 && j == 5) {
                    tokyo3[i][j] = "[" + SACHIEL + "] ";
                } //aqui los evas
                else if (i == 9 && j == 0) {//pm
                    tokyo3[i][j] = "[" + PRODMASA + "] ";
                } else if (i == 9 && j == 9) {
                    tokyo3[i][j] = "[" + PRODMASA + "] ";
                } else if (i == 9 && j == 2) {
                    tokyo3[i][j] = "[" + PRODMASA + "] ";
                } else if (i == 9 && j == 7) {
                    tokyo3[i][j] = "[" + PRODMASA + "] ";
                } else if (i == 9 && j == 3) { //eva 00
                    tokyo3[i][j] = "[" + EVA_00 + "] ";
                } else if (i == 9 && j == 6) {
                    tokyo3[i][j] = "[" + EVA_00 + "] ";
                } else if (i == 9 && j == 4) { //eva 01
                    tokyo3[i][j] = "[" + EVA_01 + "] ";
                } else if (i == 9 && j == 5) { //eva 02
                    tokyo3[i][j] = "[" + EVA_02 + "] ";
                } else {
                    tokyo3[i][j] = "[" + "---" + "] ";
                }

                System.out.print(tokyo3[i][j]);
            }
            System.out.println("");
        }
        return matriz;
    }
}
