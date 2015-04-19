package edu.washington.yujia1.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    class Player {
        Button plus;
        Button minus;
        Button plusFive;
        Button minusFive;
    }
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView text8;
    TextView text;
    View.OnClickListener btnListener;
    View.OnClickListener addListener;
    Button add;
    LinearLayout layout3;
    LinearLayout layout4;
    LinearLayout layout5;
    LinearLayout layout6;
    LinearLayout layout7;
    LinearLayout layout8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            int n = 3;
            @Override
            public void onClick(View v) {

                switch (n) {
                    case 3:
                        text3.setVisibility(View.VISIBLE);
                        layout3.setVisibility(View.VISIBLE);
                        break;
                    case 4:
                        text4.setVisibility(View.VISIBLE);
                        layout4.setVisibility(View.VISIBLE);
                        break;
                    case 5:
                        text5.setVisibility(View.VISIBLE);
                        layout5.setVisibility(View.VISIBLE);
                        break;
                    case 6:
                        text6.setVisibility(View.VISIBLE);
                        layout6.setVisibility(View.VISIBLE);
                        break;
                    case 7:
                        text7.setVisibility(View.VISIBLE);
                        layout7.setVisibility(View.VISIBLE);
                        break;
                    case 8:
                        text8.setVisibility(View.VISIBLE);
                        layout8.setVisibility(View.VISIBLE);
                        break;
                }
                n++;
            }
        });
        btnListener = new View.OnClickListener() {
            int l1 = 20;
            int l2 = 20;
            int l3 = 20;
            int l4 = 20;
            int l5 = 20;
            int l6 = 20;
            int l7 = 20;
            int l8 = 20;
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.plus1:
                        l1 += 1;
                        break;
                    case R.id.plus2:
                        l2 += 1;
                        break;
                    case R.id.plus3:
                        l3 += 1;
                        break;
                    case R.id.plus4:
                        l4 += 1;
                        break;
                    case R.id.plus5:
                        l5 += 1;
                        break;
                    case R.id.plus6:
                        l6 += 1;
                        break;
                    case R.id.plus7:
                        l7 += 1;
                        break;
                    case R.id.plus8:
                        l8 += 1;
                        break;
                    case R.id.minus1:
                        l1 -= 1;
                        break;
                    case R.id.minus2:
                        l2 -= 1;
                        break;
                    case R.id.minus3:
                        l3 -= 1;
                        break;
                    case R.id.minus4:
                        l4 -= 1;
                        break;
                    case R.id.minus5:
                        l5 -= 1;
                        break;
                    case R.id.minus6:
                        l6 -= 1;
                        break;
                    case R.id.minus7:
                        l7 -= 1;
                        break;
                    case R.id.minus8:
                        l8 -= 1;
                        break;
                    case R.id.plusFive1:
                        l1 += 5;
                        break;
                    case R.id.plusFive2:
                        l2 += 5;
                        break;
                    case R.id.plusFive3:
                        l3 += 5;
                        break;
                    case R.id.plusFive4:
                        l4 += 5;
                        break;
                    case R.id.plusFive5:
                        l5 += 5;
                        break;
                    case R.id.plusFive6:
                        l6 += 5;
                        break;
                    case R.id.plusFive7:
                        l7 += 5;
                        break;
                    case R.id.plusFive8:
                        l8 += 5;
                        break;
                    case R.id.minusFive1:
                        l1 -= 5;
                        break;
                    case R.id.minusFive2:
                        l2 -= 5;
                        break;
                    case R.id.minusFive3:
                        l3 -= 5;
                        break;
                    case R.id.minusFive4:
                        l4 -= 5;
                        break;
                    case R.id.minusFive5:
                        l5 -= 5;
                        break;
                    case R.id.minusFive6:
                        l6 -= 5;
                        break;
                    case R.id.minusFive7:
                        l7 -= 5;
                        break;
                    case R.id.minusFive8:
                        l8 -= 5;
                        break;

                }
                text1.setText("Player1's life is " + l1);
                text2.setText("Player2's life is " + l2);
                text3.setText("Player3's life is " + l3);
                text4.setText("Player4's life is " + l4);
                text5.setText("Player5's life is " + l5);
                text6.setText("Player6's life is " + l6);
                text7.setText("Player7's life is " + l7);
                text8.setText("Player8's life is " + l8);

                if (l1 <= 0){
                    text.setText("Player1 loses!");
                }
                if (l2 <= 0){
                    text.setText("Player2 loses!");
                }
                if (l3 <= 0){
                    text.setText("Player3 loses!");
                }
                if (l4 <= 0){
                    text.setText("Player4 loses!");
                }
                if (l5 <= 0){
                    text.setText("Player5 loses!");
                }
                if (l6 <= 0){
                    text.setText("Player6 loses!");
                }
                if (l7 <= 0){
                    text.setText("Player7 loses!");
                }
                if (l8 <= 0){
                    text.setText("Player8 loses!");
                }

            }
        };
        text = (TextView) findViewById(R.id.lose);
        text1 = (TextView) findViewById(R.id.Player1);
        text2 = (TextView) findViewById(R.id.Player2);
        text3 = (TextView) findViewById(R.id.Player3);
        text4 = (TextView) findViewById(R.id.Player4);
        text5 = (TextView) findViewById(R.id.Player5);
        text6 = (TextView) findViewById(R.id.Player6);
        text7 = (TextView) findViewById(R.id.Player7);
        text8 = (TextView) findViewById(R.id.Player8);

        layout3 = (LinearLayout) findViewById(R.id.layout3);
        layout4 = (LinearLayout) findViewById(R.id.layout4);
        layout5 = (LinearLayout) findViewById(R.id.layout5);
        layout6 = (LinearLayout) findViewById(R.id.layout6);
        layout7 = (LinearLayout) findViewById(R.id.layout7);
        layout8 = (LinearLayout) findViewById(R.id.layout8);

        Player player1 = new Player();
        player1.plus = (Button) findViewById(R.id.plus1);
        player1.minus = (Button) findViewById(R.id.minus1);
        player1.plusFive = (Button) findViewById(R.id.plusFive1);
        player1.minusFive = (Button) findViewById(R.id.minusFive1);
        player1.plus.setOnClickListener(btnListener);
        player1.minus.setOnClickListener(btnListener);
        player1.plusFive.setOnClickListener(btnListener);
        player1.minusFive.setOnClickListener(btnListener);

        Player player2 = new Player();
        player2.plus = (Button) findViewById(R.id.plus2);
        player2.minus = (Button) findViewById(R.id.minus2);
        player2.plusFive = (Button) findViewById(R.id.plusFive2);
        player2.minusFive = (Button) findViewById(R.id.minusFive2);
        player2.plus.setOnClickListener(btnListener);
        player2.minus.setOnClickListener(btnListener);
        player2.plusFive.setOnClickListener(btnListener);
        player2.minusFive.setOnClickListener(btnListener);

        Player player3 = new Player();
        player3.plus = (Button) findViewById(R.id.plus3);
        player3.minus = (Button) findViewById(R.id.minus3);
        player3.plusFive = (Button) findViewById(R.id.plusFive3);
        player3.minusFive = (Button) findViewById(R.id.minusFive3);
        player3.plus.setOnClickListener(btnListener);
        player3.minus.setOnClickListener(btnListener);
        player3.plusFive.setOnClickListener(btnListener);
        player3.minusFive.setOnClickListener(btnListener);

        Player player4 = new Player();
        player4.plus = (Button) findViewById(R.id.plus4);
        player4.minus = (Button) findViewById(R.id.minus4);
        player4.plusFive = (Button) findViewById(R.id.plusFive4);
        player4.minusFive = (Button) findViewById(R.id.minusFive4);
        player4.plus.setOnClickListener(btnListener);
        player4.minus.setOnClickListener(btnListener);
        player4.plusFive.setOnClickListener(btnListener);
        player4.minusFive.setOnClickListener(btnListener);

        Player player5 = new Player();
        player5.plus = (Button) findViewById(R.id.plus5);
        player5.minus = (Button) findViewById(R.id.minus5);
        player5.plusFive = (Button) findViewById(R.id.plusFive5);
        player5.minusFive = (Button) findViewById(R.id.minusFive5);
        player5.plus.setOnClickListener(btnListener);
        player5.minus.setOnClickListener(btnListener);
        player5.plusFive.setOnClickListener(btnListener);
        player5.minusFive.setOnClickListener(btnListener);

        Player player6 = new Player();
        player6.plus = (Button) findViewById(R.id.plus6);
        player6.minus = (Button) findViewById(R.id.minus6);
        player6.plusFive = (Button) findViewById(R.id.plusFive6);
        player6.minusFive = (Button) findViewById(R.id.minusFive6);
        player6.plus.setOnClickListener(btnListener);
        player6.minus.setOnClickListener(btnListener);
        player6.plusFive.setOnClickListener(btnListener);
        player6.minusFive.setOnClickListener(btnListener);

        Player player7 = new Player();
        player7.plus = (Button) findViewById(R.id.plus7);
        player7.minus = (Button) findViewById(R.id.minus7);
        player7.plusFive = (Button) findViewById(R.id.plusFive7);
        player7.minusFive = (Button) findViewById(R.id.minusFive7);
        player7.plus.setOnClickListener(btnListener);
        player7.minus.setOnClickListener(btnListener);
        player7.plusFive.setOnClickListener(btnListener);
        player7.minusFive.setOnClickListener(btnListener);

        Player player8 = new Player();
        player8.plus = (Button) findViewById(R.id.plus8);
        player8.minus = (Button) findViewById(R.id.minus8);
        player8.plusFive = (Button) findViewById(R.id.plusFive8);
        player8.minusFive = (Button) findViewById(R.id.minusFive8);
        player8.plus.setOnClickListener(btnListener);
        player8.minus.setOnClickListener(btnListener);
        player8.plusFive.setOnClickListener(btnListener);
        player8.minusFive.setOnClickListener(btnListener);


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
}
