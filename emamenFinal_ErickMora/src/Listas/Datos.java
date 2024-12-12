
package Listas;

import Clase.Admin;
import Clase.SubEstudiante;
import java.util.ArrayList;

//Guardar los datos
public class Datos {
    public static ArrayList<SubEstudiante>ListaEstudiantes= new ArrayList<>(); 
    public static ArrayList<Admin>ListaAdnin= new ArrayList<>(); 
   
    public static ArrayList<SubEstudiante> getListaEstudiantes() {
        return ListaEstudiantes;
    }

    public static ArrayList<Admin> getListaAdnin() {
        return ListaAdnin;
    }

    public static void setListaAdnin(ArrayList<Admin> ListaAdnin) {
        Datos.ListaAdnin = ListaAdnin;
    }

    public static void setListaEstudiantes(ArrayList<SubEstudiante> ListaEstudiantes) {
        Datos.ListaEstudiantes = ListaEstudiantes;
    }
    
    
    
}



