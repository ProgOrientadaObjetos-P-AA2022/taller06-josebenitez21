/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

/**
 *
 * @author M S I
 */
public class Hospitalaria {

    private String nombreHosp;
    private CiudadHospital ciudadHosp;
    private int numeroEs;
    private int numeroEs1;
    private Medico medicos;
    private Enfermero enfermeros;
    private double sueldos;
    private String dirHosp;

    public Hospitalaria(String a, CiudadHospital b,
            Medico d, Enfermero e) {
        nombreHosp = a;
        ciudadHosp = b;
        medicos = d;
        enfermeros = e;

    }

    public void establecerNombreHosp(String a) {
        nombreHosp = a;
    }

    public void establecerCiudadHosp(CiudadHospital a) {
        ciudadHosp = a;
    }

    public void establecerNumeroEs(int a, int g) {
        numeroEs = a + g;
    }

    public void establecerMedicos(Medico a) {
        medicos = a;
    }

    public void establecerEnfermeros(Enfermero a) {
        enfermeros = a;
    }

    public void establecerSueldos(double[] a, double[] b) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        sueldos = sum;
    }

    public String obtenerNombreHosp() {
        return nombreHosp;
    }

    public CiudadHospital obtenerCiudadHosp() {
        return ciudadHosp;
    }

    public int obtenerNumeroEs() {
        return numeroEs;
    }

    public Medico obtenerMedicos() {
        return medicos;
    }

    public Enfermero obtenerEnfermeros() {
        return enfermeros;
    }

    public double obtenerSueldos() {
        return sueldos;
    }
    
    @Override
    public String toString() {
        
        String cadenaFinal1 = "";
        String cadenaFinal2 = "";
        String cadenaFinal3;

        for (int i = 0; i < obtenerMedicos().obtenerSueldoMensual().length; i++) {
            cadenaFinal1 = String.format("%s\n- %s - Sueldo: %.2f - %s",cadenaFinal1,
                    obtenerMedicos().obtenerNombreDoc()[i],
                    obtenerMedicos().obtenerSueldoMensual()[i],
                    obtenerMedicos().obtenerEspecialidadDoc()[i]);
        }
        
        for (int i = 0; i < obtenerEnfermeros().obtenerSueldoMensual().length; i++) {
            cadenaFinal2 = String.format("%s\n- %s - Sueldo: %.2f - %s",cadenaFinal2,
                    obtenerEnfermeros().obtenerNombreEn()[i],
                    obtenerEnfermeros().obtenerSueldoMensual()[i],
                    obtenerEnfermeros().obtenerTipoCon()[i]);
        }
        cadenaFinal3 = String.format("%s\nDireccion: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Numero de especialidades: %d\n"
                + "Listado de Médicos:%s\n"
                + "Listado de Enfermeros(as):%s\n"
                + "Total de sueldos a pagar por mes: $%.2f\n", obtenerNombreHosp(),
                obtenerCiudadHosp().obtenerDir(),
                obtenerCiudadHosp().obtenerCiudad(),
                obtenerCiudadHosp().obtenerProvincia(),
                obtenerNumeroEs(), cadenaFinal1, cadenaFinal2,
                obtenerSueldos());

        return cadenaFinal3;
    }

}
