interface Chances{
    final float spawnChance = 0; 
    final float deathChance = 0;
    final float reproduceChance = 0;
    boolean trySpawn();
    boolean tryDeath();
    boolean tryReproduce();

}

class Actions{
    private void createCreature(){

    }
}
class World extends Actions implements Chances{
    public void getGravity(){

    }
    float gravity;

    private void createCreature(){
        boolean t = trySpawn();

    }
    public boolean trySpawn(){
        return false;
    }
    public boolean tryDeath(){
        return false;
    }
    public boolean tryReproduce() {
        // TODO Auto-generated method stub
        return false;
    }
}
class Creature extends Actions implements Chances{
    public boolean trySpawn(){
        return false;
    }
    public boolean tryDeath(){
        return false;
    }
    private void createCreature(){
        boolean r = tryReproduce();
    }
    private void die(){

    }
    public boolean tryReproduce() {
        return false;
    }

}


public class Model {
    
}
