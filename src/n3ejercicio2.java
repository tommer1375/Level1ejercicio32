import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class n3ejercicio2 {
    public static void main(String[] args) {


        ArrayList<Integer> listaPrimera = new ArrayList<Integer>();
        ArrayList<Integer> listaSegunda = new ArrayList<Integer>();

        int i;
        for (i = 1; i <= 7; i++) {
            listaPrimera.add(i);

        }
        ListIterator iteradorLista= listaPrimera.listIterator();
        while(iteradorLista.hasNext()){
            System.out.println(iteradorLista.next());
        }
        System.out.println();
        while(iteradorLista.hasPrevious()){
            int x= (int) iteradorLista.previous();
            listaSegunda.add(x);
        }
        ListIterator iteradorLista2= listaSegunda.listIterator();
        while(iteradorLista2.hasNext()){
            System.out.println(iteradorLista2.next());
        }

    }


}
