package pucese.com.listas;

public class AppSimpleLinkedList {

    public static void main(String[] args) {
        // Especificar el tipo genérico al crear la instancia
        SimpleLinkedList<Integer> listaEnlazadaEntera = new SimpleLinkedList<>();

        listaEnlazadaEntera.addFirst(14);
        listaEnlazadaEntera.addLast(27);
        listaEnlazadaEntera.addLast(9);

        // Para imprimir los elementos, puedes usar el método getAll()
        listaEnlazadaEntera.getAll();
    }
}



