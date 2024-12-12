/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;


public class SubEstudiante extends Persona {//se extiende de Persona 
    //se crean string para poder poner get y set para el uso 
    private String carrera;
    private String Usuario;
    private String Contraseña;
    public SubEstudiante(String carrera, String nombreCompleto, int edad, String usuario, String contraseña, String rol) {
        super(nombreCompleto, edad, usuario, contraseña, rol);
        this.Contraseña=contraseña;
        this.Usuario=usuario;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
}
  
