package estrategias;

public class MaiusculasMinusculasNumerosSimbolos implements EstrategiaSenha {
    @Override
    public String gerar(int tamanho) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$&_";
        return GerarSenha.gerarSenha(chars, tamanho);
    }
}
