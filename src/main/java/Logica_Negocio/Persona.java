/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author User
 */
public class Persona {
    
  public String nombre;
  public int ID;
  public int edad;
  public int añonacimiento;
  
  public Persona() {}

    public Persona(String nombre, int ID, int edad, int añonacimiento) {
        this.nombre = nombre;
        this.ID = ID;
        this.edad = edad;
        this.añonacimiento = añonacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAñonacimiento(int añonacimiento) {
        this.añonacimiento = añonacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getID() {
        return ID;
    }

    public int getEdad() {
        return edad;
    }

    public int getAñonacimiento() {
        return añonacimiento;
    }

   

   
    
    
}
