package com.oguzh.sayi_tahmin_oyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.oguzh.number_guessing_game.R

class GirisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giris)

        var ButtonBasla = findViewById<Button>(R.id.buttonBasla)
        ButtonBasla.setOnClickListener() {
            val intent = Intent(this@GirisActivity, TahminActivity::class.java)

            finish()

            startActivity(intent)


        }
        var Buttonnasiloynanir = findViewById<Button>(R.id.buttonnasiloynanir)
        Buttonnasiloynanir.setOnClickListener(){
            Toast.makeText(applicationContext,"Oyun 0 ile 100 arasında rastgele bir sayı üretir ve siz o sayıyı bulmaya çalışırsınız.5 hakkınız bulunmaktadır.5 hakta bulursanız kazanırsınız.İyi Oyunlar.",Toast.LENGTH_LONG).show()


        }



    }



}