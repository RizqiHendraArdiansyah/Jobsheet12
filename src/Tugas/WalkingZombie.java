package Tugas;

public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    public void heal(){
        switch(level){
            case 1: 
                this.health += 10;
                break;
            case 2: 
                this.health += 30;
                break;
            case 3:
                this.health += 40;
                break;
        }
    }

    @Override
    public void destroyed(){
        health -= 2;
    }
    public String getZombieInfo(){
        String info = " \nWalking Zombie Data = " + super.getZombieInfo();
        return info;
    }
}
