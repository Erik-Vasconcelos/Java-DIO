package pilha;

import java.util.StringJoiner;

public class Pilha {

    private No referenciaEntradaPilha;

    public Pilha() {
        this.referenciaEntradaPilha = null;
    }

    public No top(){
        return referenciaEntradaPilha;
    }

    public No pop(){
        if(!isEmpty()){
            No noPoped = referenciaEntradaPilha;
            referenciaEntradaPilha = referenciaEntradaPilha.getReferenciaProxNo();
            return noPoped;
        }

        return null;
    }

    public void push(No novoNo){
        novoNo.setReferenciaProxNo(referenciaEntradaPilha);
        referenciaEntradaPilha = novoNo;
    }

    public boolean isEmpty(){
        return referenciaEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---------------Pilha---------------\n");

        No auxiliar = referenciaEntradaPilha;

        while(auxiliar != null){
            result.append("[");
            result.append(auxiliar.toString());
            result.append("]\n");

            auxiliar = auxiliar.getReferenciaProxNo();
        }
        result.append("=================");

        return  result.toString();
    }
}
