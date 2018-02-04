package bo.edu.umss.cs.ceis;

abstract public class AnimalesDomesticos {
    private String nombre;
    private String color;
    public AnimalesDomesticos(String n, String c){
        nombre = n;
        color = c;
    }
    abstract public void saludar ();
}
