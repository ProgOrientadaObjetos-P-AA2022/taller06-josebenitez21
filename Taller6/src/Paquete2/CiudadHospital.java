/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

/**
 *
 * @author M S I
 */
public class CiudadHospital {

    public CiudadHospital(String a, String b, String c) {
        ciudad = a;
        provincia = b;
        dir = c;
  
    }

    private String ciudad;
    private String provincia;
    private String dir;


    public void establecerCiudad(String a) {
        ciudad = a;
    }

    public void establecerProvincia(String a) {
        provincia = a;
    }

    public void establecerDir(String a) {
        dir = a;
    }


    public String obtenerCiudad() {
        return ciudad;
    }

    public String obtenerProvincia() {
        return provincia;
    }

    public String obtenerDir() {
        return dir;
    }



}
