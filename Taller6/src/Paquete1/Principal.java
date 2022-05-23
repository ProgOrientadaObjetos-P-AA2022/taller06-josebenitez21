/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete1;

import Paquete2.Hospitalaria;
import Paquete2.Medico;
import Paquete2.CiudadHospital;
import Paquete2.Enfermero;
import java.util.Scanner;

/**
 *
 * @author M S I
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        String hos;
        String provincia;
        String ciudad;
        String direccion;
        int respuesta;
        int respuesta1;

        System.out.println("Ingrese el nombre del Hospital");
        hos = entrada.nextLine().toUpperCase();

        System.out.println("Ingrese la direccion del Hospital");
        direccion = entrada.nextLine();

        System.out.println("Ingrese la ciudad del Hospital");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese la provincia del Hospital");
        provincia = entrada.nextLine();

        CiudadHospital city = new CiudadHospital(direccion, ciudad, provincia);

        System.out.println("Ingrese la cantidad de medicos disponibles en el"
                + " Hospital");
        respuesta = entrada.nextInt();
        entrada.nextLine();

        double[] sueldo = new double[respuesta];

        String[] nomMed = new String[respuesta];
        String[] especialidad = new String[respuesta];
        sueldo = new double[respuesta];

        for (int i = 0; i < respuesta; i++) {

            System.out.println("Ingrese el nombre del medico");
            nomMed[i] = entrada.nextLine();

            System.out.println("Ingrese la especialidad");
            especialidad[i] = entrada.nextLine();

            System.out.println("Ingrese el sueldo del medico");
            sueldo[i] = entrada.nextDouble();
            entrada.nextLine();
        }
        Medico doc = new Medico(nomMed, especialidad, sueldo);
        System.out.println("Ingrese la cantidad de enfermeros disponibles en el"
                + " Hospital");
        respuesta1 = entrada.nextInt();
        double[] sueldo1 = new double[respuesta];
        String[] nomEnf = new String[respuesta1];
        String[] tipoCont = new String[respuesta1];
        entrada.nextLine();
        for (int i = 0; i < respuesta1; i++) {

            System.out.println("Ingrese el nombre del Enfermero");
            nomEnf[i] = entrada.nextLine();

            System.out.println("Ingrese el tipo de contrato (contratado o nombramiento)");
            tipoCont[i] = entrada.nextLine();

            System.out.println("Ingrese el sueldo del enfermero");
            sueldo1[i] = entrada.nextDouble();
            entrada.nextLine();
        }
        Enfermero enf = new Enfermero(nomEnf, tipoCont, sueldo1);

        Hospitalaria hosp = new Hospitalaria(hos, city, doc, enf);

        hosp.establecerNumeroEs(respuesta, respuesta1);
        hosp.establecerSueldos(sueldo, sueldo1);
        System.out.printf("------------INFORMACION----------------- \n%s", hosp);
    }

}
