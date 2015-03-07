package com.algorator.amit.algorator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class register extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final Button b4 = (Button) findViewById(R.id.button10);
        b4.setClickable(false);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText ed = (EditText) findViewById(R.id.editText);

                String ed_text = ed.getText().toString().trim();

                EditText ed2 = (EditText) findViewById(R.id.editText2);

                String ed_text2 = ed2.getText().toString().trim();

                if(!((ed_text.isEmpty() || ed_text.length() == 0 || ed_text.equals("") || ed_text == null)||(ed_text2.isEmpty() || ed_text2.length() == 0 || ed_text2.equals("") || ed_text2 == null)))
                {
                    b4.setClickable(true);
                    startActivity(new Intent(register.this, screen_final.class));
                }


            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register, menu);
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
