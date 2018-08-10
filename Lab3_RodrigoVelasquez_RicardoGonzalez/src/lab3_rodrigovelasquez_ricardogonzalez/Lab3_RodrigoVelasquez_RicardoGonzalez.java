package lab3_rodrigovelasquez_ricardogonzalez;

import java.util.Scanner;

public class Lab3_RodrigoVelasquez_RicardoGonzalez {
public static Scanner sc = new Scanner(System.in);
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
