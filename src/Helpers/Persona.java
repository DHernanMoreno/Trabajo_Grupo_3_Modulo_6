/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author dhern
 */
public class Persona {
    
    //ATRIBUTOS 
    private String ID; // Propiedades generales de toda las subClases Doctor y Deportista.
    private String Nombre; // Propiedades generales de toda las subClases Doctor y Deportista.
    private double Edad; // Propiedades generales de toda las subClases Doctor y Deportista.
    private String Correo; // Propiedades generales de toda las subClases Doctor y Deportista.
    private String Profesion; // Propiedades generales de toda las subClases Doctor y Deportista.
    private String Telefono; // Propiedades generales de toda las subClases Doctor y Deportista.
    
    // Metodos Establecer y obtener 
    
    public void Identidad (String ID){ //Medoto General
       this.ID = ID;  
    }
    
    public String obtenerId () { // 
        return this.ID;
    }
    
    
    
      //-------------------
    public void EstablecerNombre (String Nombre){//Metodo General
       this.Nombre = Nombre;  
    }
    
    public String obtenerNombre () {
        return this.Nombre;
    }
    
    
    //-------------------
    public void EstablecerEdad (double Edad){//Metodo General
       this.Edad = Edad;  
    }
    
    public double obtenerEdad () {
        return this.Edad;
    }
    
    
    
     //-------------------
    public void EstablecerProfesion (String Profesion){//Metodo General
       this.Profesion = Profesion;  
    }
    
    public String obtenerProfesion () {
        return this.Profesion;
    }

        //-------------------
    public void EstablecerCorreo (String Correo){//Metodo General
       this.Correo = Correo;  
    }
    
    public String obtenerCorreo () {
        return this.Correo;
    }
    
         //-------------------
    public void Establecertelefono (String Telefono){//Metodo General
       this.Telefono = Telefono;  
    }
    
    public String obtenertelefono () {
        return this.Telefono;
    }
    
    public void imprimirgeneral (){
       System.out.println("Id de la persona:" + ID); 
       System.out.println("Nombre:" + Nombre); 
       System.out.println("Profesión" + Profesion); 
       System.out.println("Edad" + Edad); 
       System.out.println("Correo" + Correo); 
       System.out.println("Edad" + Telefono);   
    }
    
}
