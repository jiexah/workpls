package cross_nulls.example.com.cross_nulls;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.View.VISIBLE;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {
    TextView First;
    TextView Second;
    ImageView x1;
    ImageView x2;
    ImageView x3;
    ImageView x4;
    ImageView x5;
    ImageView x6;
    ImageView x7;
    ImageView x8;
    ImageView x9;
    ImageView WINNER;
    ImageView WinNur;
    Button Restart;
    int myArray[][] = new int[5][5];
    int i ;
    final int Nollik = 0;
    final int Cross = 1;
    int score1 = 0;
    int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.myscreen);
        i=getIntent().getIntExtra("First_turn",i);
        WinNur = findViewById(R.id.WinNur);
        x1 = findViewById(R.id.x1);
        x2 = findViewById(R.id.x2);
        x3 = findViewById(R.id.x3);
        x4 = findViewById(R.id.x4);
        x5 = findViewById(R.id.x5);
        x6 = findViewById(R.id.x6);
        x7 = findViewById(R.id.x7);
        x8 = findViewById(R.id.x8);
        x9 = findViewById(R.id.x9);
        WINNER = findViewById(R.id.WINNER);
        Restart = findViewById(R.id.Restart);
        First = findViewById(R.id.First);
        Second = findViewById(R.id.Second);
        x1.setOnClickListener(this);
        x2.setOnClickListener(this);
        x3.setOnClickListener(this);
        x4.setOnClickListener(this);
        x5.setOnClickListener(this);
        x6.setOnClickListener(this);
        x7.setOnClickListener(this);
        x8.setOnClickListener(this);
        x9.setOnClickListener(this);
        Restart.setOnClickListener(this);
        String str1 = getIntent().getStringExtra("First");
        String str2 = getIntent().getStringExtra("Second");
        String str3 = getIntent().getStringExtra("Best_of");


        First.setText(str1 + ": " + score1 + " from " + str3);
        Second.setText(str2 + ": " + score2 + " from " + str3);
    }

    public void onClick(View v) {

        String str1 = getIntent().getStringExtra("First");
        String str2 = getIntent().getStringExtra("Second");
        String str3 = getIntent().getStringExtra("Best_of");

        First.setText(str1 + ": " + score1 + " from " + str3);
        Second.setText(str2 + ": " + score2 + " from " + str3);
        if (i<=9) {


            switch (v.getId()) {
                case R.id.Restart:
                    x1.setImageResource(R.drawable.def);
                    x2.setImageResource(R.drawable.def);
                    x3.setImageResource(R.drawable.def);
                    x4.setImageResource(R.drawable.def);
                    x5.setImageResource(R.drawable.def);
                    x6.setImageResource(R.drawable.def);
                    x7.setImageResource(R.drawable.def);
                    x8.setImageResource(R.drawable.def);
                    x9.setImageResource(R.drawable.def);
                    WinNur.setImageResource(R.drawable.ole);

                    WinNur.setVisibility(View.INVISIBLE);
                    for (int x = 1; x < 4; x++) {
                        for (int y = 1; y < 4; y++) {
                            myArray[x][y] = 0;
                        }
                    }
                    i = 0;

                    break;
                case R.id.x1:

                    if (myArray[1][1] != 0)
                        Toast.makeText(this, "В это поле уже походили", Toast.LENGTH_LONG).show();
                    else {
                        i++;
                        if (i % 2 == 0) {
                            x1.setImageResource(R.drawable.nollik);
                            myArray[1][1] = 5;
                        } else {
                            x1.setImageResource(R.drawable.cross);
                            myArray[1][1] = 1;
                        }
                    }
                    break;
                case R.id.x2:
                    if (myArray[1][2] != 0)
                        Toast.makeText(this, "В это поле уже походили", Toast.LENGTH_LONG).show();
                    else {
                        i++;
                        if (i % 2 == 0) {
                            x2.setImageResource(R.drawable.nollik);
                            myArray[1][2] = 5;
                        } else {
                            x2.setImageResource(R.drawable.cross);
                            myArray[1][2] = 1;
                        }
                    }
                    break;
                case R.id.x3:
                    if (myArray[1][3] != 0)
                        Toast.makeText(this, "В это поле уже походили", Toast.LENGTH_LONG).show();
                    else {
                        i++;
                        if (i % 2 == 0) {
                            x3.setImageResource(R.drawable.nollik);
                            myArray[1][3] = 5;
                        } else {
                            x3.setImageResource(R.drawable.cross);
                            myArray[1][3] = 1;
                        }
                    }
                    break;
                case R.id.x4:
                    if (myArray[2][1] != 0)
                        Toast.makeText(this, "В это поле уже походили", Toast.LENGTH_LONG).show();
                    else {
                        i++;
                        if (i % 2 == 0) {
                            x4.setImageResource(R.drawable.nollik);
                            myArray[2][1] = 5;
                        } else {
                            x4.setImageResource(R.drawable.cross);
                            myArray[2][1] = 1;
                        }
                    }
                    break;

                case R.id.x5:
                    if (myArray[2][2] != 0)
                        Toast.makeText(this, "В это поле уже походили", Toast.LENGTH_LONG).show();
                    else {
                        i++;
                        if (i % 2 == 0) {
                            x5.setImageResource(R.drawable.nollik);
                            myArray[2][2] = 5;
                        } else {
                            x5.setImageResource(R.drawable.cross);
                            myArray[2][2] = 1;
                        }
                    }
                    break;

                case R.id.x6:
                    if (myArray[2][3] != 0)
                        Toast.makeText(this, "В это поле уже походили", Toast.LENGTH_LONG).show();
                    else {
                        i++;
                        if (i % 2 == 0) {
                            x6.setImageResource(R.drawable.nollik);
                            myArray[2][3] = 5;
                        } else {
                            x6.setImageResource(R.drawable.cross);
                            myArray[2][3] = 1;
                        }
                    }
                    break;
                case R.id.x7:
                    if (myArray[3][1] != 0)
                        Toast.makeText(this, "В это поле уже походили", Toast.LENGTH_LONG).show();
                    else {
                        i++;
                        if (i % 2 == 0) {
                            x7.setImageResource(R.drawable.nollik);
                            myArray[3][1] = 5;
                        } else {
                            x7.setImageResource(R.drawable.cross);
                            myArray[3][1] = 1;
                        }
                    }
                    break;

                case R.id.x8:
                    if (myArray[3][2] != 0)
                        Toast.makeText(this, "В это поле уже походили", Toast.LENGTH_LONG).show();
                    else {
                        i++;
                        if (i % 2 == 0) {
                            x8.setImageResource(R.drawable.nollik);
                            myArray[3][2] = 5;
                        } else {
                            x8.setImageResource(R.drawable.cross);
                            myArray[3][2] = 1;
                        }
                    }
                    break;

                case R.id.x9:
                    if (myArray[3][3] != 0)
                        Toast.makeText(this, "В это поле уже походили", Toast.LENGTH_LONG).show();
                    else {
                        i++;
                        if (i % 2 == 0) {
                            x9.setImageResource(R.drawable.nollik);
                            myArray[3][3] = 5;
                        } else {
                            x9.setImageResource(R.drawable.cross);
                            myArray[3][3] = 1;
                        }
                    }
                    break;

            }
            for (int z = 1; z <= 3; z++) {

                if (myArray[z][1] + myArray[z][2] + myArray[z][3] == 15) {


                    Toast.makeText(this, "Нолики победили", Toast.LENGTH_LONG).show();
                    if(z==1){
                        WinNur.setImageResource(R.drawable.horiz1);
                    }
                    if(z==2){
                        WinNur.setImageResource(R.drawable.horiz2);
                    }
                    if(z==3){
                        WinNur.setImageResource(R.drawable.horiz3);
                    }
                    WinNur.setVisibility(VISIBLE);
                    z=4;
                    score1++;
                    i=10;

                } else {
                    if (myArray[z][1] + myArray[z][2] + myArray[z][3] == 3) {

                        Toast.makeText(this, "Крестики победили", Toast.LENGTH_LONG).show();
                        if(z==1){
                            WinNur.setImageResource(R.drawable.horiz1);
                        }
                        if(z==2){
                            WinNur.setImageResource(R.drawable.horiz2);
                        }
                        if(z==3){
                            WinNur.setImageResource(R.drawable.horiz3);
                        }
                        i=10;
                        score2++;
                        z=4;
                        WinNur.setVisibility(VISIBLE);
                    }
                }
                if (myArray[1][z] + myArray[2][z] + myArray[3][z] == 15) {

                    Toast.makeText(this, "Нолики победили", Toast.LENGTH_LONG).show();
                    if(z==1){
                        WinNur.setImageResource(R.drawable.vert1);
                    }
                    if(z==2){
                        WinNur.setImageResource(R.drawable.vert2);
                    }
                    if(z==3){
                        WinNur.setImageResource(R.drawable.vert3);
                    }
                        WinNur.setVisibility(VISIBLE);
                    score1++;
                    i=10;
                    z=4;
                } else {
                    if (myArray[1][z] + myArray[2][z] + myArray[3][z] == 3) {
                        Toast.makeText(this, "Крестики победили", Toast.LENGTH_LONG).show();
                        if(z==1){
                            WinNur.setImageResource(R.drawable.vert1);
                        }
                        if(z==2){
                            WinNur.setImageResource(R.drawable.vert2);
                        }
                        if(z==3){
                            WinNur.setImageResource(R.drawable.vert3);
                        }
                        score2++;
                        i=10;
                        z=4;

                        WinNur.setVisibility(VISIBLE);
                    }
                }
                if (myArray[1][1] + myArray[2][2] + myArray[3][3] == 15) {
                    score1++;
                    i=10;
                    z=4;

                    WinNur.setImageResource(R.drawable.diag1);
                    Toast.makeText(this, "Нолики победили", Toast.LENGTH_LONG).show();
                } else
                    if (myArray[1][1] + myArray[2][2] + myArray[3][3] == 3) {
                        score2++;
                        z=4;
                        i=10;

                        WinNur.setImageResource(R.drawable.diag1);

                        WinNur.setVisibility(VISIBLE);
                        Toast.makeText(this, "Крестики победили", Toast.LENGTH_LONG).show();
                    }


                if (myArray[3][1] + myArray[2][2] + myArray[1][3] == 15) {
                    score1++;
                    i=10;
                    z=4;

                    WinNur.setVisibility(VISIBLE);
                    WinNur.setImageResource(R.drawable.diag2);
                    Toast.makeText(this, "Нолики победили", Toast.LENGTH_LONG).show();
                } else {
                    if (myArray[3][1] + myArray[2][2] + myArray[1][3] == 3) {
                        score2++;
                        WinNur.setImageResource(R.drawable.diag2);
                        z=4;
                        i=10;

                        WinNur.setVisibility(VISIBLE);
                        Toast.makeText(this, "Крестики победили", Toast.LENGTH_LONG).show();

                    }
                }
            }

        }else {
            if (Integer.parseInt(str3)-score1 < score1 & Integer.parseInt(str3)%2 != 0 || Integer.parseInt(str3)-score2 < score2 & Integer.parseInt(str3)%2 !=0 || Integer.parseInt(str3)<=score1+score2) {
                if (score1 > score2) {
                    Toast.makeText(this, str1 + " Победил/a", Toast.LENGTH_LONG).show();

                    WINNER.setVisibility(VISIBLE);
                    WINNER.startAnimation(AnimationUtils.loadAnimation(this,R.anim.mycombo));
                } else {
                    if(score1 == score2){
                        Toast.makeText(this, "Ничья", Toast.LENGTH_LONG).show();
                        WINNER.setImageResource(R.drawable.draw);
                        WINNER.setVisibility(VISIBLE);
                        WINNER.startAnimation(AnimationUtils.loadAnimation(this,R.anim.mycombo));
                    }else{

                        Toast.makeText(this, str2 + " Победил/a", Toast.LENGTH_LONG).show();

                        WINNER.setVisibility(VISIBLE);
                        WINNER.startAnimation(AnimationUtils.loadAnimation(this,R.anim.mycombo));
                    }}
            }else{
                i=getIntent().getIntExtra("First_turn",i);
                onClick(Restart);

            }
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("myArray11", myArray[1][1]);
        outState.putInt("myArray12", myArray[1][2]);
        outState.putInt("myArray13", myArray[1][3]);
        outState.putInt("myArray21", myArray[2][1]);
        outState.putInt("myArray22", myArray[2][2]);
        outState.putInt("myArray23", myArray[2][3]);
        outState.putInt("myArray31", myArray[3][1]);
        outState.putInt("myArray32", myArray[3][2]);
        outState.putInt("myArray33", myArray[3][3]);
        outState.putInt("score1",score1);
        outState.putInt("score2",score2);
        outState.putInt("turn", i);
        outState.putString("str1", getIntent().getStringExtra("First"));
        outState.putString("str2", getIntent().getStringExtra("Second"));
        outState.putString("str3", getIntent().getStringExtra("Best_of"));
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String str1 = savedInstanceState.getString("str1");
        String str2 = savedInstanceState.getString("str2");
        String str3 = savedInstanceState.getString("str3");
        score1= savedInstanceState.getInt("score1");
        score2= savedInstanceState.getInt("score2");
        i= savedInstanceState.getInt("turn");
        First.setText(str1 + ": " + score1 + " from " + str3);
        Second.setText(str2 + ": " + score2 + " from " + str3);
        myArray[1][1] = savedInstanceState.getInt("myArray11");
        myArray[1][2] = savedInstanceState.getInt("myArray12");
        myArray[1][3] = savedInstanceState.getInt("myArray13");
        myArray[2][1] = savedInstanceState.getInt("myArray21");
        myArray[2][2] = savedInstanceState.getInt("myArray22");
        myArray[2][3] = savedInstanceState.getInt("myArray23");
        myArray[3][1] = savedInstanceState.getInt("myArray31");
        myArray[3][2] = savedInstanceState.getInt("myArray32");
        myArray[3][3] = savedInstanceState.getInt("myArray33");
        if(myArray[1][1]==1)
            x1.setImageResource(R.drawable.cross);
        else if(myArray[1][1]==5)
            x1.setImageResource(R.drawable.nollik);
        if(myArray[1][2]==1)
            x2.setImageResource(R.drawable.cross);
        else if(myArray[1][2]==5)
            x2.setImageResource(R.drawable.nollik);
        if(myArray[1][3]==1)
            x3.setImageResource(R.drawable.cross);
        else if(myArray[1][3]==5)
            x3.setImageResource(R.drawable.nollik);
        if(myArray[2][1]==1)
            x4.setImageResource(R.drawable.cross);
        else if(myArray[2][1]==5)
            x4.setImageResource(R.drawable.nollik);
        if(myArray[2][2]==1)
            x5.setImageResource(R.drawable.cross);
        else if(myArray[2][2]==5)
            x5.setImageResource(R.drawable.nollik);
        if(myArray[2][3]==1)
            x6.setImageResource(R.drawable.cross);
        else if(myArray[2][3]==5)
            x6.setImageResource(R.drawable.nollik);
        if(myArray[3][1]==1)
            x7.setImageResource(R.drawable.cross);
        else if(myArray[3][1]==5)
            x7.setImageResource(R.drawable.nollik);
        if(myArray[3][2]==1)
            x8.setImageResource(R.drawable.cross);
        else if(myArray[3][2]==5)
            x8.setImageResource(R.drawable.nollik);
        if(myArray[3][3]==1)
            x9.setImageResource(R.drawable.cross);
        else if(myArray[3][3]==5)
            x9.setImageResource(R.drawable.nollik);

    for (int z = 1; z <= 3; z++) {

        if (myArray[z][1] + myArray[z][2] + myArray[z][3] == 15) {


            Toast.makeText(this, "Нолики победили", Toast.LENGTH_LONG).show();
            if(z==1){
                WinNur.setImageResource(R.drawable.horiz1);
            }
            if(z==2){
                WinNur.setImageResource(R.drawable.horiz2);
            }
            if(z==3){
                WinNur.setImageResource(R.drawable.horiz3);
            }
            WinNur.setVisibility(VISIBLE);
            z=4;
            score1++;
            i=10;

        } else {
            if (myArray[z][1] + myArray[z][2] + myArray[z][3] == 3) {

                Toast.makeText(this, "Крестики победили", Toast.LENGTH_LONG).show();
                if(z==1){
                    WinNur.setImageResource(R.drawable.horiz1);
                }
                if(z==2){
                    WinNur.setImageResource(R.drawable.horiz2);
                }
                if(z==3){
                    WinNur.setImageResource(R.drawable.horiz3);
                }
                i=10;
                score2++;
                z=4;
                WinNur.setVisibility(VISIBLE);
            }
        }
        if (myArray[1][z] + myArray[2][z] + myArray[3][z] == 15) {

            Toast.makeText(this, "Нолики победили", Toast.LENGTH_LONG).show();
            if(z==1){
                WinNur.setImageResource(R.drawable.vert1);
            }
            if(z==2){
                WinNur.setImageResource(R.drawable.vert2);
            }
            if(z==3){
                WinNur.setImageResource(R.drawable.vert3);
            }
            WinNur.setVisibility(VISIBLE);
            score1++;
            i=10;
            z=4;
        } else {
            if (myArray[1][z] + myArray[2][z] + myArray[3][z] == 3) {
                Toast.makeText(this, "Крестики победили", Toast.LENGTH_LONG).show();
                if(z==1){
                    WinNur.setImageResource(R.drawable.vert1);
                }
                if(z==2){
                    WinNur.setImageResource(R.drawable.vert2);
                }
                if(z==3){
                    WinNur.setImageResource(R.drawable.vert3);
                }
                score2++;
                i=10;
                z=4;

                WinNur.setVisibility(VISIBLE);
            }
        }
        if (myArray[1][1] + myArray[2][2] + myArray[3][3] == 15) {
            score1++;
            i=10;
            z=4;

            WinNur.setImageResource(R.drawable.diag1);
            Toast.makeText(this, "Нолики победили", Toast.LENGTH_LONG).show();
        } else
        if (myArray[1][1] + myArray[2][2] + myArray[3][3] == 3) {
            score2++;
            z=4;
            i=10;

            WinNur.setImageResource(R.drawable.diag1);

            WinNur.setVisibility(VISIBLE);
            Toast.makeText(this, "Крестики победили", Toast.LENGTH_LONG).show();
        }


        if (myArray[3][1] + myArray[2][2] + myArray[1][3] == 15) {
            score1++;
            i=10;
            z=4;

            WinNur.setVisibility(VISIBLE);
            WinNur.setImageResource(R.drawable.diag2);
            Toast.makeText(this, "Нолики победили", Toast.LENGTH_LONG).show();
        } else {
            if (myArray[3][1] + myArray[2][2] + myArray[1][3] == 3) {
                score2++;
                WinNur.setImageResource(R.drawable.diag2);
                z=4;
                i=10;

                WinNur.setVisibility(VISIBLE);
                Toast.makeText(this, "Крестики победили", Toast.LENGTH_LONG).show();

            }
        }
    }
}
}

