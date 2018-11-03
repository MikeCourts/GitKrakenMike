package com.digitalhouse.retrofitbase.DAO.News2;

import com.digitalhouse.retrofitbase.Model.News2.ContainerNews2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ServiceNews2 {

  @GET("top-headlines")
  Call<ContainerNews2> getNewsFromApi(@Query("country") String country,
                                               @Query("category") String category,
                                               @Query("apiKey") String apiKey);

}
