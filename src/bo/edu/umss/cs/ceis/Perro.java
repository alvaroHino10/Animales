package bo.edu.umss.cs.ceis;

public class Perro extends AnimalesDomesticos {

    private String raza;
    public Perro(String n, String c, String r){
        super(n,c);
        raza = r;
    }

    public void saludar(){
        System.out.println("Guau Putito");
    }
}
