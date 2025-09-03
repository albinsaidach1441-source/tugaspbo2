package percobaantiga

class Mesin extends KomponenMobil {
    public Mesin(String namaMesin){
        super(namaMesin);
    }
    public void nyalakanMesin(){
        System.out.println(namaKomponen + " dinyalakan. ");
    }
}
