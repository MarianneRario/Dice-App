package mariannerario.com.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);
        Button resetButton = findViewById(R.id.resetButton);
        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDIce = findViewById(R.id.image_rightDice);
        final int [] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","Reset sucessfully.");
                leftDice.setImageResource(diceArray[0]);
                rightDIce.setImageResource(diceArray[0]);
            }
        });

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "The button has been pressed.");
                Random randomNumber = new Random();
                int number = randomNumber.nextInt(6);
                Log.d("Dicee","The random number is :" + number);

                leftDice.setImageResource(diceArray[number]);
                number = randomNumber.nextInt(6);
                rightDIce.setImageResource((diceArray[number]));
            }
        });
    }
}
