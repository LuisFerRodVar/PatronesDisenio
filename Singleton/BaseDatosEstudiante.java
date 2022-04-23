/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;
import java.util.ArrayList;
/**
 *
 * @author luisf
 */
public class BaseDatosEstudiante {
    private static BaseDatosEstudiante instancia = new BaseDatosEstudiante();
    private ArrayList<Estudiante> lista;
    private BaseDatosEstudiante(){
        lista = new ArrayList<>();
    }
    public static BaseDatosEstudiante getInstance(){
        return instancia;
    }
    public void agregarEstudiante(Estudiante nuevo){
        lista.add(nuevo);
    }
    public Estudiante obtenerEstudiante(String carne){
        Estudiante actual;
        for(int i = 0; i < lista.size(); i ++){
            actual = lista.get(i);
            if(actual.getCarne().equals(carne)){
                return actual;
            }
        }
        return null;
    }
    public void eliminarEstudiante(String carne){
        Estudiante actual;
        for(int i = 0; i < lista.size(); i++){
            actual = lista.get(i);
            if(actual.getCarne().equals(carne)){
                lista.remove(i);
                return;
            }
        }
    }
}
