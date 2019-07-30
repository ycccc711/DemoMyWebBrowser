package sg.edu.rp.c346.demomywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    WebView wvMyPage;
    EditText etURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvMyPage = findViewById(R.id.webViewMyPage);
        btnLoadURL = findViewById(R.id.buttonLoad);
        etURL = findViewById(R.id.etURL);

        wvMyPage.setWebViewClient(new WebViewClient());

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String url = "https://www.facebook.com/";
                String url = etURL.getText().toString();
                wvMyPage.loadUrl(url);

                //Disable file access within WebView
                wvMyPage.getSettings().setAllowFileAccess(false);
                //Tell the WebView to enable JavaScript execution
                wvMyPage.getSettings().setJavaScriptEnabled(true);
                //Enable the built-in zoom control for the WebView
                wvMyPage.getSettings().setBuiltInZoomControls(true);

                //set the EditText to become invisible
                etURL.setVisibility(View.GONE);


            }
        });
    }
}
