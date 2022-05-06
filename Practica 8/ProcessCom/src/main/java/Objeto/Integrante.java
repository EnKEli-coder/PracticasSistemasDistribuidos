/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objeto;

import java.io.Serializable;

/**
 *
 * @author OMAR
 */
public class Integrante implements Serializable{
    private String nombre;
    private String matricula;
    private String correo;

    Integrante(){
        super();
    }

    public Integrante(String nombre, String matricula, String correo){
        this.nombre = nombre;
        this.matricula = matricula;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
