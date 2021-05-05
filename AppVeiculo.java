public class AppVeiculo {
    
    public static void main(String[] args) {

        Veiculo[] veiculo = new Veiculo[4];
        veiculo[0] = new Veiculo("Grand Cherokee", "Jeep", 2019, 280000, "ABC-1234", "flex");
        veiculo[1] = new Veiculo("Compass", "Jeep", 2020, 120000, "DEF-4321", "gasolina");
        veiculo[2] = new Veiculo("Fusca", "Volkswagem", 1971, 12000, "LOL-9941", "gasolina");
        veiculo[3] = new Veiculo("Uno", "Fiat", 1996, 8000, "JKL-0018", "gasolina");
        
        veiculo[0].imprimir();
        veiculo[1].imprimir();
        veiculo[2].imprimir();
        veiculo[3].imprimir();

 }
}
