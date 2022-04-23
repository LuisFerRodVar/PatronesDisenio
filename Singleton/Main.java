/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author luisf
 */
public class Main {
    public static void main(String[] args) {
        BaseDatosEstudiante baseDatos = BaseDatosEstudiante.getInstance();
        //Agrega estudiantes a la base de datos
        baseDatos.agregarEstudiante(new Estudiante("Pablo", "C02356","Pablo@ucr.ac.cr"));
        baseDatos.agregarEstudiante(new Estudiante("Miguel", "C13324","Miguel@ucr.ac.cr"));
        baseDatos.agregarEstudiante(new Estudiante("Ana", "B98932","Ana@ucr.ac.cr"));
        
        baseDatos.eliminarEstudiante("C13324"); //Elimina a Miguel
        
        Estudiante unEstudiante = baseDatos.obtenerEstudiante("B98932"); //Obtiene el objeto que representa a Ana
    }
}
