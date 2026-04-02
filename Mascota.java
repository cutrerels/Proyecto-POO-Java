class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre; 
        this.especie = especie;
        this.edad = edad;
    }


    public Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = 0; 
    }

    public String obtenerFicha() {
        return "FICHA -> Nombre: " + nombre + " | Especie: " + especie + " | Edad: " + edad + " años";
    }

    public void registrarSintoma(String sintoma) {
        System.out.println("Atención: " + nombre + " presenta el síntoma: " + sintoma);
    }

    public void alimentar() {
        System.out.println(nombre + " está comiendo su ración diaria.");
    }

    public void alimentar(String tipoComida) {
        System.out.println(nombre + " está comiendo un premio de " + tipoComida + ".");
    }
}

public class MyClass {
    public static void main(String args[]) {
        Mascota perro = new Mascota("Rocco", "Canino", 4);
        
        Mascota gato = new Mascota("Luna", "Felino");

        System.out.println("- REGISTRO VETERINARIO -");
        
        System.out.println(perro.obtenerFicha());
        perro.registrarSintoma("Tos leve");
        perro.alimentar(); 

        System.out.println("--");
        
        System.out.println(gato.obtenerFicha());
        gato.alimentar("Pescado"); 
    }
}
