package pilha.exercicio;

/**
 * @author Erik Vasconcelos
 * @since 11/03/2023
 * @param <T>
 */
public class PilhaGeneric<T> {

    private NoGenerico<T> refNoTopo;

    public PilhaGeneric() {
        this.refNoTopo = null;
    }

    public T pop(){
        if (!isEmpty()){
            NoGenerico<T> noPoped = refNoTopo;
            refNoTopo = refNoTopo.getRefProximoNo();

            return noPoped.getValor();
        }
        return null;
    }

    public void push(T valor){
        NoGenerico<T> novoNo = new NoGenerico<>(valor);
        novoNo.setRefProximoNo(refNoTopo);
        refNoTopo = novoNo;
    }

    public T top(){
        return refNoTopo.getValor();
    }

    public void clear(){
        while (refNoTopo != null){
            refNoTopo = refNoTopo.getRefProximoNo();
        }

    }

    public boolean isEmpty(){
        return refNoTopo == null ? true : false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("---------------PilhaGeneric-------------\n");

        NoGenerico<T> noCount = refNoTopo;

        while (noCount != null){
            sb.append("[");
            sb.append(noCount.getValor());
            sb.append("]\n");

            noCount = noCount.getRefProximoNo();
        }

        sb.append("=================================");

        return sb.toString();
    }
}
