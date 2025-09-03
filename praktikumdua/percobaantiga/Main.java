pakage percobaantiga;

public class Main {
    public static void main(String[]args){
        Mesin mesin = new Mesin("Mesin v8");
        Baterai baterai = new Baterai("Baterai Lithium-ion");
        
        Mobil mobil = new Mobil(mesin, baterai);
        
        mobil.mulaiJalan();
    }
}
