/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_rodrigovelasquez_ricardogonzalez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class CRUD {

    static ArrayList<Piloto> listaPilotos = new ArrayList();
    static Piloto p;
    static Scanner sc = new Scanner(System.in);

    public void crear() {
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

    public void listar() {
        for (int i = 0; i < listaPilotos.size(); i++) {
            System.out.println(listaPilotos.get(i));
        }
    }

    public void mod() {
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
    
    public void eliminar(){
        System.out.println("Piloto a eliminar.");
        int elim = sc.nextInt();
        try {
            listaPilotos.remove(elim);
        } catch (Exception e) {
            System.out.println("No hay piloto a eliminar.");
        }
    }

}
