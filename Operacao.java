public class Operacao {
  private String tipo;
  private int num1;
  private int num2;

  public Operacao(String tipo, int num1, int num2) {
    this.tipo = tipo;
    this.num1 = num1;
    this.num2 = num2;
  }

  public int soma() {
    return this.num1 + this.num2;
  }

  public int subtracao() {
    return this.num1 - this.num2;
  }

  public int multiplicacao() {
    return this.num1 * this.num2;
  }

  public int divisao() {
    if (this.num2 != 0) {
        return this.num1 / this.num2;
    } else {
        throw new IllegalArgumentException("Divisão por zero não é permitida");
    }
  }

  public String getTipo() {
    return tipo;
  }
}