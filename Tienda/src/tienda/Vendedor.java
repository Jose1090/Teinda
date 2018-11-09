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
public class Vendedor extends Empleado {
    
    private int comision;
    private seccion seccion;
    private int totalVentas;
    
    public Vendedor(String nombre, int edad, int sueldo){
        super(nombre, edad, sueldo);
        
    }
    
    public Vendedor(String nombre, int edad, int sueldo, int comision, seccion seccion){
        super(nombre, edad, sueldo);
        this.comision = comision;
        this.seccion = seccion;
  
    }
    
    public int getTotalVentas(){
        return  totalVentas;
    }
    @Override
    public int calculoSueldo(){
        int sueldo;
        if(totalVentas > 100000){
            sueldo = (int)(this.getSueldo()+(totalVentas*((float)comision/100)));
        }else{
            sueldo = (super.getSueldo());
        }
        return sueldo;
    
    }
    /**calculo para ventas */
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
}
