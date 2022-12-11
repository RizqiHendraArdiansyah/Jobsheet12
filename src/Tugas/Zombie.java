package Tugas;

public class Zombie implements Destroyable{
    public int health;
    public int level;

    public void heal(){

    }
    @Override
    public void destroyed(){

    }
    public String getZombieInfo(){
        String info = " \nHealth " + health + " \nLevel = " + level;
        return info;
    }
}