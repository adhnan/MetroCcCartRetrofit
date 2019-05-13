
package com.example.metrocccart.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stock {

    @SerializedName("stockLevel")
    @Expose
    private int stockLevel;

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

}
