package com.learntodroid.androidlinecharttutorial;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface YahooFinanceAPI {
    @Headers({
            "x-rapidapi-host: apidojo-yahoo-finance-v1.p.rapidapi.com",
            "x-rapidapi-key: YOUR_API_KEY_HERE"
    })
    @GET("/stock/v2/get-historical-data")
    Call<HistoricalDataResponse> getHistoricalData(
            @Query("frequency") String frequency,
            @Query("filter") String filter,
            @Query("period1") String period1,
            @Query("period2") String period2,
            @Query("symbol") String symbol
    );
}
