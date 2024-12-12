/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author erick
 */
public class SubProfesor extends Persona {
    private String curso;
    private int año;

    public SubProfesor(String curso, int año, String nombreCompleto, int edad, String usuario, String contraseña, String rol) {
        super(nombreCompleto, edad, usuario, contraseña, rol);
        this.curso = curso;
        this.año = año;
    }

    

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int anio) {
        this.año = anio;
    }
}

