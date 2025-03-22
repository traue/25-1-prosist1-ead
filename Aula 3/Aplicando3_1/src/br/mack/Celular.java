package br.mack;

public class Celular {

    // Atributos da classe
    String modelo;
    String marca;
    long imei;
    String numero;
    String cor;
    int anoFabricacao;

    // Método que verifica a garantir
    public String verificaGarantia() {
        int anoAtual = java.time.Year.now().getValue(); // retorna o ano anoAtual
        if (anoAtual - anoAtual <= 2) {
            return "Dentro da garantia";
        }
        return "Fora da garantia";
    }

    // Método que verifica o IMEI
    public boolean checaImei(long nro) {
        return this.imei == nro;
    }

    // Método que formata o número
    public String exibeNumeroFormatado() {
        if (numero.length() == 11) {
            return "(" + numero.substring(0, 2) + ") " + numero.substring(2, 7) + "-" + numero.substring(7);
        }
        return numero;
    }
}