package com.example.gson_tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jsonString = "{'name': 'sonata', 'price':30000}"
        //JSON -> JavaObject
        val newCar = Gson().fromJson(jsonString, Car::class.java)
        Log.d("information", newCar.getInfo())
        //JavaObject -> JSON
        val newJsonData = Gson().toJson(newCar)
        Log.d("toJSON", "newJsonData")
    }
}

/*GSON
Java Object를 JSON으로, JSON을 Java Object로 변환하는데 도움을 주는 라이브러리.
JSONObject나 JSONArray 같은 것들을 사용하지 않고 간단하게 변환할 수 있음.
implementation "com.google.code.gson:gson:$version"
 */