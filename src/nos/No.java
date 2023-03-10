package nos;

import java.util.StringJoiner;

public class No {

    //Um nó guarda um espaço para o seu valor e a referencia para um próximo

    private String conteudo;
    private No proximoNo;

    public No(String conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
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
