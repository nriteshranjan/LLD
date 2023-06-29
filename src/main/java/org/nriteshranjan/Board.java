package org.nriteshranjan;

import java.util.HashMap;

public class Board {
    private final int dimension;
    HashMap<Integer, SpecialEntity> specialEntities = new HashMap<>();

    public int getDimension() {
        return dimension;
    }

    public Board(int dimension) {
        this.dimension = dimension;
    }

    public void printBoard() {
        int totalCells = dimension * dimension;
        for (int i = totalCells; i > 0; --i) {
            System.out.print(" | " + i + " ");
            if (hasSpecialEntity(i)) System.out.print(specialEntities.get(i).getId());
            System.out.print(" |");
            if (i % 10 == 1) System.out.println();
        }

    }

    public void addSpecialEntity(SpecialEntity entity) {
        int startPosition = entity.getStart();
        specialEntities.put(startPosition, entity);
    }

    public boolean hasSpecialEntity(int position) {
        return specialEntities.containsKey(position);
    }

    public SpecialEntity getSpecialEntity(int position) {
        return (hasSpecialEntity(position) ? specialEntities.get(position) : null);
    }

    public int getTotalCells() {
        return dimension * dimension;
    }
}
