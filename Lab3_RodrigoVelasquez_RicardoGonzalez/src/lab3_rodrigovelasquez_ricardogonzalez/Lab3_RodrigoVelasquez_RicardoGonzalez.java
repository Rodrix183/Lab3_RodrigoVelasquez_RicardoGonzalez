package lab3_rodrigovelasquez_ricardogonzalez;

import java.util.Scanner;

public class Lab3_RodrigoVelasquez_RicardoGonzalez {
public static Scanner sc = new Scanner(System.in);
public static String [][] tokyo3 = new String[10][10];
//Evas
public static String PRODMASA = "PM", EVA_00="EV0", EVA_01="EV1", EVA_02="EV2";
//Angeles
public static String SACHIEL = "S", RAMIEL="R", ZERUEL="Z";


    public static void main(String[] args) {
        int resp  = 0;
        while (resp != 5) {
            try {
                System.out.println("1) Lista de EVAs\n"
                        + "2) Lista de Angeles\n"
                        + "3) CRUD Pilotos\n"
                        + "4) Simulacion\n"
                        + "5) Salir\n"
                        + "Ingrese opcion");
                resp = sc.nextInt();
                
                switch(resp){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        for (int i = 0; i < 10; i++) {
                            for (int j = 0; j < 10; j++) {
                                tokyo3[i][j] = "- ";
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
