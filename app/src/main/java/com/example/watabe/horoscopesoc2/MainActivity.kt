package com.example.watabe.horoscopesoc2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    //占いの結果
    val mapHoro = mapOf(
            "おひつじ座" to "今週で２１３日連続で星座占い１２位。",
            "おうし座" to "食パンを一斤食べれば運気は上昇！",
            "ふたご座" to "朝からダル重、アリナミンＡを飲んで「よっしゃー」と叫ぼう。",
            "かに座" to "行きたくない同窓会に誘われたら「今シンガポールにいます」といって断ろう！",
            "しし座" to "オープンキャンパスに行こう！素敵な出会いが待っているかも♪",
            "おとめ座" to "スマフォをiPhoneからAndroidに機種変すれば吉",
            "てんびん座" to "３７歳でイニシャルがＴＷの人には要注意！",
            "さそり座" to "今日は最高の１日！何をしても怒られない日なので普段できないことにチャレンジしよう。",
            "いて座" to "天気が晴れなら凶、雨なら吉！好きな人と相合傘できるかも(*ﾉωﾉ)",
            "やぎ座" to "sijgliarlifdsapirodiasocadasf",
            "みずがめ座" to "家を買うなら今日がベスト！これ以上の日は今後来ない。",
            "うお座" to "サングラスが最も似合う日！"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //スピナー
        val spnHoro = findViewById(R.id.spnHoro) as Spinner
        val horoList = listOf("おひつじ座","おうし座","ふたご座","かに座",
                "しし座","おとめ座","てんびん座","さそり座",
                "いて座","やぎ座", "みずがめ座","うお座")
        spnHoro.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, horoList)

        //ボタンをクリックするとタイトルが「星占いのアプリだよ！」に書き変わる
        val btnRes = findViewById(R.id.btnRes) as Button
        btnRes.setOnClickListener{

            val imgHoro = findViewById(R.id.imgHoro) as ImageView
            val txtCont = findViewById<TextView>(R.id.txtCont)
            val item = spnHoro.selectedItem as String

            //占いの結果を表示する
            txtCont.text = mapHoro[item]
            //画像を表示する
            when( item ){
                "おひつじ座" -> imgHoro.setImageResource(R.drawable.aries)
                "おうし座" -> imgHoro.setImageResource(R.drawable.taurus)
                "ふたご座" -> imgHoro.setImageResource(R.drawable.gemini)
                "かに座" -> imgHoro.setImageResource(R.drawable.cancer)
                "しし座" -> imgHoro.setImageResource(R.drawable.leo)
                "おとめ座" -> imgHoro.setImageResource(R.drawable.virgo)
                "てんびん座" -> imgHoro.setImageResource(R.drawable.libra)
                "さそり座" -> imgHoro.setImageResource(R.drawable.scorpio)
                "いて座" -> imgHoro.setImageResource(R.drawable.sagittarius)
                "やぎ座" -> imgHoro.setImageResource(R.drawable.capricorn)
                "みずがめ座" -> imgHoro.setImageResource(R.drawable.aquarius)
                "うお座" -> imgHoro.setImageResource(R.drawable.pisces)
            }
        }
    }
}
