package com.example.admin.study.Tutorials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.admin.study.R;

public class Dot_net extends AppCompatActivity {

    WebView mwebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dot_net);

        mwebView= (WebView)findViewById(R.id.web_dot_net);
        mwebView.setWebViewClient(new WebViewClient());
        mwebView.loadUrl("https://www.tutorialspoint.com//asp.net/index.htm");
    }
}