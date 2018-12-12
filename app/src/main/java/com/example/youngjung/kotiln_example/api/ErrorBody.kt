package com.example.youngjung.kotiln_example.api


import com.example.youngjung.kotiln_example.fromJson
import com.squareup.moshi.Json
import com.squareup.moshi.Moshi
import retrofit2.Response
import java.io.IOException


data class ErrorBody(val code : Int, @Json(name = "error") private val message : String) {

    override fun toString(): String = "{code:$code, message:\"$message\"}"

    companion object {

        val UNKNOWN_ERROR = 0

        private val moshi = Moshi.Builder().build()

        fun parseError(response: Response<*>?): ErrorBody?{
            return ( response?.errorBody())?.let {
                try{
                    moshi.fromJson(it.string())
                }catch (ignored : IOException) {
                    null
                }
            }
        }
    }
}