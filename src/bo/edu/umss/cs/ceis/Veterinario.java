package bo.edu.umss.cs.ceis;

public class Veterinario {
    AnimalesDomesticos animal;

    public Veterinario(AnimalesDomesticos animal){
        this.animal = animal;
    }
    public void curar(){
        if(this.animal instanceof Gato)
            System.out.println("Se esta curando al gato");
        else
            System.out.println("Se esta curando al perro");
        this.animal.saludar();
    }
}
