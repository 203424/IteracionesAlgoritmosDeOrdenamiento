package Sort_Iterraciones;

import java.util.ArrayList;
import java.util.Random;

public class Sort <T extends Comparable<T>>{
    int iter;

    public void setIter(){
        this.iter = 0;
    }

    public int getIter(){
        return iter;
    }

    public int quickSort(ArrayList<T> lista, int left, int right){
        int i = left;
        int j = right;
        T temp;
        T pivot = lista.get((left + right) / 2);
        while(i <= j){

            while(lista.get(i).compareTo(pivot) < 0){
                i++;
                iter++;
            }

            while(lista.get(j).compareTo(pivot) > 0){
                j--;
                iter++;
            }

            if(i <= j){
                temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
                i++;
                j--;
            }
        }

        if(left < i - 1){
            quickSort(lista, left, i - 1);
        }
        if(i < right){
            quickSort(lista, i, right);
        }

        //return lista;
        return iter;
    }

    public int cycleSort(ArrayList<T> array, int tam) {
        int posicion;
        T elemento, temp;
        for (int inicio = 0; inicio <= tam - 2; inicio++) {
            elemento = array.get(inicio);
            posicion = inicio;
            for (int i = inicio + 1; i < tam; i++) {

                if (array.get(i).compareTo(elemento) < 0) {
                    posicion++;
                    iter++;
                }
            }
            if (posicion == inicio) {
                continue;
            }
            while (elemento.compareTo(array.get(posicion)) == 0) {
                posicion += 1;
                iter++;
            }
            if (posicion != inicio) {
                temp = elemento;
                elemento = array.get(posicion);
                array.set(posicion, temp);

            }
            while (posicion != inicio) {
                posicion = inicio;
                for (int i = inicio + 1; i < tam; i++) {

                    if (array.get(i).compareTo(elemento) < 0) {
                        posicion += 1;
                    }
                    iter++;
                }
                while (elemento.compareTo(array.get(posicion)) == 0) {
                    posicion += 1;
                    iter++;
                }
                if (elemento.compareTo(array.get(posicion)) != 0) {
                    temp = elemento;
                    elemento = array.get(posicion);
                    array.set(posicion, temp);
                }
                iter++;
            }
        }


        return iter;
    }

    public void sort(ArrayList<T> arr, int left, int right){
        if(left < right){
            int middle = (left + right) / 2;
            sort(arr, left, middle);
            sort(arr, middle+1, right);
            merge(arr, left, middle, right);
        }
        //return arr;
    }

    public int merge(ArrayList<T> arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        ArrayList<T> leftArray = new ArrayList<>();
        ArrayList<T> rightArray = new ArrayList<>();
        for(int i=0; i<n1;i++){
            leftArray.add(arr.get(i));
        }
        for(int i=0; i<n2;i++){
            rightArray.add(arr.get(i));
        }
      
        for (int i=0; i < n1; i++) {
            leftArray.set(i, arr.get(left+i));
        }
        for (int j=0; j < n2; j++) {
            rightArray.set(j, arr.get(middle + j + 1));
        }
      
        int i = 0, j = 0;
      
        int k = left;
      
        while (i < n1 && j < n2) {
            iter++;
            if (leftArray.get(i).compareTo(rightArray.get(j)) <=0) {
                arr.set(k, leftArray.get(i));
                i++;
          } else {
              arr.set(k, rightArray.get(j));
              j++;
          }
          k++;
        }
        
        while (i < n1) {
            arr.set(k, leftArray.get(i));
            i++;
            k++;
        }
        
        while (j < n2) {
            arr.set(k, rightArray.get(j));
            j++;
            k++;
        }

        return iter;
    }
    
    public int fisherYates(ArrayList<T> lista, int n){

        Random r = new Random();

        for(int i = n ; i >= 0 ; i--){
            iter++;
            int j = r.nextInt(i+1);

            T temp = lista.get(i);

            lista.set(i, lista.get(j));
            lista.set(j, temp);
        }
        
        return iter;
    }

}