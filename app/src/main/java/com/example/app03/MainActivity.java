package com.example.app03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {   // 画面用のクラスを継承

        private EditText num1Edit;      // 文字入力用のView変数
        private EditText num2Edit;      // 文字入力用のView変数
        private Button eqBtn;           // ボタンViewの変数を用意
        private TextView resultText;    // テキストViewの変数を用意

        @Override   //オーバーライドしている事を明示
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);             // AppCompatActivityのonCreate()を実行
                setContentView(R.layout.activity_main);         // 画面にactivity_mainを設定
                num1Edit = findViewById(R.id.num1_edit);        // num1_editというIDのViewを取得
                num2Edit = findViewById(R.id.num2_edit);        // num2_editというIDのViewを取得
                eqBtn = findViewById(R.id.eq_btn);              // eq_btnというIDのViewを取得
                resultText = findViewById(R.id.result_text);    // result_textというIDのViewを取得

                eqBtn.setOnClickListener(new View.OnClickListener() {   // eqBtnのクリック処理を定義
                        @Override
                        public void onClick(View view) {
                                int num1 = Integer.parseInt(num1Edit.getText().toString());     //num1Editの文字を取得、Stringに変換したのち、さらにintに変換して代入
                                int num2 = Integer.parseInt(num2Edit.getText().toString());     //num2Editの文字を取得、Stringに変換したのち、さらにintに変換して代入
                                resultText.setText(String.valueOf(num1+num2));  //num1とnum2の値を足し残した結果をStringに変換しresultTextに設定
                        }
                });

        }
}