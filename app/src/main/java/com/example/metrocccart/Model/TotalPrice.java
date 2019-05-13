
package com.example.metrocccart.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TotalPrice {

    @SerializedName("currencyIso")
    @Expose
    private String currencyIso;
    @SerializedName("value")
    @Expose
    private int value;

    public String getCurrencyIso() {
        return currencyIso;
    }

    public void setCurrencyIso(String currencyIso) {
        this.currencyIso = currencyIso;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
