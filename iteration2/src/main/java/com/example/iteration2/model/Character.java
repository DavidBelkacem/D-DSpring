package com.example.iteration2.model;

public class Character {
    private int id;
    private String name;
    private String type;
    private int life;

    public Character() {
    }
    public Character(String name, String type, int life) {
        this.name = name;
        this.type = type;
        this.life = life;
    }
    public Character(int id, String name, String type, int life) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.life = life;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public String toString() {
        return this.name + " " + this.type + " " + this.life + " " + this.id;
    }
}
