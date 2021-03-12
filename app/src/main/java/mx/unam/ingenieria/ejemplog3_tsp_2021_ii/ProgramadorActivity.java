package mx.unam.ingenieria.ejemplog3_tsp_2021_ii;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProgramadorActivity extends AppCompatActivity {

    TextView txtvDisplay_programador;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programador);
        txtvDisplay_programador= findViewById(R.id.txtvDisplay_programador);




    }
}
