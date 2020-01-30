package com.example.rockpaper;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();



            }
        });

    }


    private int userScore = 0;
    private int compScore = 0;

    public void rockBClick(View v) {
        TextView r = (TextView) findViewById(R.id.outputLabel);
        r.setText("Rock!");


        TextView o = (TextView) findViewById(R.id.outputLabel2);
        o.setText("Computer chose: " // + method call results
        );

        //if results = Rock
        TextView w = (TextView) findViewById(R.id.win);
        w.setText("Tie!");


        // else if results = Paper
        TextView w2 = (TextView) findViewById(R.id.win);
        w2.setText("Computer wins!");

        TextView sc = (TextView) findViewById(R.id.score);
        sc.setText("Computer: " + String.valueOf(++compScore) + " Player: " + String.valueOf(userScore));


        // else if results = Scissors
        TextView w3 = (TextView) findViewById(R.id.win);
        w3.setText("Player wins!");

        TextView sc2 = (TextView) findViewById(R.id.score);
        sc2.setText("Computer: " + String.valueOf(compScore) + " Player: " + String.valueOf(++userScore));

    }

    public void paperButtonClick(View v) {
        TextView p = (TextView) findViewById(R.id.outputLabel);
        p.setText("Paper!");

        TextView o = (TextView) findViewById(R.id.outputLabel2);
        o.setText("Computer chose: " + Weapon);


        //if results = Paper
        TextView w = (TextView) findViewById(R.id.win);
        w.setText("Tie!");


        // else if results = Scissors
        TextView w2 = (TextView) findViewById(R.id.win);
        w2.setText("Computer wins!");

        TextView sc = (TextView) findViewById(R.id.score);
        sc.setText("Computer: " + String.valueOf(++compScore) + " Player: " + String.valueOf(userScore));


        // else if results = Rock
        TextView w3 = (TextView) findViewById(R.id.win);
        w3.setText("Player wins!");

        TextView sc2 = (TextView) findViewById(R.id.score);
        sc2.setText("Computer: " + String.valueOf(compScore) + " Player: " + String.valueOf(++userScore));
    }

    public void scissorsButtonClick(View v) {
        TextView s = (TextView) findViewById(R.id.outputLabel);
        s.setText("Scissors!");

        TextView o = (TextView) findViewById(R.id.outputLabel2);
        o.setText("Computer chose: " + Weapon);


        //if results = Scissors
        TextView w = (TextView) findViewById(R.id.win);
        w.setText("Tie!");


        // else if results = Rock
        TextView w2 = (TextView) findViewById(R.id.win);
        w2.setText("Computer wins!");

        TextView sc = (TextView) findViewById(R.id.score);
        sc.setText("Computer: " + String.valueOf(++compScore) + " Player: " + String.valueOf(userScore));


        // else if results = Paper
        TextView w3 = (TextView) findViewById(R.id.win);
        w3.setText("Player wins!");

        TextView sc2 = (TextView) findViewById(R.id.score);
        sc2.setText("Computer: " + String.valueOf(compScore) + " Player: " + String.valueOf(++userScore));
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public enum Weapon {

        ROCK("Rock"),
        PAPER("Paper"),
        SCISSORS("Scissors");
        private String message;

        private Weapon(String msg) { message = msg; }

        @Override
        public String toString() { return message; }

        public Weapon getRandom() {
            Weapon.values();
            //get random 0 1 2 from array

            Weapon[] values = Weapon.values();  //making the array called values
            Random r = new Random();            //making random variable
            return (values[r.nextInt(values.length)]);  //returning random spot from values array

        }

    };





}
