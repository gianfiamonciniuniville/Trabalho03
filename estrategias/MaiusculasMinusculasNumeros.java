package estrategias;

public class MaiusculasMinusculasNumeros implements EstrategiaSenha {
    @Override
    public String gerar(int tamanho) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        return GerarSenha.gerarSenha(chars, tamanho);
    }
}
