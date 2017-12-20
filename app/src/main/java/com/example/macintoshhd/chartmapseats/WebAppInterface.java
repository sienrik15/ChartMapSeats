package com.example.macintoshhd.chartmapseats;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

import org.json.JSONException;
import java.util.HashMap;


/**
 * Created by macintoshhd on 19/12/17.
 */

public class WebAppInterface {

    //private ArrayList<SeatModel> lisSeat;
    private HashMap<String,SeatModel> lisSeat;
    private SeatModel mSeatModel1;

    private Context mContext;
    public WebAppInterface(Context context){
        mContext = context;
        lisSeat = new HashMap<String, SeatModel>();
    }

    @JavascriptInterface
    public void showToast(String massage){
        Toast.makeText(mContext,massage,Toast.LENGTH_SHORT).show();
    }

    @JavascriptInterface
    public void setCheckSeat(String seatModel){
        try {
            mSeatModel1 = new SeatModel();
            mSeatModel1 = SeatModelMapper.converterToSeatModel(seatModel);
            lisSeat.put(mSeatModel1.getId(),mSeatModel1);
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.getMessage();
        }
    }

    @JavascriptInterface
    public void setUnCheckSeat(String seatModel){
        try {
            lisSeat.remove(SeatModelMapper.converterToSeatModel(seatModel).getId());
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.getMessage();
        }

    }

    public void parcerToList(){
  /*      HashMap<String, HashMap> selects = new HashMap<String, HashMap>();

        for(Map.Entry<String, HashMap> entry : selects.entrySet()) {
            String key = entry.getKey();
            HashMap value = entry.getValue();

            // do what you have to do here
            // In your case, another loop.
        }*/
    }


}
