public class listase {
    public No remover(int posicao) {
         
        No aux = null;
        if (!isVazia()) {
            aux = this.inicio;
            No ant = null;

            if (posicao == 1) {
                this.inicio = this.inicio.getProximo();
                this.quantidade--;
            } else if (posicao <= this.quantidade) {
            }
            for (int i = 1; i < posicao; i++) {
                ant = aux;
                aux = aux.getProximo();
            }

            ant.setProximo(aux.getProximo());
            aux.setProximo(null);
            this.quantidade--;
        }

        return aux;

    }

}


