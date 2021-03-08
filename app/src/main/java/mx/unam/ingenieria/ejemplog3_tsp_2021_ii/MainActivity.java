package mx.unam.ingenieria.ejemplog3_tsp_2021_ii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtvDisplay;
    private Button btnUno;
    private Button btnDos;
    private String display="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvDisplay= findViewById(R.id.txtvDisplay);
        btnUno= findViewById(R.id.btnUno);
        btnDos= findViewById(R.id.btnDos);
        Toast.makeText(MainActivity.this,"onCreate()",Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view)
    {

       switch ( view.getId()  )
       {
           case R.id.btnUno:
               display+="1";
               txtvDisplay.setText(display);
            break;
           case R.id.btnDos:
               display+="2";
               txtvDisplay.setText(display);
               break;
            
       }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "onStart()",Toast.LENGTH_SHORT ).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "onResume()",Toast.LENGTH_SHORT ).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "onPause()",Toast.LENGTH_SHORT ).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "onStop()",Toast.LENGTH_SHORT ).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "onDestroy()",Toast.LENGTH_SHORT ).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "onRestart()",Toast.LENGTH_SHORT ).show();
    }
}