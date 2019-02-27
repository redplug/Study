package com.example.mykotlin;

public class FruitJava {
    String fruitName;

    String description;

    @Override
    public String toString() {
        return "FruitJava(" + fruitName + ", " + description + ")";
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof FruitJava) {
            FruitJava another = (FruitJava) obj;

            return fruitName.equals(another.fruitName) && description.equals(another.description);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (fruitName == null ? 0 : fruitName.hashCode());
        hash = 31 * hash + (description == null ? 0 : description.hashCode());
        return hash;
    }
}
