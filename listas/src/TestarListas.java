public class TestarListas {

    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.imprimir();
        lista.inserirNoInicio( new No(45));
        lista.inserirNoInicio( new No(30));
        lista.inserirNoInicio( new No(28));
        lista.imprimir();
    }
}
