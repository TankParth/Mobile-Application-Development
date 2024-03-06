package com.appstone.news21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    String url = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        url = getIntent().getStringExtra("url");

      WebView mWebViewer = findViewById(R.id.web_view);
      mWebViewer.getSettings().setJavaScriptEnabled(true);
      mWebViewer.setWebViewClient(new WebViewClient());
      mWebViewer.loadUrl(url);
    }
}