package com.okamipride.gobindtemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
//import go.gobindtemp.Gobindtemp;
import go.addarr.Addarr;

public class BindTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bind_test);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bind_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void OnGetGoMessage(View v) {
        //String greetings = Gobindtemp.Greetings("Andoid");
        String greetings2 = Addarr.Greetings("Android and Gopher");
        //String greetings = Hello.Greetings("Android and Gopher");
        TextView msgtxv = (TextView)findViewById(R.id.txtv_msg);
        TextView msgtxv2 = (TextView)findViewById(R.id.txtv_fromhello);
       // msgtxv.setText(greetings);
        msgtxv2.setText(greetings2);
    }
}
