package com.example.krestikynoliky;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageButton l1 = (ImageButton)findViewById(R.id.l1);
        final ImageButton l2 = (ImageButton)findViewById(R.id.l2);
        final ImageButton l3 = (ImageButton)findViewById(R.id.l3);
        final ImageButton l4 = (ImageButton)findViewById(R.id.l4);
        final ImageButton l5 = (ImageButton)findViewById(R.id.l5);
        final ImageButton l6 = (ImageButton)findViewById(R.id.l6);
        final ImageButton l7 = (ImageButton)findViewById(R.id.l7);
        final ImageButton l8 = (ImageButton)findViewById(R.id.l8);
        final ImageButton l9 = (ImageButton)findViewById(R.id.l9);
        final Button button = (Button)findViewById(R.id.button);
        final TextView ogl = (TextView)findViewById(R.id.textView);
        final TextView rez = (TextView)findViewById(R.id.textView2);
        button.setClickable(false);
        final Pole a = new Pole();
        if(a.turn == 1){ rez.setText("Крестики"); }
        else{rez.setText("Нолики");}
        final View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v){
                switch(v.getId()){
                    case R.id.l1:
                        if(a.turn % 2 == 0) {
                            l1.setImageResource(R.drawable.krest);
                        a.pole[0][0] = 1;}
                        else{
                            l1.setImageResource(R.drawable.lrug);
                            a.pole[0][0] = 2;    }
                        a.turn++;
                        if(a.check(a.pole)[0] == true){ HaveWiner(a.check(a.pole) , ogl , rez); }
                    case R.id.l2:
                        if(a.turn % 2 == 0) {
                            l2.setImageResource(R.drawable.krest);
                            a.pole[0][1] = 1;}
                        else{
                            l2.setImageResource(R.drawable.lrug);
                            a.pole[0][1] = 2;    }

                        a.turn++;
                        if(a.check(a.pole)[0] == true){ HaveWiner(a.check(a.pole) , ogl , rez); }
                    case R.id.l3:
                        if(a.turn % 2 == 0) {
                            l3.setImageResource(R.drawable.krest);
                            a.pole[0][2] = 1;}
                        else{
                            l3.setImageResource(R.drawable.lrug);
                            a.pole[0][2] = 2;    }

                        a.turn++;
                        if(a.check(a.pole)[0] == true){ HaveWiner(a.check(a.pole) , ogl , rez); }
                    case R.id.l4:
                        if(a.turn % 2 == 0) {
                            l4.setImageResource(R.drawable.krest);
                            a.pole[1][0] = 1;}
                        else{
                            l4.setImageResource(R.drawable.lrug);
                            a.pole[1][0] = 2;    }

                        a.turn++;
                        if(a.check(a.pole)[0] == true){ HaveWiner(a.check(a.pole) , ogl , rez); }
                    case R.id.l5:
                        if(a.turn % 2 == 0) {
                            l5.setImageResource(R.drawable.krest);
                            a.pole[1][1] = 1;}
                        else{
                            l5.setImageResource(R.drawable.lrug);
                            a.pole[1][1] = 2;    }

                        a.turn++;
                        if(a.check(a.pole)[0] == true){ HaveWiner(a.check(a.pole) , ogl , rez); }
                    case R.id.l6:
                        if(a.turn % 2 == 0) {
                            l6.setImageResource(R.drawable.krest);
                            a.pole[1][2] = 1;}
                        else{
                            l6.setImageResource(R.drawable.lrug);
                            a.pole[1][2] = 2;    }

                        a.turn++;
                        if(a.check(a.pole)[0] == true){ HaveWiner(a.check(a.pole) , ogl , rez); }
                    case R.id.l7:
                        if(a.turn % 2 == 0) {
                            l7.setImageResource(R.drawable.krest);
                            a.pole[2][0] = 1;}
                        else{
                            l7.setImageResource(R.drawable.lrug);
                            a.pole[2][0] = 2;    }

                        a.turn++;
                        if(a.check(a.pole)[0] == true){ HaveWiner(a.check(a.pole) , ogl , rez); }
                    case R.id.l8:
                        if(a.turn % 2 == 0) {
                            l8.setImageResource(R.drawable.krest);
                            a.pole[2][1] = 1;}
                        else{
                            l8.setImageResource(R.drawable.lrug);
                            a.pole[2][1] = 2;    }

                        a.turn++;
                        if(a.check(a.pole)[0] == true){ HaveWiner(a.check(a.pole) , ogl , rez); }
                    case R.id.l9:
                        if(a.turn % 2 == 0) {
                        l9.setImageResource(R.drawable.krest);
                        a.pole[2][2] = 1;}
                    else{
                        l9.setImageResource(R.drawable.lrug);
                        a.pole[2][2] = 2;    }
                        a.turn++;
                       if(a.check(a.pole)[0] == true){ HaveWiner(a.check(a.pole) , ogl , rez); }

                }
            }
    };
        l1.setOnClickListener(listener);
        l2.setOnClickListener(listener);
        l3.setOnClickListener(listener);
        l4.setOnClickListener(listener);
        l5.setOnClickListener(listener);
        l6.setOnClickListener(listener);
        l7.setOnClickListener(listener);
        l8.setOnClickListener(listener);
        l9.setOnClickListener(listener);
        }
        public void HaveWiner(boolean [] a , TextView v1 , TextView v2){
        v1.setText("У нас есть попедитель !");
        if(a[1] == true){
                v2.setText("Победила дружба(Крестики)");
            }
            else{v2.setText("Победила дружба(Нолики)");}
        }
}