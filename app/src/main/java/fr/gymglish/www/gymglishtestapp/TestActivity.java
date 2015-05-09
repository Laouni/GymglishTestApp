package fr.gymglish.www.gymglishtestapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;


public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);

        String url = "http://www.gymglish.com";
        WebView view = (WebView) this.findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.action_menu1:
                String url = "http://www.gymglish.com";
                WebView view = (WebView) this.findViewById(R.id.webView);
                view.getSettings().setJavaScriptEnabled(true);
                view.loadUrl(url);
                return true;
            case R.id.action_menu2:
                String url1 = "http://www.frantastique.com";
                WebView view1 = (WebView) this.findViewById(R.id.webView);
                view1.getSettings().setJavaScriptEnabled(true);
                view1.loadUrl(url1);
                return true;
            case R.id.action_menu3:
                String url2 = "http://www.vatefaireconjuguer.com";
                WebView view2 = (WebView) this.findViewById(R.id.webView);
                view2.getSettings().setJavaScriptEnabled(true);
                view2.loadUrl(url2);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
