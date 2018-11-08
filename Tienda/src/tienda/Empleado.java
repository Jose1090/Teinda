/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author Alumno
 */
public abstract class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private String rut;
    private int sueldo;
    
    public Empleado(){}
    
    public Empleado(String nombre, String apellido, int edad, String rut, int sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rut = rut;
        this.sueldo = sueldo;
        
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    } 
    public String getRut(){
        return rut;
    }
    public int getSueldo(){
        return sueldo;
        
    }
    public abstract int calculoSueldo();
            
        
    
            
    
}
