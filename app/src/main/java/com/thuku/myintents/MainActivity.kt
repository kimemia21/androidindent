package com.thuku.myintents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn1: Button = findViewById(R.id.btn1)
        var btn2:Button =findViewById(R.id.btn2)
        var btn3: Button =findViewById(R.id.btn3)
        var btn4: Button =findViewById(R.id.btn4)

        btn1.setOnClickListener({
            Toast.makeText( this,"button one was click",Toast.LENGTH_SHORT).show()
            val myintent= Intent(this,MainActivity2::class.java)
            startActivity(myintent)

        })

        btn2.setOnClickListener({Toast.makeText(this,"button two was clicked",Toast.LENGTH_SHORT).show()
            val myintent= Intent(this,MainActivity3::class.java)
            startActivity(myintent)

        })
        btn3.setOnClickListener({Toast.makeText(this,"button three was clicked",Toast.LENGTH_SHORT).show()
            val myintent= Intent(this,MainActivity4::class.java)
            startActivity(myintent)

        })
        btn4.setOnClickListener({
            val myintent=Intent(Intent.ACTION_VIEW)
            myintent.setData(Uri.parse("https://modcom.co.ke"))
            startActivity(myintent)
        })
    }
}