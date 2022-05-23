/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

/**
 *
 * @author M S I
 */
public class Enfermero {

    private String[] nombreEn;
    private String[] tipoCon;
    private double[] sueldoMensual;

    public Enfermero(String[] a, String[] b, double[] c) {
        nombreEn = a;
        tipoCon = b;
        sueldoMensual = c;
    }

    public void establecerNombreEn(String[] a) {
        nombreEn = a;
    }

    public void establecerTipoCon(String[] a) {
        tipoCon = a;
    }

    public void establecerSueldoMensual(double[] a) {
        sueldoMensual = a;
    }

    public String[] obtenerNombreEn() {
        return nombreEn;
    }

    public String[] obtenerTipoCon() {
        return tipoCon;
    }

    public double[] obtenerSueldoMensual() {
        return sueldoMensual;
    }

}
