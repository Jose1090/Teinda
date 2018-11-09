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
public class Administrativo extends Empleado{
    private int cod_admin;
    private int comision;
    
    public Administrativo(String nombre, int edad, int sueldo){
        super(nombre, edad, sueldo);
    }
    public Administrativo(String nombre, int edad, int sueldo, int cod_admin, int comision){
        super(nombre, edad, sueldo);
        this.cod_admin = cod_admin;
        this.comision = comision;
        
    }
    
    
    
}
