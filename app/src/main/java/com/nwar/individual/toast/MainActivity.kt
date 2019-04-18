package com.nwar.individual.toast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.Gravity
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val xOffset = findViewById<EditText>(R.id.xOffset)
        val yOffset = findViewById<EditText>(R.id.yOffset)
        button.setOnClickListener {
            val inflate = layoutInflater.inflate(R.layout.toast_layout,findViewById<LinearLayout>(R.id.container))
            Toast(this).apply {
                if(xOffset.text.toString()!=""&&yOffset.text.toString()!="") {
                    setGravity(Gravity.CENTER,xOffset.text.toString().toInt(),yOffset.text.toString().toInt())
                }
                inflate.findViewById<TextView>(R.id.textview).text = "토스트입니다아아아ㅏㅏ"
                duration = Toast.LENGTH_LONG
                view = inflate
                show()
            }
        }
    }
}