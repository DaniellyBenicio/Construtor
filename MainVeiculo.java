public class MainVeiculo {
        public static void main(String[] args) {
            Veiculo v1 = new Veiculo("Fiat", "Uno", 2023);
            Veiculo v2 = new Veiculo("Honda", "Civic", 2022, 300);
            
            v1.imprimirVeiculo();
            v2.imprimirVeiculo();
        }  
        
}
