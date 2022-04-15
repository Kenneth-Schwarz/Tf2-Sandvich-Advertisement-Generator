package com.mycompany.pizzaadgenerator2v0;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    Button greenbtn, bluebtn,resetbtn,createbtn, magentabtn;
    TextView textView4,textView5, textView3,totalprice;
    EditText edittext;
    ConstraintLayout linearLayout;
    MediaPlayer mediaPlayer;
    ImageView imageView2,imageView3;


int total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greenbtn = findViewById(R.id.greenbtn);
        bluebtn = findViewById(R.id.bluebtn);
        resetbtn = findViewById(R.id.resetbtn);
        createbtn = findViewById(R.id.createbtn);
        magentabtn = findViewById(R.id.magentabtn);

        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView3 = findViewById(R.id.textView3);


        edittext = findViewById(R.id.edittext);
        totalprice = findViewById(R.id.totalprice);

        linearLayout = findViewById(R.id.linearLayout);

        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);

        greenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setBackgroundColor(Color.GREEN);
                Toast.makeText(getApplicationContext(), "Heavy has Chosen Green Sandvich! ", Toast.LENGTH_SHORT  ).show();
                HeavyYes();
            }
        });
        bluebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setBackgroundColor(Color.BLUE);
                Toast.makeText(getApplicationContext(), "Heavy has Chosen Blue Sandvich! ", Toast.LENGTH_SHORT  ).show();
                HeavyMaybe();

            }
        });
        magentabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setBackgroundColor(Color.MAGENTA);
                Toast.makeText(getApplicationContext(), "Heavy has Chosen Magenta Sandvich! ", Toast.LENGTH_SHORT  ).show();
                HeavyNo();

            }
        });




        createbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                killthemall();
                iflogic();

                String name = edittext.getText().toString();
                textView4.setText(name);        //Ad Generator

                int min = 7;
                int max = 45;
                int random_Number = (int) (Math.random() * (max - min + 1) + min);
                int random_Number2 = Math.round(100 * random_Number)/ 100;
                int random_Number3 = Math.round(random_Number2) + Math.round(random_Number);


               total  = random_Number2  + random_Number3;

                textView5.setText(Integer.toString(random_Number3));

                totalprice.setText(String.valueOf(total));

                Toast.makeText(getApplicationContext(), "You have created: " + name,  Toast.LENGTH_SHORT  ).show();



            }
        });

        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
                Toast.makeText(getApplicationContext(), "Heavy has Chosen Reset Button! ", Toast.LENGTH_SHORT  ).show();
                biglaugh();

            }
        });


    }


    public void clear() {
        textView5.setText(Integer.toString(0));
        textView4.setText("");
        totalprice.setText(Integer.toString(0));
        edittext.setText("");
        linearLayout.setBackgroundColor(Color.WHITE);
        imageView2.setImageResource(R.drawable.heavvyyy);
        imageView3.setImageResource(R.drawable.sandvich);

    }

    public void HeavyYes() {
        mediaPlayer = MediaPlayer.create(this,R.raw.heavyyes);
        mediaPlayer.start();
        imageView2.setImageResource(R.drawable.heavyyeess);

    }

    public void HeavyMaybe() {
        mediaPlayer = MediaPlayer.create(this,R.raw.heavymaybe);
        mediaPlayer.start();
        imageView2.setImageResource(R.drawable.heavymaybeee);

    }

    public void HeavyNo() {
        mediaPlayer = MediaPlayer.create(this,R.raw.heavyno);
        mediaPlayer.start();
        imageView2.setImageResource(R.drawable.heavynooo);

    }

    public void biglaugh() {
        mediaPlayer = MediaPlayer.create(this,R.raw.biglaugh);
        mediaPlayer.start();
    }

    public void killthemall() {
        mediaPlayer = MediaPlayer.create(this,R.raw.killthemall);
        mediaPlayer.start();
        imageView2.setImageResource(R.drawable.sandwhich);
    }




    public void iflogic() {
        if (total >= 90) {
            imageView3.setImageResource(R.drawable.engineer);
            //mediaPlayer = MediaPlayer.create(this,R.raw.engi);
            //mediaPlayer.start();


        } else if (total >= 80)

            imageView3.setImageResource(R.drawable.spy);




        else if (total >= 70)
            imageView3.setImageResource(R.drawable.pyro);


        else if (total >= 60)
            imageView3.setImageResource(R.drawable.solider);


        else if (total >= 50)
            imageView3.setImageResource(R.drawable.demoman);


        else if (total >= 40)
            imageView3.setImageResource(R.drawable.medic);


        else if (total >= 30)

            imageView3.setImageResource(R.drawable.scout);


        else {
            imageView3.setImageResource(R.drawable.sniper);


        }
    }
    //Add a Engineer with the if else logic and add additoinal voice lines
    // When the person presses the button, it will display a different tf2 character

}