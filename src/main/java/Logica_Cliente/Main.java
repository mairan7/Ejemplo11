/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Persona;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre="";
        int ID=0;
        int añonacimiento=0;
        int añoactual=2023;
        int resultado=0;
        
        Persona objpersona= new Persona();
        
        Scanner scan= new Scanner (System.in);
        
        
        System.out.println("ingrese el nombre de la persona");
        nombre=scan.nextLine();
        objpersona.setNombre(nombre);
        
        
        
        System.out.print("ingrese el ID de la persona");
        ID=scan.nextInt();
        objpersona.setID(ID);
        
        System.out.print("ingrese el año de nacimiento de la persona");
        añonacimiento=scan.nextInt();
        objpersona.setAñonacimiento(añonacimiento);
        
        
        resultado = añoactual-objpersona.getAñonacimiento();
        
        
        System.out.println("el nombre de la persona es:"+"\t"+objpersona.getNombre());
        
        System.out.print("la ID de la persona es:"+"\t"+objpersona.getID());
        
        System.out.print("la edad de la persona es:"+"\t"+resultado);
        
        
        
    }
    
}
