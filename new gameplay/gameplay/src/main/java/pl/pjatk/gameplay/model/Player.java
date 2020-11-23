package pl.pjatk.gameplay.model;

public class Player {

    private int id;
    private String nickname;
    private int health;
    private int attack;
    private int mana;


    public Player(int id, String nickname, int health, int attack, int mana) {
        this.id = id;
        this.nickname = nickname;
        this.health = health;
        this.attack = attack;
        this.mana = mana;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override  //adnotacja  alt+ins toString() zazn wszystko adnotacja to nadpisanie kodu, zapomnij o poprzedniej metodzie, wykorzystaj te
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", mana=" + mana +
                '}';
    }
}
