package percobaantiga;

class Komponen {
    String namaKomponen;
    
    public KomponenMobil(String namaKomponen){
        this.namaKomponen = namaKomponen;
    }
    public void tampilkanInfo(){
        System.out.println("komponen: " + namaKomponen);
    }
}
