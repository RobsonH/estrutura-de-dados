public class Lista {

    private No inicio;

    //Criar a lista
    public Lista(){
        this.inicio = null;
    }
    //Verificando se a lista esta vazia
    public boolean isVazia(){
        return this.inicio == null;
    }

    public void inserirNoInicio(No no){
        if (isVazia()){
            this.inicio = no;
        }else {
            no.setProximo(this.inicio);
            this.inicio = no;
        }
    }

    //imprimindo lista
    public void imprimir(){
        if (isVazia()){
            System.out.println("Lista vazia");
        }else {
            No aux = inicio;
            while (aux != null){
                System.out.println(aux.getElemento());
                aux=aux.getProximo();
            }
        }
    }

}
