package com.example.myapplicatio2.Service;

import java.net.URI;

public class RetrofitService<Retrofit> {
    private Retrofit retrofit;
    private URI GsonConverterFactory;

    public RetrofitService(){initializeRetrofit(); }

    private Retrofit initializeRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.43.249:8888/api/patient/")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();

        public Retrofit getRetrofit(){return retrofit;}

        }

    public java.lang.ref.Cleaner getRetrofit() {}

}



