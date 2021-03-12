package mx.unam.ingenieria.ejemplog3_tsp_2021_ii;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        if(savedInstanceState != null)
        {
            display= savedInstanceState.getString("mDisplay");
            txtvDisplay.setText(display);

        }

/*
        if(savedInstanceState != null)
        {
            display= savedInstanceState.getString("mDisplay");
            txtvDisplay.setText(display);
        }
*/
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

    public void onClickProgramador(View view)
    {
        Intent intentProgramador = new Intent(MainActivity.this,ProgramadorActivity.class);
        intentProgramador.putExtra("mDisplay",display);
        startActivity(intentProgramador);
    }




    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("mDisplay",display);
    }


    /*
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("mDisplay",display);
    }
*/

}