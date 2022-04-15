package jp.techacademy.toduka.atsushi.kadai3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    Human()
    }


}
 class Human : MainActivity(var hobby:String,var age:Int){
   // const //val Str1 = "hobby"
  int age = (Human.say)
    this.name = name//コンストラクタ
    this.age = age
    val name = (Human.think)
    Log.d("私は" + hobby +,"について考える。")

    Log.d("私の名前は"+ name + , "です")
    Log.d("年は" + age + "です")
    constructor(name:String):this(age) {

    }
