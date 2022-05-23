/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

/**
 *
 * @author M S I
 */
public class Medico {
        private String []nombreDoc;
        private String []especialidadDoc;
        private double []sueldoMensual;

    public Medico(String []a, String []b, double []c) {
        nombreDoc = a;
        especialidadDoc = b;
        sueldoMensual = c;
    }

        
    public void establecerNombreDoc(String []a) {
        nombreDoc = a;
    }

    public void establecerEspecialidadDoc(String []a) {
        especialidadDoc = a;
    }

    public void establecerSueldoMensual(double []a) {
        sueldoMensual = a;
    }

    public String []obtenerNombreDoc() {
        return nombreDoc;
    }

    public String [] obtenerEspecialidadDoc() {
        return especialidadDoc;
    }

    public double []obtenerSueldoMensual() {
        return sueldoMensual;
    }
        
        
    
}
