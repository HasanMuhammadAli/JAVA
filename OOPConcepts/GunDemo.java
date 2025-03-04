package OOPConcepts;

abstract class Gun {
    public int magzine_capacity;
    public int ammo;
    abstract void shoot();
}

abstract class Pistol extends Gun{
    public boolean silencer;
    abstract void shoot();
}

class USP extends Pistol{
    String speed = "300 m/s";
    int damage = 30;
    USP(){
        magzine_capacity = 10;
        ammo = magzine_capacity;
        silencer = false;
    }
    void shoot(){
        ammo--;
        System.out.println("Damaged caused: "+damage);
        System.out.println("Current Ammo: "+ammo);
        if(ammo<=0){
            System.out.println("Please reload");
        }
    }
    void reload(){
        ammo=magzine_capacity;
    }
}

class G18 extends Pistol{
    String speed;
    int damage = 50;
    G18(){
        magzine_capacity = 12;
        speed = "400 m/s";
        ammo = magzine_capacity;
    }
    void shoot(){
        ammo--;
        System.out.println("Damaged caused: "+damage);
        System.out.println("Current Ammo: "+ammo);
        if(ammo<=0){
            System.out.println("Please reload");
        }
        
    }
    void reload(){
        ammo=magzine_capacity;
    }
}

class GunDemo{
    public static void main(String[] args) {
        USP obj1 = new USP();
        obj1.shoot();
    }
}