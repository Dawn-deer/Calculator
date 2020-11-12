package com.example.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import static com.example.calculator.MainActivity.activityList;

public class Help extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            case R.id.zhu:{
                Intent intent = new Intent(Help.this,MainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.length:{
                Intent intent = new Intent(Help.this,Changdu.class);
                startActivity(intent);
                break;
            }
            case R.id.area:{
                Intent intent = new Intent(Help.this,Area.class);
                startActivity(intent);
                break;
            }

            case R.id.jinzhi:{
                Intent intent = new Intent(Help.this,Jinzhi.class);
                startActivity(intent);
                break;
            }
            case R.id.exit:{
                exit();
            }
        }
        return false;
    }
    public void exit(){

        for(Activity act:activityList){

            act.finish();

        }

        System.exit(0);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        activityList.add(this);
    }
}