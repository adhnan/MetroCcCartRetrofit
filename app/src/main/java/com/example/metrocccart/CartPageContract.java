package com.example.metrocccart;

import com.example.metrocccart.Model.CartDetails;

public interface CartPageContract {

    interface CartProductPresenter{

        void onDestroy();

        void onRefreshButtonClick();

        void requestDataFromServer();

    }

    interface CartProductView {


        void setDataToRecyclerView(CartDetails cartDetails);

        void onResponseFailure(Throwable throwable);

    }

    interface CartProductInteractor {

        interface OnFinishedListener {
            void onFinished(CartDetails cartDetails);
            void onFailure(Throwable t);
        }

        void getCartList(OnFinishedListener onFinishedListener);
    }
}
