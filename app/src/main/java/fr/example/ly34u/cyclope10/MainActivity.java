package fr.example.ly34u.cyclope10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.txtSimulation);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("OC_RSS", "Simulation");

                Intent myintent = new Intent(MainActivity.this, PiloterActivity.class);
                startActivity(myintent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.caracteristiques:
                    Intent intent = new Intent(MainActivity.this, caracteristiqueActivity.class);
                    startActivity(intent);

                    Toast.makeText(this, "caractéristiques", Toast.LENGTH_SHORT).show();
                    return true;
            }

            switch (item.getItemId()) {
            case R.id.parametres:
                Intent intent = new Intent(MainActivity.this, ParametresActivity.class);
                startActivity(intent);
                Toast.makeText(this, "paramètres", Toast.LENGTH_SHORT).show();
                return true;
            }

             switch (item.getItemId()) {
             case R.id.wifi:
                Intent intent = new Intent(MainActivity.this, WifiActivity.class);
                startActivity(intent);

                Toast.makeText(this, "wifi", Toast.LENGTH_SHORT).show();
                return true;
        }

        switch (item.getItemId()) {
            case R.id.bluetooth:
                Intent intent = new Intent(MainActivity.this, BluetoohActivity.class);
                startActivity(intent);

                Toast.makeText(this, "bluetooth", Toast.LENGTH_SHORT).show();
                return true;


        }

              switch (item.getItemId()) {
                  case R.id.Apropos:
                     Intent intent = new Intent(MainActivity.this, AproposActivity.class);
                     startActivity(intent);

                     Toast.makeText(this, "caractéristiques", Toast.LENGTH_SHORT).show();
                     return true;
            }

              switch (item.getItemId()) {
                case R.id.quitter:
                    finish();
                    System.exit(0);
                    Toast.makeText(this, "quitter", Toast.LENGTH_SHORT).show();
                    return true;



                default:
                    return super.onOptionsItemSelected(item);
            }

    }

}
