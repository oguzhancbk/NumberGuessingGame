package com.oguzh.sayi_tahmin_oyunu

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.oguzh.number_guessing_game.R

class SonucActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonuc)


        var textViewSonuc = findViewById<TextView>(R.id.textViewSonuc)
        var imageview = findViewById<ImageView>(R.id.imageViewSonuc)
        val sonuc = intent.getBooleanExtra("sonuc",true)
        if(sonuc) {
            textViewSonuc.text = "KAZANDINIZ"
            imageview.setImageResource(R.drawable.gulensurat)
        }else{
            textViewSonuc.text = "KAYBETTİNİZ"
            imageview.setImageResource(R.drawable.uzgunsurat)
        }

        var ButtonTekrar = findViewById<Button>(R.id.buttonTekrar)

        ButtonTekrar.setOnClickListener(){
            val intent = Intent(this@SonucActivity,TahminActivity::class.java)
            finish()
            startActivity(intent)
        }

        //Buton Çıkış noktası

        var ButtonCikis = findViewById<Button>(R.id.buttonCikis)
        ButtonCikis.setOnClickListener(){
            val builder = AlertDialog.Builder(this)
            builder.setMessage("Çıkmak istediğinize emin misiniz?")
            builder.setCancelable(true)
            builder.setNegativeButton("Hayır",DialogInterface.OnClickListener{dialogInterface, i ->

                dialogInterface.cancel()
            })
            builder.setPositiveButton("Evet",DialogInterface.OnClickListener{dialogInterface, i ->
                finish()
            })


            val alertDialog = builder.create()
            alertDialog.show()


        }


    }
}