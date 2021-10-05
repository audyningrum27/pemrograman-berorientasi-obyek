package audy.bagian2;

public class GameCharacter {
    private String name;
    private int lifePoint;
    private int attackHitPoint;
    private int attackKickPoint;

    /*
    public hit(GameCharacter karB) {
        this.karB = karB;
    }

    public kick(GameCharacter karB) {
        this.karB = karB;
    }
    */

    public GameCharacter(String name, int attackHitPoint, int attackKickPoint) {
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public String getName() {
        return name;
    }
}
