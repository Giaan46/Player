package Tokio.Game.domain;

import javax.imageio.ImageIO;

import static util.Constants.INITIAL_SIZE;

public class Item {
    private String name;
    private ImageIO picture;
    private String effect;
    private Item[] combinations;

    public Item(String name, ImageIO picture, String effect) {
        this.name = name;
        this.picture = picture;
        this.effect = effect;
        combinations = new Item[INITIAL_SIZE];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageIO getPicture() {
        return picture;
    }

    public void setPicture(ImageIO picture) {
        this.picture = picture;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public Item[] getCombinations() {
        return combinations;
    }

    public void addItem( Item item){
    }
}
