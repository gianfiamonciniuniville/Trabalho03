package estrategias;

import java.util.Random;

public class GerarSenha {
    public static String gerarSenha(String chars, int tamanho) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            int index = random.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }
        return sb.toString();
    }
}
