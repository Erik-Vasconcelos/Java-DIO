package nos;

import java.util.StringJoiner;

public class No<T> {

    //Um nó guarda um espaço para o seu valor e a referencia para um próximo

    private T conteudo;
    private No<T> proximoNo;

    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", No.class.getSimpleName() + "[", "]")
                .add("conteudo='" + conteudo + "'")
                .toString();
    }
}
