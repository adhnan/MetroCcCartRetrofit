
package com.example.metrocccart.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entry {

    @SerializedName("configurationInfos")
    @Expose
    private List<Object> configurationInfos = null;
    @SerializedName("entryNumber")
    @Expose
    private int entryNumber;
    @SerializedName("product")
    @Expose
    private Product product;
    @SerializedName("quantity")
    @Expose
    private int quantity;
    @SerializedName("totalPrice")
    @Expose
    private TotalPrice totalPrice;

    public List<Object> getConfigurationInfos() {
        return configurationInfos;
    }

    public void setConfigurationInfos(List<Object> configurationInfos) {
        this.configurationInfos = configurationInfos;
    }

    public int getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(int entryNumber) {
        this.entryNumber = entryNumber;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public TotalPrice getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(TotalPrice totalPrice) {
        this.totalPrice = totalPrice;
    }

}
