package org.nriteshranjan;

public class Player {
    private final String name;
    private int position;

    public Player(String name, int position) {
        this.name = name;
        this.position = 0;
    }

    public Player(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }
}
