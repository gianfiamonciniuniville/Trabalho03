package estrategias;

public class MinusculasNumeros implements EstrategiaSenha {
    @Override
    public String gerar(int tamanho) {
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        return GerarSenha.gerarSenha(chars, tamanho);
    }
}
