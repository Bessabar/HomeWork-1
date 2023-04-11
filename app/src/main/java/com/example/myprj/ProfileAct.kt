package com.example.myprj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ProfileAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val buy_button = findViewById<Button>(R.id.buy_button);

        buy_button.setOnClickListener {

            Toast.makeText(this, "Coming soon...", Toast.LENGTH_SHORT).show()
        }


        val change_pic = findViewById<Button>(R.id.change_pic);

        change_pic.setOnClickListener {

            Toast.makeText(this, "Coming soon...", Toast.LENGTH_SHORT).show()
        }

        val butt_1 = findViewById<Button>(R.id.butt_1);
        butt_1.setOnClickListener {
            Toast.makeText(this, "Coming soon...", Toast.LENGTH_SHORT).show()
        }

        val butt_2 = findViewById<Button>(R.id.butt_2);
        butt_2.setOnClickListener {
            Toast.makeText(this, "Coming soon...", Toast.LENGTH_SHORT).show()
        }

    }
}