package estrategias;

public class SomenteMinusculas implements EstrategiaSenha {

    @Override
    public String gerar(int tamanho) {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        return GerarSenha.gerarSenha(chars, tamanho);
    }
}
