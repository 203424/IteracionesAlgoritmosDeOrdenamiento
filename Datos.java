package Sort_Iterraciones;

public class Datos implements Comparable<Datos> {

    private String letra;
    private Integer numero;
    
    public Datos(String letra, Integer numero){
        this.letra = letra;
        this.numero = numero;
    }

     @Override
    public int compareTo(Datos d){
        int resultado = this.letra.compareTo(d.letra);
        if (resultado == 0){
            return this.numero.compareTo(d.numero);
        }
        return resultado;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String toString() {
        return "Datos [letra=" + letra + ", numero=" + numero + "]";
    }
   
}