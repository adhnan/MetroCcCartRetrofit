
package com.example.metrocccart.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CartDetails {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("entries")
    @Expose
    private List<Entry> entries = null;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("subTotal")
    @Expose
    private SubTotal subTotal;
    @SerializedName("totalDiscounts")
    @Expose
    private TotalDiscounts totalDiscounts;
    @SerializedName("totalItems")
    @Expose
    private int totalItems;
    @SerializedName("totalPrice")
    @Expose
    private TotalPrice_ totalPrice;
    @SerializedName("totalPriceWithTax")
    @Expose
    private TotalPriceWithTax totalPriceWithTax;
    @SerializedName("totalTax")
    @Expose
    private TotalTax totalTax;
    @SerializedName("totalUnitCount")
    @Expose
    private int totalUnitCount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public SubTotal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(SubTotal subTotal) {
        this.subTotal = subTotal;
    }

    public TotalDiscounts getTotalDiscounts() {
        return totalDiscounts;
    }

    public void setTotalDiscounts(TotalDiscounts totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public TotalPrice_ getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(TotalPrice_ totalPrice) {
        this.totalPrice = totalPrice;
    }

    public TotalPriceWithTax getTotalPriceWithTax() {
        return totalPriceWithTax;
    }

    public void setTotalPriceWithTax(TotalPriceWithTax totalPriceWithTax) {
        this.totalPriceWithTax = totalPriceWithTax;
    }

    public TotalTax getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(TotalTax totalTax) {
        this.totalTax = totalTax;
    }

    public int getTotalUnitCount() {
        return totalUnitCount;
    }

    public void setTotalUnitCount(int totalUnitCount) {
        this.totalUnitCount = totalUnitCount;
    }

}
