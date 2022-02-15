package com.oguzh.sayi_tahmin_oyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.oguzh.number_guessing_game.R
import kotlin.math.log
import kotlin.random.Random

class TahminActivity : AppCompatActivity() {
    private var rastgelesayi = 0
    private var sayac = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tahmin)

        rastgelesayi = Random.nextInt(101)
        Log.e("Rastgele Sayı",rastgelesayi.toString())


        var textViewKalanHak = findViewById<TextView>(R.id.textViewKalanHak)
        var textViewBilgi = findViewById<TextView>(R.id.textViewBilgi)
        var edittextgirdi = findViewById<EditText>(R.id.editTextTextGirdi)
        var ButtonTahmin = findViewById<Button>(R.id.buttonTahmin)


        ButtonTahmin.setOnClickListener(){
            sayac = sayac - 1
            val tahmin = edittextgirdi.text.toString().toInt()

            if (tahmin == rastgelesayi){
                var intent = Intent(this@TahminActivity,SonucActivity::class.java)
                intent.putExtra("Sonuc",true)
                finish()
                startActivity(intent)

                return@setOnClickListener

            }

            if (rastgelesayi < tahmin){
                textViewBilgi.text="AZALT"
                textViewKalanHak.text="Kalan Hak $sayac"
            }
            if (rastgelesayi > tahmin){
                textViewBilgi.text="ARTTIR"
                textViewKalanHak.text="Kalan Hak $sayac"
            }
            if (sayac == 0){
                intent = Intent(this@TahminActivity,SonucActivity::class.java)
                intent.putExtra("sonuc",false)
                finish()
                startActivity(intent)
            }
            edittextgirdi.setText("")


        }








    }
}