package com.example.keyboardwarriors;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import pl.droidsonroids.gif.GifImageView;
public class MediumModeBoss extends AppCompatActivity {


    int health =3;
    MediaPlayer Song;
    int bossHealth = 7;
    public int counter = 7;
    @TargetApi(Build.VERSION_CODES.ECLAIR_0_1)
    TextView d_text;
    TextView countText;
    EditText user_input;
    ImageButton s_check;
    ImageView  healthBar1, healthBar2, healthBar3, healthBar4, healthBar5, healthBar6, healthBar7;
    GifImageView heart1, heart2, heart3;
    GifImageView enemies, enemies2, enemies3, enemies4;
    String currentWord;
    int count = 1;
    Random r;

    String[] words_list = {"Above",
            "Anger",
            "Auntie",
            "Actual",
            "Admins",
            "Awards",
            "Badge",
            "Bigot",
            "Brand",
            "Badger",
            "Bended",
            "Bygone",
            "Cabin",
            "Class",
            "Cackle",
            "Chores",
            "Common",
            "Daily",
            "Debug",
            "Dusty",
            "Dagger",
            "Dialog",
            "Dough",
            "Early",
            "Elbow",
            "Essay",
            "Earned",
            "Effort",
            "Elites",
            "Facts",
            "Feral",
            "Flame",
            "Fabric",
            "Fleece",
            "Fumble",
            "Gawks",
            "Glued",
            "Goose",
            "Gamble",
            "Gloomy",
            "Graded",
            "Hairy",
            "Hills",
            "Humor",
            "Handed",
            "Helmet",
            "Hyping",
            "Idols",
            "Intro",
            "Ionic",
            "Icings",
            "Impure",
            "Itself",
            "Jazzy",
            "Joked",
            "Judge",
            "Jailed",
            "Judged",
            "Jumped",
            "Karma",
            "Kevin",
            "Kudos",
            "Kelvin",
            "Killer",
            "Kitted",
            "Laced",
            "Limes",
            "Logic",
            "Ladder",
            "Lifted",
            "Login",
            "Magic",
            "Melee",
            "Mount",
            "Madman",
            "Matrix",
            "Mighty",
            "Needy",
            "Nitrous",
            "Nukes",
            "Napkin",
            "Nerves",
            "Notion",
            "Odors",
            "Ogres",
            "Orbit",
            "Object",
            "Offset",
            "Outcry",
            "Pacts",
            "Panda",
            "Pixel",
            "Pallet",
            "Period",
            "Piracy",
            "Quick",
            "Quack",
            "Queen",
            "Quails",
            "Quirks",
            "Qwerty",
            "Radio",
            "Rhyme",
            "Risks",
            "Radish",
            "Random",
            "Ripoff",
            "Saggy",
            "Scrap",
            "Short",
            "Safety",
            "Scheme",
            "Slides",
            "Taste",
            "Texts",
            "Troop",
            "Teabag",
            "Thirst",
            "Tutors",
            "Urban",
            "Uncut",
            "Usual",
            "Uglier",
            "Unfold",
            "Usable",
            "Value",
            "Vivid",
            "Vogue",
            "Valor",
            "Viewed",
            "Vocals",
            "Wacky",
            "Wings",
            "Wreck",
            "Waffle",
            "Weather",
            "Wretch",
            "Xerox",
            "Yards",
            "Yikes",
            "Youth",
            "Yellow",
            "Yogurt",
            "Zappy",
            "Zebra",
            "Zones",
            "Zeroes",
            "Zipped" ,
            "Zoomed"};


    private final Integer[] spawn = {
            R.drawable.goblin1idle,
            R.drawable.goblin2idle,
            R.drawable.goblin3idle,
            R.drawable.reaper1idle,
            R.drawable.reaper2idle,
            R.drawable.reaper3idle,
            R.drawable.angel1idle,
            R.drawable.angel2idle,
            R.drawable.angel3idle,
            R.drawable.satyr1idle,
            R.drawable.satyr2idle,
            R.drawable.satyr3idle,
            R.drawable.wraith1idle,
            R.drawable.wraith2idle,
            R.drawable.wraith3idle,
            R.drawable.golem1idle,
            R.drawable.golem2idle,
            R.drawable.golem3idle,
            R.drawable.golem4idle,
            R.drawable.golem5idle,
            R.drawable.golem6idle,
    };

    private final Integer[] attack = {
            R.drawable.goblin1attack,
            R.drawable.goblin2attack,
            R.drawable.goblin3attack,
            R.drawable.reaper1attack,
            R.drawable.reaper2attack,
            R.drawable.reaper3attack,
            R.drawable.angel1attack,
            R.drawable.angel2attack,
            R.drawable.angel3attack,
            R.drawable.satyr1attack,
            R.drawable.satyr2attack,
            R.drawable.satyr3attack,
            R.drawable.wraith1attack,
            R.drawable.wraith2attack,
            R.drawable.wraith3attack,
            R.drawable.golem1attack,
            R.drawable.golem2attack,
            R.drawable.golem3attack,
            R.drawable.golem4attack,
            R.drawable.golem5attack,
            R.drawable.golem6attack,
    };


    private final Integer[] death = {
            R.drawable.goblin1death,
            R.drawable.goblin2death,
            R.drawable.goblin3death,
            R.drawable.reaper1death,
            R.drawable.reaper2death,
            R.drawable.reaper3death,
            R.drawable.angel1death,
            R.drawable.angel2death,
            R.drawable.angel3death,
            R.drawable.satyr1death,
            R.drawable.satyr2death,
            R.drawable.satyr3death,
            R.drawable.wraith1death,
            R.drawable.wraith2death,
            R.drawable.wraith3death,
            R.drawable.golem1death,
            R.drawable.golem2death,
            R.drawable.golem3death,
            R.drawable.golem4death,
            R.drawable.golem5death,
            R.drawable.golem6death,
    };


    private final Integer[] hurtBoss = {
            R.drawable.angel3hurt,
    };



    private final int currImage = 8;
    private int currAttack = 8;
    private int currDeath = 8;
    private final int currHurt = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Song = MediaPlayer.create(MediumModeBoss.this, R.raw.bossmode);
        Song.start();
        Song.setLooping(true);
        Song.start();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_mode_boss);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        d_text = findViewById(R.id.display_text);
        user_input = findViewById(R.id.input_text);
        s_check = findViewById(R.id.submit);
        heart1 = findViewById(R.id.heart1);
        heart2 = findViewById(R.id.heart2);
        heart3 = findViewById(R.id.heart3);
        enemies = findViewById(R.id.enemy);
        enemies2 = findViewById(R.id.enemy2);
        enemies3 = findViewById(R.id.enemy3);
        enemies4 = findViewById(R.id.enemy4);
        healthBar1 = findViewById(R.id.Bar1);
        healthBar2 = findViewById(R.id.Bar2);
        healthBar3 = findViewById(R.id.Bar3);
        healthBar4 = findViewById(R.id.Bar4);
        healthBar5 = findViewById(R.id.Bar5);
        healthBar6 = findViewById(R.id.Bar6);
        healthBar7 = findViewById(R.id.Bar7);


        r = new Random();
        tutorial_game();
        setDeathImage();
        setInitialImage();
        setAttackingImage();
        setHurtImage();
        final TextView Timer = findViewById(R.id.Timer);
        counter = 10;
        new CountDownTimer(1000000000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Timer.setText(String.valueOf(counter));
                if (counter == 0) {
                    counter = 8;
                    health--;

                    if (health == 2) {
                        heart3.setVisibility(View.INVISIBLE);
                        MediaPlayer error;
                        error = MediaPlayer.create(getApplicationContext(), R.raw.newerrornoise);
                        error.start();
                    } else if (health == 1) {
                        heart2.setVisibility(View.INVISIBLE);
                        MediaPlayer error;
                        error = MediaPlayer.create(getApplicationContext(), R.raw.newerrornoise);
                        error.start();
                    } else if (health == 0) {
                        heart1.setVisibility(View.INVISIBLE);
                        MediaPlayer error;
                        error = MediaPlayer.create(getApplicationContext(), R.raw.newerrornoise);
                        error.start();
                        startActivity(new Intent(getApplicationContext(), GameOver.class));
                        finish();
                    }

                }

                s_check.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (user_input.getText().toString().equalsIgnoreCase(currentWord)) {
                            user_input.getText().clear();
                            counter = 7;
                            bossHealth--;


                            if (currHurt == 0) {
                                enemies.setVisibility(View.INVISIBLE);
                                enemies4.setVisibility(View.VISIBLE);

                                final Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        enemies.setVisibility(View.VISIBLE);
                                        enemies4.setVisibility(View.INVISIBLE);
                                    }
                                }, 500);
                            }

                            //boss health system
                            if(bossHealth == 6){
                                healthBar1.setVisibility(View.INVISIBLE);
                            }
                            else if(bossHealth == 5){
                                healthBar2.setVisibility(View.INVISIBLE);
                            }
                            else if(bossHealth == 4){
                                healthBar3.setVisibility(View.INVISIBLE);
                            }
                            else if(bossHealth == 3){
                                healthBar4.setVisibility(View.INVISIBLE);
                            }
                            else if(bossHealth == 2){
                                healthBar5.setVisibility(View.INVISIBLE);
                            }
                            else if(bossHealth == 1){
                                healthBar6.setVisibility(View.INVISIBLE);
                            }
                            else if (bossHealth == 0) {
                                startActivity(new Intent(getApplicationContext(), VictoryScreen.class));
                                finish();
                                count--;

                                if (currDeath == 8) {
                                    enemies.setVisibility(View.INVISIBLE);
                                    enemies3.setVisibility(View.VISIBLE);
                                    final Handler handler = new Handler();
                                    handler.postDelayed(new Runnable() {
                                        @Override
                                        public void run() {
                                            enemies.setVisibility(View.VISIBLE);
                                            enemies3.setVisibility(View.INVISIBLE);
                                        }
                                    }, 500);
                                }
                            }

                            setRealHurtImage();
                            setRealADeathImage();
                            tutorial_game();
                            setCurrentImage();


                        } else if (!(user_input.getText().toString().equalsIgnoreCase(currentWord))) {
                            health--;
                            MediaPlayer error;
                            error = MediaPlayer.create(getApplicationContext(), R.raw.newerrornoise);
                            error.start();
                            setRealAttackingImage();

                            if (health == 2) {
                                heart3.setVisibility(View.INVISIBLE);
                            } else if (health == 1) {
                                heart2.setVisibility(View.INVISIBLE);
                            } else if (health == 0) {
                                heart1.setVisibility(View.INVISIBLE);

                                startActivity(new Intent(getApplicationContext(), GameOver.class));
                                finish();

                            }

                            if (currAttack == currImage) {
                                enemies.setVisibility(View.INVISIBLE);
                                enemies2.setVisibility(View.VISIBLE);

                                final Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        enemies.setVisibility(View.VISIBLE);
                                        enemies2.setVisibility(View.INVISIBLE);
                                    }
                                }, 500);

                            }

                        }

                    }
                });
                if(count !=0){
                    counter--;
                }
                //but this must also take away a heart. it already does check line 232
            }

            @Override
            public void onFinish() {
                //Timer2.setText("Help");
                //Timer2.start();
            }
        }.start();


    }
    public void onPause(){
        super.onPause();
        Song.release();
        finish();
    }

    private String Display(String word) {
        String[] letters = word.split("");
        String display = "";
        for (String letter : letters) {
            display += letter;
        }
        return display;

    }

    private void tutorial_game() {
        currentWord = words_list[r.nextInt(words_list.length)];
        d_text.setText(Display(currentWord));
        user_input.getText().clear();
    }

    private void setInitialImage() {
        setCurrentImage();
    }

    private void setCurrentImage() {
        final GifImageView imageView = findViewById(R.id.enemy);
        imageView.setImageResource(spawn[currImage]);

    }

    private void setDeathImage() {
        setRealAttackingImage();
    }

    private void setRealADeathImage() {
        final GifImageView imageView2 = findViewById(R.id.enemy3);
        imageView2.setImageResource(death[currDeath = currImage]);
    }

    private void setAttackingImage() {
        setRealAttackingImage();
    }

    private void setRealAttackingImage() {
        final GifImageView imageView2 = findViewById(R.id.enemy2);
        imageView2.setImageResource(attack[currAttack = currImage]);

    }

    private void setHurtImage() {
        setRealHurtImage();
    }

    private void setRealHurtImage() {
        final GifImageView imageView2 = findViewById(R.id.enemy4);
        imageView2.setImageResource(hurtBoss[currHurt]);

    }
}