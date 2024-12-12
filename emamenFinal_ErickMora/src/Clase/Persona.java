/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;


public class Persona extends Usuario{ //se extiende de Usuario
    //la que crea los set get para iniciar sesion en la primera pagina 
    private String nombreCompleto;
    private int edad;

    public Persona(String nombreCompleto, int edad, String usuario, String contraseña, String rol) {
        super(usuario, contraseña, rol);
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
    }
    

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
