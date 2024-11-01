package estrategias;

public class SomenteNumeros implements EstrategiaSenha {
    @Override
    public String gerar(int tamanho) {
        String chars = "0123456789";
        return GerarSenha.gerarSenha(chars, tamanho);
    }
}
