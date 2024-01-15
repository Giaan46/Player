package Tokio.Game.domain;

public abstract class Character {
    private String name;
    private int lives;
    private Level currentLevel;
    private int positionX;
    private int positionY;

     Character(String name, int lives,Level currentLevel){
        this.name = name;
        this.lives = lives;
        this.currentLevel = currentLevel;
        positionX = 0;
        positionY = 0;


    }

     Character(String name, int lives){
        this.name = name;
        this.lives = lives;
        currentLevel = null;
        positionX = 0;
        positionY = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public Level getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(Level currentLevel) {
        this.currentLevel = currentLevel;
    }
    public void jump(int height){
         positionY += height;

    }
    public void move(int x, int y){
         positionX += x;
         positionY +=y;
    }


}


