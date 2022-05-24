package colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Mazo implements Iterable<String> {

    private ArrayList<String> mazo = new ArrayList<>();
    // Añadir objetos al array
    public void addObject(Magic c){
        mazo.add(c.toString());
    }
    // Listar cartas
    public void listar(){
        for(String c:mazo) {
            System.out.println(c);
        }

    }

    @Override
    public Iterator<String> iterator() {
        return mazo.iterator();
    }
}
