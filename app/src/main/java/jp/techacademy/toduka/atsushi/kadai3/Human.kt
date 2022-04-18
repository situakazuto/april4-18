package jp.techacademy.toduka.atsushi.kadai3

import android.util.Log
import jp.techacademy.atsushi.toduka.kadai3.Animal

open class Human : Animal() {
    constructor(name: String, age: Int) : super(name, age) {
    }

    // Humanクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("私の名前は", + this.name + "です。年は"
                (" + this.age + "歳です。”))
    }


}