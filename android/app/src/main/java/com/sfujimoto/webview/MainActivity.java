package com.sfujimoto.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView  myWebView = (WebView)findViewById(R.id.webView1);

        myWebView.setWebViewClient(new WebViewClient());
        myWebView.setWebChromeClient(new WebChromeClient());
        myWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);

        myWebView.loadUrl("URL");

        myWebView.getSettings().setJavaScriptEnabled(true);

    }
}
