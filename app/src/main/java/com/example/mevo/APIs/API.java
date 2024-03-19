package com.example.mevo.APIs;

import com.example.mevo.DataModels.PatientModel;
import com.example.mevo.DataModels.Room;
import com.example.mevo.DataModels.UserModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface API {
    @POST("signup")
    Call<UserModel> signUp(@Body UserModel model);
    @POST("signin")
    Call<UserModel> signIn(@Body UserModel model);
    @GET("GetRooms")
    Call <List<Room>> GetRooms();
    @POST("AddRoom")
    Call<Room> AddRoom(@Body Room model);
    @POST("EditRoom")
    Call<Room> EditRoom(@Body Room model);
    @POST("AddPatient")
    Call<PatientModel> AddPatient(@Body PatientModel model);
}
