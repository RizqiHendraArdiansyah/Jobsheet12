package Tugas;

public class Barrier implements Destroyable{
    public int strength;

    public Barrier(int strength){
        this.strength = strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public int getStrength(){
        return getStrength();
    }

    @Override
    public void destroyed() {
        strength -= 9;
        
    }
    public String getBarrierInfo(){
        String info = "Barrier Strength = " + this.strength;
        return info;
    }
    
}
