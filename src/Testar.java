public class Testar {

    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.imprimir();
        lista.inserirNoInicio(new No(10));
        lista.inserirNoInicio(new No(12));
        lista.inserirNoFim(new No(8));
        lista.inserirNoFim(new No (7));
        lista.inserir(new No (9),3);
        lista.imprimir();
    }
}
