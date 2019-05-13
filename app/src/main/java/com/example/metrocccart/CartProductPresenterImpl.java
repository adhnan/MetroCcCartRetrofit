package com.example.metrocccart;


import com.example.metrocccart.Model.CartDetails;

public class CartProductPresenterImpl implements CartPageContract.CartProductPresenter, CartPageContract.CartProductInteractor.OnFinishedListener {

    private CartPageContract.CartProductView cartView;
    private CartPageContract.CartProductInteractor cartInteractor;

    public CartProductPresenterImpl(CartPageContract.CartProductView cartView, CartPageContract.CartProductInteractor cartInteractor) {
        this.cartView = cartView;
        this.cartInteractor = cartInteractor;
    }

    @Override
    public void onDestroy() {

        cartView = null;

    }

    @Override
    public void onRefreshButtonClick() {
        cartInteractor.getProductList(this);

    }

    @Override
    public void requestDataFromServer() {
        cartInteractor.getProductList(this);
    }


    @Override
    public void onFinished(CartDetails cartDetails) {
        if(cartView!= null){
            cartView.setDataToRecyclerView(cartDetails);
        }
    }

    @Override
    public void onFailure(Throwable t) {
        if(cartView != null){
            cartView.onResponseFailure(t);
        }
    }
}
