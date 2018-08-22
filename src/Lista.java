public class Lista {

    private No inicio;
    private No fim;
    private int quantidade;

    public Lista() {
        this.quantidade = 0;
        inicio = fim = null;
    }

    public boolean isVazia() {
        return this.inicio == null;
    }

    public void inserirInicio(No no) {
        if (isVazia()) {
            inicio = no;
            fim = no;
        } else {
            no.setProximo(this.inicio);
            inicio.setProximo(no);
            this.inicio = no;
        }
        quantidade++;
    }

    public void inserirFim(No no) {
        if (isVazia()) {
            inserirInicio(no);
        } else {
            no.setAnterior(this.fim);
            fim.setProximo(no);
            this.fim = no;
        }
        quantidade++;
    }

    public void inserir(No no, int posicao) {
        if (isVazia() || posicao <= 1) {
            inserirInicio(no);
        } else if (posicao > quantidade) {
            inserirFim(no);
        } else {
            No aux = this.inicio;
            for (int i = 1; i < posicao; i++) {
                aux = aux.getProximo();
            }
            no.setProximo(aux);
            no.setAnterior(aux.getAnterior());
            no.getAnterior().setProximo(no);
            aux.setAnterior(no);
        }
        quantidade++;
    }

    public No remover(int posicao){
        No aux = null;
        if (!isVazia() && posicao > 1 && posicao <= quantidade){

            aux=inicio;

            if (posicao ==1){
                inicio = aux.getProximo();
                if (inicio !=null)
                    inicio.setAnterior(null);
            }else if (posicao == quantidade){
                aux = fim;
                fim = fim.getAnterior();
                fim.setProximo(null);
            }else{
                for (int i = 1; i < posicao; i++){
                    aux = aux.getProximo();
                }
                aux.getAnterior().setProximo(aux.getProximo());
                aux.getProximo().setAnterior(aux.getAnterior());
            }
            aux.setProximo(null);
            aux.setAnterior(null);
            quantidade --;
        }
        return aux;
    }

    public void imprimir(){
        if(isVazia()){
            System.out.println("A lista está vazia!");
        }else{
            No aux = this.inicio;
            while(aux != null){
                System.out.println(aux.getElemento());
                aux = aux.getProximo();
            }
        }
    }
}
