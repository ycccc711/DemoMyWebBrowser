package sg.edu.rp.c346.demomywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    WebView wvMyPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvMyPage = findViewById(R.id.webViewMyPage);
        btnLoadURL = findViewById(R.id.buttonLoad);

        wvMyPage.setWebViewClient(new WebViewClient());



        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com/";
                wvMyPage.loadUrl(url);
                wvMyPage.getSettings().setAllowFileAccess(false);
                wvMyPage.getSettings().setJavaScriptEnabled(true);
                wvMyPage.getSettings().setBuiltInZoomControls(true);


            }
        });
    }
}
