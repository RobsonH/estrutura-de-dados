public class Lista {

    private No inicio;
    private No fim;
    private int quantidade;

    public Lista() {
        inicio = fim = null;
        quantidade = 0;
    }

    public boolean isVazia(){
        return inicio == null;
    }

    public void inserirNoInicio(No no){
        if (isVazia()){
            inicio = fim = no;
        }else{
            no.setProximo(inicio);
            inicio.setAnterior(no);
            inicio=no;

        }
        quantidade ++;
    }

    public void inserirNoFim (No no){
        if (isVazia()){
            inicio = no;
            fim = no;
        }else{
            no.setAnterior(fim);
            fim.setProximo(no);
            fim=no;
        }
        quantidade ++;
    }
    public void inserir (No no, int posicao){
        if (isVazia() || posicao ==1 ){
            inserirNoInicio(no);
        }else if (posicao > quantidade){
            inserirNoFim(no);
        }else{
            No aux = inicio;
            for (int i = 1; i< posicao; i++){
                aux = aux.getProximo();
            }
            no.setProximo(aux);
            no.setAnterior(aux.getAnterior());
            no.getAnterior().setProximo(no);
            aux.setAnterior(no);

        }


    }


    //imprimindo lista
    public void imprimir(){
        if (isVazia()) {
            System.out.println("A lista esta vazia");
        }else {
            No aux = this.inicio;
            while (aux != null){
                System.out.println(aux.getElemento());
                aux = aux.getProximo();
            }
        }
    }

}

