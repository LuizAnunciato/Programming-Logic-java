//Criando a classe Carro;
public class Carro {
    private String modelo;
    private String marca;
    private String velocidadeMaxima;
    private String tetoSolar;
    private String cor;
    private String chassi;
    private String velocidadeAtual;
    private String numeroMarchas;
    private String ano;
    private Proprietario proprietario;
    private String numeroPortas;
    private String cambioAutomatico;

    // Construtor
    public Carro(String modelo, String marca, String velocidadeMaxima, String tetoSolar,
                 String cor, String chassi, String velocidadeAtual, String numeroMarchas,
                 String ano, Proprietario proprietario, String numeroPortas, String cambioAutomatico) {

        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
        this.tetoSolar = tetoSolar;
        this.cor = cor;
        this.chassi = chassi;
        this.velocidadeAtual = velocidadeAtual;
        this.numeroMarchas = numeroMarchas;
        this.ano = ano;
        this.proprietario = proprietario;
        this.numeroPortas = numeroPortas;
        this.cambioAutomatico = cambioAutomatico;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(String velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(String tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(String velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(String numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(String numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(String cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    // Métodos abaixo:

    // Método acelerar
    public void acelerar() {
        System.out.println("Acelerando o carro " + modelo + 
                           " da marca " + marca); // Exibindo mensagem de acelerar
    }

    // Método frear
    public void frear() {
        this.velocidadeAtual = "0km/h"; // Reduzindo a velocidade do carro para 0km
        System.out.println("Freando o carro " + modelo + 
                           " da marca " + marca); // Exibindo mensagem de freio
    }

    // Método trocarMarcha
    public void trocarMarcha(String marcha) {
        // Verifica se a marcha é a ré e se a velocidade do carro é maior que 0
        if (marcha.equalsIgnoreCase("ré") && !velocidadeAtual.equals("0km/h")) {
            System.out.println("Não é possível engatar a marcha ré com o carro em movimento.");
        } else {
            System.out.println("Marcha trocada para " + marcha); // Exibindo a mensagem troca de marcha
        }
    }

    // Método reduzirMarcha
    public void reduzirMarcha() {
        System.out.println("Reduzindo marcha do carro " + 
                           modelo + " " + marca); // Exibindo mensagem de marcha reduzida
    }
}
