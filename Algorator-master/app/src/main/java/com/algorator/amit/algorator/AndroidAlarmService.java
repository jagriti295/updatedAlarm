//package com.exercise.AndroidAlarmService;

package com.algorator.amit.algorator;


import java.util.Calendar;



import android.app.Activity;

import android.app.AlarmManager;

import android.app.PendingIntent;

import android.content.Intent;

import android.os.Bundle;

import android.os.SystemClock;

import android.view.View;

import android.widget.Button;

import android.widget.Toast;



public class AndroidAlarmService extends Activity {



    private PendingIntent pendingIntent;





    /** Called when the activity is first created. */

    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.alarm);

        Button buttonStart = (Button)findViewById(R.id.startalarm);

        Button buttonCancel = (Button)findViewById(R.id.cancelalarm);



        buttonStart.setOnClickListener(new View.OnClickListener(){



            @Override

            public void onClick(View arg0) {

                // TODO Auto-generated method stub



                Intent myIntent = new Intent(AndroidAlarmService.this, login.class);

                pendingIntent = PendingIntent.getService(AndroidAlarmService.this, 0, myIntent, 0);



                AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);



                Calendar calendar = Calendar.getInstance();

                calendar.setTimeInMillis(System.currentTimeMillis());
                //calendar.set(Calendar.HOUR_OF_DAY, 23);
                //calendar.set(Calendar.MINUTE, 23);

                calendar.add(Calendar.SECOND, 10);

               alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
               //alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 11*1000, pendingIntent);

                startActivity(myIntent);

                Toast.makeText(AndroidAlarmService.this, "Start Alarm", Toast.LENGTH_LONG).show();

            }});



        buttonCancel.setOnClickListener(new View.OnClickListener(){



            @Override

            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);

                alarmManager.cancel(pendingIntent);

                Intent myIntent = new Intent(AndroidAlarmService.this, FullscreenActivity.class);

                startActivity(myIntent);

                // Tell the user about what we did.

                Toast.makeText(AndroidAlarmService.this, "Cancel!", Toast.LENGTH_LONG).show();





            }});



    }

}