package Sort_Iterraciones;

import java.util.Random;
import java.util.ArrayList;

//ALAN ALBERTO GÓMEZ GÓMEZ  203429
//GABRIEL RAMÓN CUPIL 203424
//STEVEN DE JESÚS PADILLA GUTIÉRREZ 203426

public class Main {

    public static void main(String[] args) {
        Sort<Datos> sort = new Sort<>();
        int contador = 150;

        System.out.println("ITERACIONES QUICKSORT");
        //int contador = 150;
        for(int i=0 ; i<5 ; i++){
            sort.setIter();
            ArrayList<Datos> lista = llenarObjetos(contador);
            int iter = sort.quickSort(lista, 0, lista.size()-1);
            System.out.println("Tamaño: " + lista.size() + "\tIteraciones: " + iter);
            contador = contador + 150;
        }


        System.out.println("");
        contador = 150;


        System.out.println("ITERACIONES CYCLESORT");
        //int contador = 150;
        for(int i=0 ; i<5 ; i++){
            sort.setIter();
            ArrayList<Datos> lista = llenarObjetos(contador);
            sort.cycleSort(lista, lista.size());
            System.out.println("Tamaño: " + lista.size() + "\tIteraciones: " + sort.getIter());
            contador = contador + 150;
        }


        System.out.println("");
        contador = 150;


        System.out.println("ITERACIONES MERGE");
        //int contador = 150;
        for(int i=0 ; i<5 ; i++){
            sort.setIter();
            ArrayList<Datos> lista = llenarObjetos(contador);
            sort.sort(lista, 0, lista.size()-1);
            System.out.println("Tamaño: " + lista.size() + "\tIteraciones: " + sort.getIter());
            contador = contador + 150;
        }


        System.out.println("");
        contador = 150;


        System.out.println("ITERACIONES FISHER-YITES");
        //int contador = 150;
        for(int i=0 ; i<5 ; i++){
            sort.setIter();
            ArrayList<Datos> lista = llenarObjetos(contador);
            int iter = sort.fisherYates(lista,lista.size()-1);
            System.out.println("Tamaño: " + lista.size() + "\tIteraciones: " + iter);
            contador = contador + 150;
        }
    }

    public static ArrayList<Datos> llenarObjetos(int contador){
        ArrayList<Datos> lista = new ArrayList<>();
        lista.clear();
        Integer numero;
        char tempC;
        String letra;
        Random r = new Random();

        for(int i=1 ; i<=contador ; i++){

            numero = r.nextInt(10000-0) + 0;
            tempC = (char)(r.nextInt(25) + 'a');
            letra = Character.toString(tempC);

           Datos datos = new Datos(letra,numero);

           lista.add(datos);
        }

    return lista;
    } 
}
