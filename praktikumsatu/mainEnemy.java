package praktikumsatu;

public class MainEnemy {
    public static void main(String[] args) {
        Zombie z = new Zombie();
        z.name = "Zombie 1";
        z.hp = 100;
        z.attackPoin = 10;
        z.attack();
        z.walk();

        Pocong p = new Pocong();
        p.name = "Pocong 1";
        p.hp = 80;
        p.attackPoin = 15;
        p.attack();
        p.jump();

        Burung b = new Burung();
        b.name = "Burung Hantu";
        b.hp = 50;
        b.attackPoin = 5;
        b.attack();
        b.walk();
        b.jump();
        b.fly();
    }
}
