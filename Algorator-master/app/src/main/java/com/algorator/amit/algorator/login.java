package com.algorator.amit.algorator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class login extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button b3 = (Button) findViewById(R.id.button2);
        b3.setClickable(false);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText ed = (EditText) findViewById(R.id.editText3);

                String ed_text = ed.getText().toString().trim();

                EditText ed2 = (EditText) findViewById(R.id.editText4);

                String ed_text2 = ed2.getText().toString().trim();

                EditText ed3 = (EditText) findViewById(R.id.editText5);

                String ed_text3 = ed3.getText().toString().trim();

                EditText ed4 = (EditText) findViewById(R.id.editText6);

                String ed_text4 = ed4.getText().toString().trim();

                EditText ed5 = (EditText) findViewById(R.id.editText7);

                String ed_text5 = ed5.getText().toString().trim();


                if(!((ed_text.isEmpty() || ed_text.length() == 0 || ed_text.equals("") || ed_text == null)||(ed_text2.isEmpty() || ed_text2.length() == 0 || ed_text2.equals("") || ed_text2 == null)||(ed_text3.isEmpty() || ed_text3.length() == 0 || ed_text3.equals("") || ed_text3 == null)||(ed_text4.isEmpty() || ed_text4.length() == 0 || ed_text4.equals("") || ed_text4 == null)||(ed_text5.isEmpty() || ed_text5.length() == 0 || ed_text5.equals("") || ed_text5 == null)))
                {
                    b3.setClickable(true);
                    startActivity(new Intent(login.this, level.class));
                }


            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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
}
