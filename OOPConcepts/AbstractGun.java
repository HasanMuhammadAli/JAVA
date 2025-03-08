package OOPConcepts;

abstract class Gun {
    protected int magazineCapacity;
    protected int ammo;

    Gun(int magazineCapacity) {
        this.magazineCapacity = magazineCapacity;
        this.ammo = magazineCapacity;
    }

    abstract void shoot();

    public void reload() {
        ammo = magazineCapacity;
        System.out.println("Reloaded. Ammo: " + ammo);
    }
}

abstract class Pistol extends Gun {
    protected boolean silencer;

    Pistol(int magazineCapacity, boolean silencer) {
        super(magazineCapacity);
        this.silencer = silencer;
    }
}

class USP extends Pistol {
    private final String speed = "300 m/s";
    private final int damage = 30;

    USP() {
        super(10, false);
    }

    @Override
    void shoot() {
        if (ammo > 0) {
            ammo--;
            System.out.println("USP Fired. Damage caused: " + damage);
            System.out.println("Current Ammo: " + ammo);
        } else {
            System.out.println("Out of Ammo! Please reload.");
        }
    }
}

class G18 extends Pistol {
    private final String speed = "400 m/s";
    private final int damage = 50;

    G18() {
        super(12, false);
    }

    @Override
    void shoot() {
        if (ammo > 0) {
            ammo--;
            System.out.println("G18 Fired. Damage caused: " + damage);
            System.out.println("Current Ammo: " + ammo);
        } else {
            System.out.println("Out of Ammo! Please reload.");
        }
    }
}

class AbstractGun {
    public static void main(String[] args) {
        Gun usp = new USP();
        usp.shoot();
        usp.reload();
        usp.shoot();

        Gun g18 = new G18();
        g18.shoot();
        g18.reload();
        g18.shoot();
    }
}
