package com.example.macintoshhd.chartmapseats;



/**
 * Created by macintoshhd on 19/12/17.
 */

public class SeatModel {



    int state;
    String id = "";
    String type ="";
    String position = "";


    public SeatModel(String id, int state, String type, String position) {
        this.id = id;
        this.state = state;
        this.type = type;
        this.position = position;
    }

    public SeatModel(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
