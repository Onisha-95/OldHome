package com.onisha.oldhome;

import retrofit2.http.GET;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;


public interface OldHomeService {

    @GET("oldHomes")
    Call <OldHome> getOldhome();




}
