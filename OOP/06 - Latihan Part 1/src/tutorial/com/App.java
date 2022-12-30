package tutorial.com;

class Character {
    String name;
    int level;
    Pendant pendant;
    Gem gem;

    Character(String name) {
        this.name = name;
        this.level = 1;
    }

    void upLevel(int level) {
        this.level = level;
    }

    void equipPendant(Pendant pendant) {
        this.pendant = pendant;
    }

    void equipGem(Gem gem) {
        this.gem = gem;
    }

    void info() {
        System.out.println("Name            : " + this.name);
        System.out.println("Level           : " + this.level);
        System.out.println("Pendant Equiped : " + this.pendant.name);
        System.out.println("Pendant Ability : " + this.pendant.ability);
        System.out.println("Gem Equiped     : " + this.gem.name);
        System.out.println("Dice Control    : " + this.gem.diceControl + "%");
    }
}

class Pendant {
    String name;
    String ability;

    Pendant(String name, String ability) {
        this.name = name;
        this.ability = ability;
    }

    void info() {
        System.out.println("Pendant Name    : " + this.name);
        System.out.println("Pendant Ability : " + this.ability);
    }
}

class Gem {
    String name;
    double diceControl;

    Gem(String name, double diceControl) {
        this.name = name;
        this.diceControl = diceControl;
    }

    void info() {
        System.out.println("Gem Name         : " + this.name);
        System.out.println("Gem Dice Control : " + this.diceControl + "%");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Pendant Spaceship
        Pendant spaceship = new Pendant("Spaceship", "+80% Lompat Ditempat");
        Pendant thanos = new Pendant("Thanos", "+75% Blackhole dan Gelembung");

        // Gem Kotak Hijau
        Gem kotakHijau = new Gem("Kotak Hijau", 33.3);
        Gem segitigaHijau = new Gem("Segitiga Hijau", 40);

        // Bocil
        Character bocil = new Character("bocil");
        bocil.upLevel(30);
        bocil.equipPendant(spaceship);
        bocil.equipGem(kotakHijau);
        bocil.info();

        System.out.println("");
        // Mamok
        Character mamok = new Character("Mamok");
        mamok.upLevel(25);
        mamok.equipPendant(thanos);
        mamok.equipGem(segitigaHijau);
        mamok.info();
    }
}