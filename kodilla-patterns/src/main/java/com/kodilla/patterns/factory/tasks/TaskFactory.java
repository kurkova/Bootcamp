package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass){
        switch(taskClass){
            case SHOPPING:
                return new ShoppingTask("Buy new clothes", "jumper", 1);
            case PAINTING:
                return new PaintingTask("Painting new house", "red", "kitchen");
            case DRIVING:
                return new DrivingTask("Travel to airport", "airport", "cab");
            default:
                return null;
        }
    }
}
