package com.misewgapp.digital.mikecourts.controller;

import android.content.Context;
import android.widget.Toast;

import com.misewgapp.digital.mikecourts.dao.DaoInternetPaints;
import com.misewgapp.digital.mikecourts.model.Paints;
import com.misewgapp.digital.mikecourts.util.ResultListener;
import com.misewgapp.digital.mikecourts.util.Util;

import java.util.List;

public class ControllerPaints {

    public void bringPaints(Context context, final ResultListener<List<Paints>> listenerView){
        if (Util.isOnline(context)){
            DaoInternetPaints daoInternetPaints = new DaoInternetPaints();
            daoInternetPaints.bringPaints(new ResultListener<List<Paints>>() {
                @Override
                public void finish(List<Paints> result) {
                    listenerView.finish(result);
                }
            });
        } else {
            Toast.makeText(context, "NO HAY INTERNET", Toast.LENGTH_SHORT).show();
        }


    }


}
