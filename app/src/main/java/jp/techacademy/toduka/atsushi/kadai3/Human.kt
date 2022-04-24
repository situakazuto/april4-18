package jp.techacademy.toduka.atsushi.kadai3

import android.util.Log

//import jp.techacademy.toduka.atsushi.kadai3.Animal

class Human : Animal, Thinkable {
   private lateinit var hobby : String

    constructor( name: String,age: Int,hobby: String) : super(name, age) {
        this.hobby = hobby
    }


        // Humanクラスのメソッドをオーバーライド
     override fun say() {
            Log.d("kotlintest"","私の名前は ${name} です。年は ${age} 歳です。")
     }
    override fun think() {
        Log.d("kotlintest","私は${hobby}について考えています。")//値が動的に変わる
    }


}



