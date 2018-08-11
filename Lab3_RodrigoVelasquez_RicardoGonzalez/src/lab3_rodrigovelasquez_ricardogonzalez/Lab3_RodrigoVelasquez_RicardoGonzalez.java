package lab3_rodrigovelasquez_ricardogonzalez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Lab3_RodrigoVelasquez_RicardoGonzalez {

    static Piloto p = new Piloto();

    static int ANG = 5, EVA = 5;
    static int vidaPM1 = 1, vidaPM2 = 1, vidaPM3 = 1, vidaPM4 = 1;

    static EVA00 eva0 = new EVA00();
    static EVA01 eva1 = new EVA01();
    static EVA02 eva2 = new EVA02();
    static EVAPM evapm = new EVAPM();
    static Ramiel ram = new Ramiel();
    static Sachiel sac = new Sachiel();
    static Zeruel zer = new Zeruel();

    static boolean validacion;
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

        System.out.println("MAGI init\n"
                + "Bienvenido a Nerv\n"
                + "............................-*@WWWWWWWWWWWW+...............\n"
                + "\n"
                + "...........................+WWWWWWWWWWWWWW+................\n"
                + "\n"
                + "................**.........@WWWWWWWWWWWWWWWWW@+............\n"
                + "\n"
                + "................=W+........#WWWWWWWWWWWWWWWWWWWWW=.........\n"
                + "\n"
                + "..................#@-.....+WWWWWWWWWWWWWWWWWWWWWWWW+.......\n"
                + "\n"
                + "....................#=...=WWWWWWWWWWWWWWWWWWWWWWWWWW@......\n"
                + "\n"
                + ".....................-#WWWWWWWWWWWWWWWWWWWWWWWWWWWW#=......\n"
                + "\n"
                + "........-:::-...-:::-::+WWWWWWWWWWWWWWWWW@#WWWW@@-.........\n"
                + "\n"
                + "..........#WW@-...#...=WW+@WWWWWWWWWWWWWWW@#+..............\n"
                + "\n"
                + "..........=.#WW=..=...=WW-.#WWWWWWWWWWWWWWWWWW@-...........\n"
                + "\n"
                + "..........=..:WWW:=...=WW#@@.:WWWWWWWWWWWWWWWWW#...........\n"
                + "\n"
                + "..........=....=WW#...=WW-.*..-*WWWWWWWWWWWWWWWW#..........\n"
                + "\n"
                + "..........#.....-@#...=WW:...*#..*WWWWWWWWWWWWWWW:.........\n"
                + "\n"
                + "..................-................=WWWWWWWWWWWWW#.........\n"
                + "\n"
                + "........................:WW#+*@W=.-#WWWWWWWWWWWWWW=........\n"
                + "\n"
                + "........................-WW=...WW#..@WW#WWWWWWWWWW=........\n"
                + "\n"
                + "........................-WW=..*WW:..-@W@-#WWWWWWWW#........\n"
                + "\n"
                + "........................-WW=:WW@.....-WW#++@WWWWWW#........\n"
                + "\n"
                + "........................-WW=..#WW+....:WW+..-@WWWW#........\n"
                + "\n"
                + ".......................:=@@@+-.+@@#:...+*.....-@WW=........\n"
                + "\n"
                + "................................................:WW........\n");
        while (resp != 5) {
            try {

                System.out.println("OPCIONES\n"
                        + "Elija una opción:");
                System.out.println("1) Lista de EVAs\n"
                        + "2) Lista de Angeles\n"
                        + "3) CRUD Pilotos\n"
                        + "4) Simulacion\n"
                        + "5) Salir\n"
                        + "Ingrese opcion");
                resp = sc.nextInt();
                //aqui el menu
                switch (resp) {
                    case 1:
                        for (int i = 0; i < listaEVA.size() - 1; i++) {
                            System.out.println(i + "=" + listaEVA.get(i));
                        }
                        break;
                    case 2:
                        for (int i = 0; i < listaAngeles.size() - 1; i++) {
                            System.out.println(i + "=" + listaAngeles.get(i));
                        }
                        break;
                    case 3:
                        int op = 0;
                        try {
                            do {
                                System.out.println("CRUD DE PILOTOS \n"
                                        + "1. Agregar Piloto \n"
                                        + "2. Listar Pilotos \n"
                                        + "3. Modificar Pilotos \n"
                                        + "4. Eliminar Pilotos \n"
                                        + "5. Salir \n");
                                op = sc.nextInt();
                                switch (op) {
                                    case 1:
                                        crear();
                                        break;
                                    case 2:
                                        listar();
                                        break;
                                    case 3:
                                        mod();
                                        break;
                                    case 4:
                                        eliminar();
                                        break;
                                    default:
                                        System.out.println("Valor no contiene opcion.");
                                        break;
                                }
                            } while (op != 5);
                        } catch (Exception e) {
                            System.out.println("Error de valores ingresados en el menu.");
                        }
                        break;
                    case 4:
                        do {
                            try {
                                imprimir(tokyo3);
                                if (turno % 2 == 0) {
                                    actualJ = 1;
                                } else {
                                    actualJ = 2;
                                }
                                switch (actualJ) {
                                    //si es el jugador 1
                                    case 1: //mover EVA
                                        try {
                                            System.out.println("Escoja un Eva\n"
                                                    + "X: ");
                                            x = sc.nextInt();
                                            System.out.println("\nY: ");
                                            y = sc.nextInt();
                                            //verificar si hay un EVA
                                            //PRODMASA = "PM ", EVA_00 = "EV0", EVA_01 = "EV1", EVA_02 = "EV2"
                                            System.out.println(tokyo3[x][y]);
                                            if (tokyo3[x][y].equals("[" + PRODMASA + "] ")) {
                                                System.out.println("Es PM");
                                                caracter = PRODMASA;
                                            } else if (tokyo3[x][y].equals("[" + EVA_00 + "] ")) {
                                                System.out.println("Es EVA-00");
                                                caracter = EVA_00;
                                            } else if (tokyo3[x][y].equals("[" + EVA_01 + "] ")) {
                                                System.out.println("Es EVA-01");
                                                caracter = EVA_01;
                                            } else if (tokyo3[x][y].equals("[" + EVA_02 + "] ")) {
                                                System.out.println("Es EVA-03");
                                                caracter = EVA_02;
                                            } else {
                                                System.out.println("No es un EVA");
                                            }
                                            //} 
//                                            }
//                                        }
                                            System.out.println("1 Mover\n"
                                                    + "2 Atacar\n"
                                                    + "Ingrese que desea hacer");
                                            int valid = sc.nextInt();
                                            switch (valid) {
                                                case 1: //JUGADOR 1
                                                    try {
                                                        System.out.println("Ingrese mover en X: ");
                                                        xNueva = sc.nextInt();
                                                        System.out.println("Ingrese mover en Y: ");
                                                        yNueva = sc.nextInt();
                                                    } catch (Exception e) {
                                                        System.out.println("No hay posiciones");
                                                    }

                                                    //validar movimiento dependiendo del eva
                                                    if (caracter == EVA_00) {
                                                        validacion = eva0.Movimiento(tokyo3, x, y, xNueva, yNueva);
                                                    } else if (caracter == EVA_01) {
                                                        validacion = eva1.Movimiento(tokyo3, x, y, xNueva, yNueva);
                                                    } else if (caracter == EVA_02) {
                                                        validacion = eva2.Movimiento(tokyo3, x, y, xNueva, yNueva);
                                                    } else if (caracter == PRODMASA) {
                                                        validacion = evapm.Movimiento(tokyo3, x, y, xNueva, yNueva);
                                                    }
                                                    System.out.println(validacion);
                                                    if (validacion == true) {
                                                        //aqui lo muevo
                                                        System.out.println("Moviendo");
                                                        if (caracter == PRODMASA) {
                                                            if (x == xPM1 && y == yPM1) {
                                                                xPM1 = xNueva;
                                                                yPM1 = yNueva;
                                                            } else if (x == xPM2 && y == yPM2) {
                                                                xPM2 = xNueva;
                                                                yPM2 = yNueva;

                                                            } else if (x == xPM3 && y == yPM3) {
                                                                xPM3 = xNueva;
                                                                yPM3 = yNueva;

                                                            } else if (x == xPM4 && y == yPM4) {
                                                                xPM4 = xNueva;
                                                                yPM4 = yNueva;

                                                            }

                                                            tokyo3[xNueva][yNueva] = "[" + PRODMASA + "] ";
                                                            tokyo3[x][y] = "[" + neutro + "] ";
                                                            turno++;
                                                        } else if (caracter == EVA_00) {
                                                            if (x == x00p && y == y00p) {
                                                                x00p = xNueva;
                                                                y00p = yNueva;
                                                            } else if (x == x00s && y == y00s) {
                                                                x00s = xNueva;
                                                                y00s = yNueva;

                                                            }
                                                            tokyo3[xNueva][yNueva] = "[" + EVA_00 + "] ";
                                                            tokyo3[x][y] = "[" + neutro + "] ";
                                                            turno++;
                                                        } else if (caracter == EVA_01) {
                                                            x01 = xNueva;
                                                            y01 = yNueva;
                                                            tokyo3[xNueva][yNueva] = "[" + EVA_01 + "] ";
                                                            tokyo3[x][y] = "[" + neutro + "] ";
                                                            turno++;
                                                        } else if (caracter == EVA_02) {
                                                            x02 = xNueva;
                                                            y02 = yNueva;
                                                            tokyo3[xNueva][yNueva] = "[" + EVA_02 + "] ";
                                                            tokyo3[x][y] = "[" + neutro + "] ";
                                                            turno++;
                                                        }

                                                    } else {
                                                        System.out.println("No se movio");
                                                        turno++;
                                                    }

                                                    break;
                                                case 2: //ATACAR                                                    

                                                    break;
                                                default:
                                                    System.out.println("Opcion no valida");

                                            }
                                        } catch (Exception e) {
                                        }
                                        //aqui finaliza el jugador 1
                                        break;
                                    case 2:
                                        //aqui va el jugador 2
                                        //AQUI VAN LOS ANGELES
                                        //SACHIEL = "-S-", RAMIEL = "-R-", ZERUEL = "-Z-"
                                        try {
                                            System.out.println("Escoja un Angel\n"
                                                    + "X: ");
                                            x = sc.nextInt();
                                            System.out.println("\nY: ");
                                            y = sc.nextInt();
                                            //verificar si hay un EVA
                                            //PRODMASA = "PM ", EVA_00 = "EV0", EVA_01 = "EV1", EVA_02 = "EV2"
                                            System.out.println(tokyo3[x][y]);
                                            if (tokyo3[x][y].equals("[" + SACHIEL + "] ")) {
                                                System.out.println("Es Sachiel");
                                                caracter = SACHIEL;
                                            } else if (tokyo3[x][y].equals("[" + RAMIEL + "] ")) {
                                                System.out.println("Es Ramiel");
                                                caracter = RAMIEL;
                                            } else if (tokyo3[x][y].equals("[" + ZERUEL + "] ")) {
                                                System.out.println("Es Zeruel");
                                                caracter = ZERUEL;
                                            } else {
                                                System.out.println("No es un Angel");
                                            }

                                            System.out.println("1 Mover\n"
                                                    + "2 Atacar\n"
                                                    + "Ingrese que desea hacer");
                                            int valid = sc.nextInt();
                                            switch (valid) {
                                                case 1: //JUGADOR 2
                                                    try {
                                                        System.out.println("Ingrese mover en X: ");
                                                        xNueva = sc.nextInt();
                                                        System.out.println("Ingrese mover en Y: ");
                                                        yNueva = sc.nextInt();
                                                    } catch (Exception e) {
                                                        System.out.println("No hay posiciones");
                                                    }

                                                    //validar movimiento dependiendo del angel
                                                    if (caracter == SACHIEL) {
                                                        validacion = sac.Movimiento(tokyo3, x, y, xNueva, yNueva);
                                                    } else if (caracter == ZERUEL) {
                                                        validacion = zer.Movimiento(tokyo3, x, y, xNueva, yNueva);
                                                    } else if (caracter == RAMIEL) {
                                                        validacion = ram.Movimiento(tokyo3, x, y, xNueva, yNueva);
                                                    }

                                                    if (validacion) {
                                                        //aqui lo muevo
                                                        System.out.println("Moviendo");
                                                        if (caracter == SACHIEL) {
                                                            if (x == xS1 && y == yS1) {
                                                                xS1 = xNueva;
                                                                yS1 = xNueva;
                                                            } else if (x == xS2 && y == yS2) {
                                                                xS2 = xNueva;
                                                                yS2 = xNueva;
                                                            }

                                                            tokyo3[xNueva][yNueva] = "[" + SACHIEL + "] ";
                                                            tokyo3[x][y] = "[" + neutro + "] ";
                                                            turno++;
                                                        } else if (caracter == ZERUEL) {
                                                            if (x == xZ1 && y == yZ1) {
                                                                xZ1 = xNueva;
                                                                yZ1 = xNueva;
                                                            } else if (x == xZ2 && y == yZ2) {
                                                                xS2 = xNueva;
                                                                yS2 = xNueva;
                                                            } else if (x == xZ3 && y == yZ3) {
                                                                xZ3 = xNueva;
                                                                yZ3 = xNueva;
                                                            } else if (x == xZ4 && y == yZ4) {
                                                                xZ4 = xNueva;
                                                                yZ4 = xNueva;
                                                            }
                                                            tokyo3[xNueva][yNueva] = "[" + ZERUEL + "] ";
                                                            tokyo3[x][y] = "[" + neutro + "] ";
                                                            turno++;
                                                        } else if (caracter == RAMIEL) {
                                                            if (x == xR1 && y == yR1) {
                                                                xR1 = xNueva;
                                                                yR1 = xNueva;
                                                            } else if (x == xR2 && y == yR2) {
                                                                xR2 = xNueva;
                                                                yR2 = xNueva;
                                                            }
                                                            tokyo3[xNueva][yNueva] = "[" + RAMIEL + "] ";
                                                            tokyo3[x][y] = "[" + neutro + "] ";
                                                            turno++;
                                                        }

                                                    } else {
                                                        System.out.println("No se movio");
                                                        turno++;
                                                    }

                                                    break;
                                                case 2: //ATACAR                                                    

                                                    break;
                                                default:
                                                    System.out.println("Opcion no valida");

                                            }
                                        } catch (Exception e) {
                                        }
                                        //aqui termina el jugador 2
                                        break;
                                }
                            } catch (Exception e) {

                            } //fin catch 
                        } while (ANG != 0 || EVA != 0);

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

    public static void crear() {
        try {
            System.out.println("Nombre del piloto: ");
            String nombre = sc.next();
            System.out.println("Edad del piloto: ");
            int edad = sc.nextInt();
            System.out.println("Ingerese un familiar cercano: ");
            String familiar = sc.next();
            System.out.println("Encargado del piloto: ");
            String encargado = sc.next();
            System.out.println("Escuela: ");
            String escuela = sc.next();
            System.out.println("Sincronizacion: ");
            String sinc = sc.next();
            System.out.println("EVA asignado: ");
            String asig = sc.next();
            p = new Piloto(nombre, edad, familiar, encargado, escuela, edad, asig);
            listaPilotos.add(p);
        } catch (Exception e) {
            System.out.println("Error en los ingresos. Asegurese de ingresar valores correctos.");
        }
    }

    public static void listar() {
        for (int i = 0; i < listaPilotos.size(); i++) {
            System.out.println(i + "=" + listaPilotos.get(i));
        }
    }

    public static void mod() {
        System.out.println("Eliga piloto a modificar.");
        int selec;
        try {
            selec = sc.nextInt();
            if (selec > listaPilotos.size() - 1 || selec < 0) {
                System.out.println("Valor ingreasado no es valido.");
            } else {
                System.out.println("Nombre del piloto: ");
                String nombre = sc.next();
                System.out.println("Edad del piloto: ");
                int edad = sc.nextInt();
                System.out.println("Ingerese un familiar cercano: ");
                String familiar = sc.next();
                System.out.println("Encargado del piloto: ");
                String encargado = sc.next();
                System.out.println("Escuela: ");
                String escuela = sc.next();
                System.out.println("Sincronizacion: ");
                String sinc = sc.next();
                System.out.println("EVA asignado: ");
                String asig = sc.next();
                p = new Piloto(nombre, edad, familiar, encargado, escuela, edad, asig);
                listaPilotos.remove(selec);
                listaPilotos.add(p);
                System.out.println("Modificacion completada.");
            }
        } catch (Exception e) {
            System.out.println("Error en los ingresos. Asegurese de ingresar valores correctos.");
        }
    }

    public static void eliminar() {
        System.out.println("Piloto a eliminar.");
        int elim = sc.nextInt();
        try {
            listaPilotos.remove(elim);
        } catch (Exception e) {
            System.out.println("No hay piloto a eliminar.");
        }
    }
}
