package com.afs.tdd;

public class MarsRover {

    private int locationX;
    private int locationY;
    private String direction;


    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public String getStatus() {
        return String.format("%s %s %s", this.locationX, this.locationY, this.direction);
    }

    public void executeCommon(String direction){
        if (direction == "M"){
            moveForward();
    }

}

    private void moveForward() {
        if (this.direction == "E")
            this.locationX++;
        else if (this.direction == "S")
            this.locationY--;
        else if (this.direction == "W")
            this.locationX--;
        else if (this.direction == "N")
            this.locationY++;
    }
    }
