package com.example.macintoshhd.chartmapseats;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by macintoshhd on 19/12/17.
 */

public class SeatModelMapper {


    private static String ID = "id";
    private static String STATE = "state";
    private static String TYPE ="type";
    private static String POSITION = "position";

    public SeatModelMapper(){

    }

    public static SeatModel converterToSeatModel(String seatModel) throws JSONException {

        JSONObject mSeatJson = new JSONObject(seatModel);
        SeatModel mSeatModel = new SeatModel(mSeatJson.getString(ID),mSeatJson.getInt(STATE),
                                             mSeatJson.getString(TYPE),mSeatJson.getString(POSITION));
        return mSeatModel;
    }
}
