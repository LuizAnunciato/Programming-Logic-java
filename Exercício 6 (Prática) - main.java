public class Main {
    public static void main(String[] args) {

        // Criando endereço
        Endereco endereco = new Endereco(
            "Rua das Flores", 
            "Jardim Primavera", 
            "São Paulo", 
            "01234-567", 
            "SP"
        );

        // Criando proprietário
        Proprietario proprietario = new Proprietario(
            "João da Silva", 
            "123.456.789-00", 
            "(11) 91234-5678", 
            endereco
        );

        // Criando carro
        Carro carro = new Carro(
            "Civic", 
            "Honda", 
            "220km/h", 
            "Sim", 
            "Preto", 
            "9BWZZZ377VT004251", 
            "0km/h", 
            "6", 
            "2022", 
            proprietario, 
            "4", 
            "Sim"
        );

        // Exibindo informações e testando método
        System.out.println("Detalhes do Carro:");
        System.out.println("###  ###  ### ###  ###  ###  ###  ###  ###");
        System.out.println();
        System.out.println("#Modelo: " + carro.getModelo());
        System.out.println();
        System.out.println("#Marca: " + carro.getMarca());
        System.out.println();
        System.out.println("#Ano: " + carro.getAno());
        System.out.println();
        System.out.println("#Proprietário: " + carro.getProprietario().getNome());
        System.out.println();
        System.out.println("#Cidade do Proprietário: " + carro.getProprietario().getEndereco().getCidade());
        System.out.println();
        
        //Métodos
        System.out.println("###  ###  ### ###  ###  ###  ###  ###  ###");
        System.out.println("Utilizando o carro:");
        System.out.println();
        carro.acelerar(); //acelerando o carro
        System.out.println();

        carro.frear(); //freando o carro
        System.out.println();

        carro.trocarMarcha("ré"); // tentando trocar para marcha ré com carro em movimento
        System.out.println();
        
        carro.frear(); //freando o carro
        System.out.println();

        carro.trocarMarcha("ré"); // trocando para marcha ré novamente
    }
}
