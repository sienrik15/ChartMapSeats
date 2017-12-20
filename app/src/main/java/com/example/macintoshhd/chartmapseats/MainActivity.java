package com.example.macintoshhd.chartmapseats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebView = findViewById(R.id.mainBrowser);

        mWebView.getSettings().setJavaScriptEnabled(true); //activar js en el browser
        mWebView.getSettings().setLoadWithOverviewMode(true); //scala a la pantalla actual
        mWebView.getSettings().setUseWideViewPort(true); //aumenta en tamaño de Zoom siempre debe ir con setLoadWithOverviewMode
        mWebView.getSettings().setBuiltInZoomControls(true);
        mWebView.getSettings().setDisplayZoomControls(false);
        mWebView.setWebChromeClient(new WebChromeClient());
        //mWebView.setScrollbarFadingEnabled(true);
        // mWebView.setVerticalScrollBarEnabled(false);
        //mWebView.getSettings().setUseWideViewPort(true); //touch double Zoom

        mWebView.addJavascriptInterface(new WebAppInterface(this),"EventsMobile");
        //mWebView.loadUrl("https://www.w3schools.com/graphics/tryit.asp?filename=trysvg_myfirst");
        mWebView.loadUrl("file:///android_asset/www/index.html"); //file:///android_asset/www/index.html
    }
}
