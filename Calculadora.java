
public class Calculadora {
  public int calcular(Operacao operacao) {
    int resultado = 0;

    if (operacao.getTipo().equals("soma")) {
      resultado = operacao.soma();
    } else if (operacao.getTipo().equals("subtracao")) {
      resultado = operacao.subtracao();
    } else if (operacao.getTipo().equals("multiplicacao")) {
      resultado = operacao.multiplicacao();
    } else if (operacao.getTipo().equals("divisao")) {
      resultado = operacao.divisao();
    } else {
      throw new IllegalArgumentException("Operação desconhecida: " + operacao.getTipo());
    }

    return resultado;
  }
}
