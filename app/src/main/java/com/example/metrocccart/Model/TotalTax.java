
package com.example.metrocccart.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TotalTax {

    @SerializedName("currencyIso")
    @Expose
    private String currencyIso;
    @SerializedName("formattedValue")
    @Expose
    private String formattedValue;
    @SerializedName("priceType")
    @Expose
    private String priceType;
    @SerializedName("value")
    @Expose
    private double value;

    public String getCurrencyIso() {
        return currencyIso;
    }

    public void setCurrencyIso(String currencyIso) {
        this.currencyIso = currencyIso;
    }

    public String getFormattedValue() {
        return formattedValue;
    }

    public void setFormattedValue(String formattedValue) {
        this.formattedValue = formattedValue;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
