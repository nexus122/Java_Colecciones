package colecciones;

public class Main {
    public static void main(String[] args) {
        Mazo m = new Mazo();
        m.addObject(new Magic(1, 1, "Ameba", 1,5));
        m.addObject(new Magic(2, 4, "Elfo Oscuro",2,3));
        m.addObject(new Magic(3, 2, "Minotauro",0,4));
        m.addObject(new Magic(4, 3, "Goblin",1,1));

        m.listar();
    }
}
