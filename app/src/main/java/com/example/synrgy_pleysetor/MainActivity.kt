package com.example.synrgy_pleysetor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val educationListApp = arrayListOf(
            AppSetor("Udemy", 12,"Education",R.drawable.udemy),
            AppSetor("edX", 24,"Education",R.drawable.edx),
            AppSetor("dailyArt", 20,"Education",R.drawable.dailyart),
            AppSetor("Linked Learning", 30,"Education",R.drawable.linkedlearning),
            AppSetor ("Skill Academy", 25,"Education",R.drawable.skillacademy)
        )
        val booksNreferenceListApp = arrayListOf(
            AppSetor("iPusnas", 12,"Books",R.drawable.ipsunas),
            AppSetor("TOEFL Preparation", 24,"Books",R.drawable.toeflpreparation),
            AppSetor("Zoo for Zotero", 20,"Books",R.drawable.zoo),
            AppSetor("Wattpad", 30,"Books",R.drawable.wattpad),
            AppSetor ("Wikipedia", 25,"Books",R.drawable.wikped)
        )
        val artNdesignListApp = arrayListOf(
            AppSetor("Canva", 12,"Design",R.drawable.canvaicon),
            AppSetor("eSport Logo Maker", 24,"Design",R.drawable.esport),
            AppSetor("Logo Maker 2020", 20,"Design",R.drawable.logomaker),
            AppSetor("Adobe Illustrator Draw", 30,"Design",R.drawable.illustrator),
            AppSetor ("Pigments", 25,"Design",R.drawable.pigment)
        )
        val mediaFilmsListApp = arrayListOf(
            AppSetor ("Netflix", 200,"media",R.drawable.netflix),
            AppSetor("VLC", 25,"media",R.drawable.vlc),
            AppSetor("dailyArt", 20,"Education",R.drawable.dailyart),
            AppSetor("i Heart Radio", 50,"media",R.drawable.i_heart_radio)
        )
        val suggesteForYouListApp = arrayListOf(
            AppSetor("Jenius", 40,"Finance",R.drawable.jenius),
            AppSetor("Traveloka", 25,"Travel",R.drawable.taveloka),
            AppSetor("Whatsapp", 20,"Messages",R.drawable.whatsapp),
            AppSetor("Line", 30,"Messages",R.drawable.line),
            AppSetor ("Telegram", 20,"Messages",R.drawable.telegram)
        )

        eduRecView.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false)
        eduRecView.adapter = AdapterSetor(educationListApp)

        booksRecycleView.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false)
        booksRecycleView.adapter = AdapterSetor(booksNreferenceListApp)

        artRecView.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false)
        artRecView.adapter = AdapterSetor(artNdesignListApp)

        media1RecycleView.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false)
        media1RecycleView.adapter = AdapterSetor(mediaFilmsListApp)

        suggestForYou.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false)
        suggestForYou.adapter = AdapterSetor(suggesteForYouListApp)



    }
}