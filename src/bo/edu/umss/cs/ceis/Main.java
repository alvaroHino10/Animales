package bo.edu.umss.cs.ceis;

public class Main {

    public static void main(String[] args) {
        AnimalesDomesticos gato = new Gato("Rosi", "Doradito");
        AnimalesDomesticos perro = new Perro("Manchas", "Negro y Blanco", "Meztizo");
        Veterinario roberto = new Veterinario(perro);
        roberto.curar();
        gato.saludar();
        perro.saludar();
    }
}
