package com.example.myapplication

import io.reactivex.Observable
import retrofit2.http.*
import java.util.*
import kotlin.collections.HashMap

interface ApiHttp {

    @POST("techApi/user/v1/login")
    fun loginbean(@QueryMap map: HashMap<String,String>):Observable<LoginBean>
   @POST("techApi/user/v1/register")
   fun reginBean(@QueryMap map: HashMap<String,String>):Observable<ReginBean>

}