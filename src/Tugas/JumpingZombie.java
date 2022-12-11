package Tugas;

public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    public void heal(){
        switch(level){
            case 1: 
                this.health += 30;
                break;
            case 2: 
                this.health += 40;
                break;
            case 3:
                this.health += 50;
                break;
        }
    }
    @Override
    public void destroyed() {
       health -= 1;
    }
    public String getZombieInfo(){
        String info = " \nJumping Zombie Data = " + super.getZombieInfo();
        return info;
    }
}
