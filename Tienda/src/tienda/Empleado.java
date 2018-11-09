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
    private int edad;
    private int sueldo;
    
    
    
    public Empleado(String nombre, int edad, int sueldo){
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        
    }
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    } 
   
    public int getSueldo(){
        return sueldo;
        
    }
    public abstract int calculoSueldo();
    
    
    public void aumentoSueldo(int aumento){
        this.sueldo += aumento;
    }
            
        
    
            
    
}
