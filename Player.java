package Tokio.Game.domain;

import static util.Constants.INITIAL_SIZE;

public class Player extends Character {


    private Item[] items;
    private int score;

    public Player(String name, int lives, Level currentLevel, int score) {
        super(name, lives, null);
        this.score = score;
        items = new Item[INITIAL_SIZE];

    }

    public Player(String name, int lives, int score) {
        super(name, lives);


    }

    public Item[] getItems() {
        return items;
    }

    public void takeItem(Item item){

    }

    public int getScore() {
        return score;
    }

    public void addScore(int quantity) {
        score += quantity;
    }


    @Override
    public void move(int x, int y){
        // leo del teclado lo que ha pulsado el jugador
        super.move(x,y);

    }
}



