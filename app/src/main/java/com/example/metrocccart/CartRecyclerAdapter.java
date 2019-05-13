package com.example.metrocccart;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.metrocccart.Model.CartDetails;
import com.example.metrocccart.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class CartRecyclerAdapter extends RecyclerView.Adapter<CartRecyclerAdapter.CartProductViewHolder> {


    private Context context;                    //this context will use to inflate the layout
    private List<CartDetails> cartDetailsList;          // storing all the products in a list
    private RecyclerItemClickListener recyclerItemClickListener;

    CartRecyclerAdapter(Context context, List<CartDetails> cartDetailsList, RecyclerItemClickListener recyclerItemClickListener) {     //getting the context and product list with constructor
        this.context = context;
        this.cartDetailsList = cartDetailsList;
        this.recyclerItemClickListener = recyclerItemClickListener;
    }

    @NonNull
    @Override
    public CartProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(context);
        @SuppressLint("InflateParams") View view = inflater.inflate(R.layout.cart_recycler_card_layout, null);
        return new CartProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartProductViewHolder productViewHolder, @SuppressLint("RecyclerView") final int position) {
        //getting the product of the specified position

        CartDetails cartProduct = cartDetailsList.get(position);

        //binding the data with the viewHolder views
//        productViewHolder.cartProductImage.setImageDrawable(context.getResources().getDrawable(cartProduct.getCartProductImage(), null));
        productViewHolder.cartProductId.setText(cartProduct;
        productViewHolder.cartProductDesc.setText(cartProduct.get(position));
        productViewHolder.stockCount.setText(cartProduct.getStockCount());
        productViewHolder.Gst.setText(cartProduct.getGst());
        productViewHolder.price.setText("" + cartProduct.getPrice());
        productViewHolder.offAmount.setText(cartProduct.getOffAmount());


        if (cartProduct.getOfferValid()) {
            productViewHolder.offerImage.setTextColor(Color.GREEN);
            productViewHolder.view_margin.setVisibility(View.VISIBLE);

        } else {
            productViewHolder.offerImage.setVisibility(View.GONE);
            productViewHolder.view_margin.setVisibility(View.GONE);
        }

        //productViewHolder.productCount.setText(product.getP);

        productViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerItemClickListener.onItemClick(cartDetailsList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return cartDetailsList.size();
    }

    class CartProductViewHolder extends RecyclerView.ViewHolder {       // view holder class

        TextView cartProductId, cartProductDesc, stockCount, Gst, offAmount, price, offerImage;
        Button productCount;
        ImageView cartProductImage;
        View view_margin;

        CartProductViewHolder(View itemView) {
            super(itemView);

            offerImage = itemView.findViewById(R.id.tvOfferImage);
            cartProductImage = itemView.findViewById(R.id.ivProductImage);
            cartProductId = itemView.findViewById(R.id.tvCartProductId);
            cartProductDesc = itemView.findViewById(R.id.tvProductDesc);
            stockCount = itemView.findViewById(R.id.tvInStock);
            Gst = itemView.findViewById(R.id.tvAmountAndGst);
            price = itemView.findViewById(R.id.tvPrice);
            offAmount = itemView.findViewById(R.id.tvCartOffAmount);
            productCount = itemView.findViewById(R.id.btnProductCount);
            view_margin = itemView.findViewById(R.id.view_margin);

        }
    }
}