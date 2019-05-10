package com.example.watabe.horoscopesoc2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    val mapHoro = mapOf(
            "おひつじ座" to "今週で２１３日連続で星座占い１２位。名前に「哉」がつく人物に要注意！木村拓哉、谷間郁哉など",
            "おうし座" to "朝から食パンを一斤食べれば運気は上昇！",
            "ふたご座" to "朝からダル重、アリナミンＡを飲んで「よっしゃー」と叫ぼう。",
            "かに座" to "行きたくない同窓会に誘われたら「今シンガポールにいます。この国の南北に縦断する地下鉄を作っています。本当はあのころが恋しいけど。」といって断りましょう",
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
        
        //星座を選択できるスピナー
        val spnHoro = findViewById(R.id.spnHoro) as Spinner

        //スピナーに表示するリストの作成
        val horoList = listOf("おひつじ座","おうし座","ふたご座","かに座","しし座","おとめ座","てんびん座","さそり座","いて座","やぎ座","みずがめ座","うお座")
        //スピナーに星座を設定する。
        spnHoro.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, horoList)

        //スピナーにイベントを登録する
        spnHoro.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            //スピナーで選択したアイテムを使う
            override fun onItemSelected(parent:AdapterView<*>?, view: View?, position:Int, id:Long){
                if( parent != null ) {
                    val item = parent.selectedItem as String

                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }
    }
}
