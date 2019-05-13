package com.example.metrocccart;


import android.util.Log;

import com.example.metrocccart.Model.CartDetails;
import com.example.metrocccart.Retrofit.GetCartDetailsDataService;
import com.example.metrocccart.Retrofit.RetrofitInstance;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class CartProductInteractorImpl implements CartPageContract.CartProductInteractor {

    public JSONObject customerRequestBodyJson;
    @Override
    public void getCartList(final OnFinishedListener onFinishedListener) {

//        UserPreferences mPreference = new UserPreferencesImpl();
//        String customerRequestBody=mPreference.getWsDto();
//        Map<String, Object> retMap = new Gson().fromJson(customerRequestBody, new TypeToken<HashMap<String, Object>>() {}.getType()
//        );
//        CustomerDataService service = RetrofitInstance.getRetrofitInstance().create(CustomerDataService.class);
//
//        Call<CustomerDetails> call = service.getCustomerData("application/json","Bearer "+mPreference.getAccessToken(),retMap);
//        //Call<CustomerDetails> call = service.getCustomerData(retMap);
//
//        Log.wtf("URL Called", call.request().url() + "");
//
//        call.enqueue(new Callback<CustomerDetails>() {
//            @Override
//            public void onResponse(Call<CustomerDetails> call, Response<CustomerDetails> response) {
//                if(response!=null && response.body()!=null && response.body().getB2bUnits()!=null) {
//                    onFinishedListener.onFinished((CustomerDetails) response.body());
//
//                }else {
//                    String err_message;
//                    err_message= (response!=null ? response.toString(): "Unknown network error"); //TOdo change unknown error
//                    onFinishedListener.onFailure(new Throwable(err_message));
//                }
//                Log.d("CustomerInteractorImp",response.toString());
//
//
//            }
//
//            @Override
//            public void onFailure(Call<CustomerDetails> call, Throwable t) {
//                onFinishedListener.onFailure(t);
//            }
//        });



        /** Create handle for the RetrofitInstance interface*/
        GetCartDetailsDataService service = RetrofitInstance.getRetrofitInstance().create(GetCartDetailsDataService.class);

        /** Call the method with parameter in the interface to get the notice data*/
        Call<CartDetails> call = service.getNoticeData();

        /**Log the URL called*/
        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<CartDetails>() {
            @Override
            public void onResponse(Call<CartDetails> call, Response<CartDetails> response) {
                onFinishedListener.onFinished(response.body().getNoticeArrayList());

            }

            @Override
            public void onFailure(Call<CartDetails> call, Throwable t) {
                onFinishedListener.onFailure(t);
            }
        });
    }

}
