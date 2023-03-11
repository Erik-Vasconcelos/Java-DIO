package pilha.exercicio;

/**
 * @author Erik Vasconcelos
 * @since 11/03/2023
 * @param <T>
 */
public class NoGenerico<T> {

    private T valor;

    private NoGenerico<T> refProximoNo;

    public NoGenerico(T valor) {
        this.refProximoNo = null;
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public NoGenerico<T> getRefProximoNo() {
        return refProximoNo;
    }

    public void setRefProximoNo(NoGenerico<T> refProximoNo) {
        this.refProximoNo = refProximoNo;
    }

    @Override
    public String toString() {
        return "Valor: " + valor;
    }
}
