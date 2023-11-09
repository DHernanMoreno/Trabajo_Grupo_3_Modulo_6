


package Helpers;

public class Deportista extends Persona {
    // Atributos específicos de la subclase Deportista
    
      public Deportista (){
      Identidad ("1627200089009");
      EstablecerNombre("Carlos Moreira");
      EstablecerEdad(27);
      EstablecerProfesion("Deportista");
      EstablecerCorreo("C_Moreira@gmail.com");
      Establecertelefono("89578998");
    }
    
    /**
    private String deporte;
    private String equipo;

    // Constructor que utiliza el constructor de la superclase Persona
    public Deportista(String ID, String Nombre, double Edad, String Correo, String Profesion, String Telefono,
                      String deporte, String equipo) {
        super.ID = ID;
        super.Nombre = Nombre;
        super.Edad = Edad;
        super.Correo = Correo;
        super.Profesion = Profesion;
        super.Telefono = Telefono;
        this.deporte = deporte;
        this.equipo = equipo;
    }

    // Métodos específicos de la subclase Deportista
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    // Método para imprimir información específica de la subclase Deportista
    public void imprimirDeportista() {
        System.out.println("Deporte: " + deporte);
        System.out.println("Equipo: " + equipo);
    }

    // Método para imprimir información general de la persona (incluyendo la específica de Deportista)
    @Override
    public void imprimirgeneral() {
        super.imprimirgeneral();
        imprimirDeportista();
    }
    */
}

