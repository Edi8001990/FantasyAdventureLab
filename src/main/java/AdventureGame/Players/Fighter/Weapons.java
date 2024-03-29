package AdventureGame.Players.Fighter;

public enum Weapons {
    AXE(25),
    MACE(15),
    LONG_SWORD(20),
    CLUB(40),
    DAGGER(10);

    private final int damage;

    Weapons(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }
}
