/**
 * @author MauricioCampos
 */

public class MotorDePoupa {

    // Propriedades do motor
    private String modelo;
    private String cor;
    private int anoFabricacao;

    // Construtor para inicializar as propriedades do MotorDePoupa
    public MotorDePoupa(String modelo, String cor, int anoFabricacao) {
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }

    // Método para obter o modelo do MotorDePoupa
    public String getModelo() {
        return modelo;
    }

    // Método para definir o modelo do MotorDePoupa
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método para obter a cor do MotorDePoupa
    public String getCor() {
        return cor;
    }

    // Método para definir a cor do MotorDePoupa
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método para obter o ano de fabricação do MotorDePoupa
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    // Método para definir o ano de fabricação do MotorDePoupa
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    // Método para exibir informações sobre o MotorDePoupa
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
    }

    // Método para ligar o MotorDePoupa
    public void ligar() {
        System.out.println("O MotorDePoupa está ligado.");
    }

    // Método para desligar o MotorDePoupa
    public void desligar() {
        System.out.println("O MotorDePoupa está desligado.");
    }

    // Método principal para testar a classe MotorDePoupa
    public static void main(String[] args) {
        // Criando um objeto MotorDePoupa
        MotorDePoupa motorDePoupa = new MotorDePoupa("Yamaha", "preto", 1985);

        // Exibindo informações do MotorDePoupa
        motorDePoupa.exibirInformacoes();

        // Ligando o MotorDePoupa
        motorDePoupa.ligar();

        // Desligando o MotorDePoupa
        motorDePoupa.desligar();
    }
}





