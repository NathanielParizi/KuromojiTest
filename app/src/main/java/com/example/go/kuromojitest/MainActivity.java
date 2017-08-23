package com.example.go.kuromojitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.atilika.kuromoji.Token;
import org.atilika.kuromoji.Tokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tokenizer tokenizer = Tokenizer.builder().build();
        for (Token token : tokenizer.tokenize("お寿司を食べました")) {
            System.out.println(token.getReading());
        }

    }

}
