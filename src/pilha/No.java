package pilha;

import java.util.StringJoiner;

public class No {

    private int valor;
    private No referenciaProxNo;

    public No(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getReferenciaProxNo() {
        return referenciaProxNo;
    }

    public void setReferenciaProxNo(No referenciaProxNo) {
        this.referenciaProxNo = referenciaProxNo;
    }

    @Override
    public String toString() {
        return "Valor: " + valor;
    }
}
