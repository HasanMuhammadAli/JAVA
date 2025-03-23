package NormalProg;
import java.util.Scanner;;
public class Gun {
    int bullets;
    String name;
    //extra features for later use
    int damage;
    int rate_of_fire;
    int range;

    //for bullets member
    //to set bullets
    public void setBullet(int bullets){
        this.bullets = bullets;
    }
    //to get bullets
    public int getBullet(){
        return this.bullets;
    }
    
    //for name member
    //to set name
    public void setName(String name){
        this.name = name;
    }
    //to get name
    public String getName(){
        return this.name;
    }

    

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //creating onstance/object of a class
        Gun MP40 = new Gun();

        //set 

        // to set name for MP40 object
        System.out.println("Enter name for the gun:");
        String ip_name = scn.nextLine();
        MP40.setName(ip_name);
        // to set bullets for MP40 object
        System.out.println("Enter number of bullets for the gun:");
        int ip_bullet = scn.nextInt();
        MP40.setBullet(ip_bullet);

        //get
        
        //to get name for MP40 object
        String mp_name = MP40.getName();
        //to get bullets for MP40 object
        int mp_bullets = MP40.getBullet();


        //printing
        System.out.println("Name of gun : "+mp_name);
        System.out.println("Bullets in "+ mp_name +" = "+mp_bullets);

        scn.close();
    }
    
}