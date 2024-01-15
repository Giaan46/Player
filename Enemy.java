package Tokio.Game.domain;

public class Enemy extends Character {
    public String abbillity;
    public int position;


    public Enemy(String name, int lives, Level currentLevel, String abbillity) {
        super(name, lives, currentLevel);
        this.abbillity = abbillity;
        this.position = position;

    }

    public String getAbbillity() {
        return abbillity;
    }

    public void setAbbillity(String abbillity) {
        this.abbillity = abbillity;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    public void hit (){
        switch(abbillity){
            case "laser":
                break;
            case"bullet":
                break;
            case"fire":
                break;

        }
    }


    }

