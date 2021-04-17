package com.example.ejercicio_2021_03_dam.api;

import com.example.ejercicio_2021_03_dam.entity.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceApi {

    //https://jsonplaceholder.typicode.com/posts

    @GET("posts")
    public abstract Call<List<User>> listaTitle();
}
