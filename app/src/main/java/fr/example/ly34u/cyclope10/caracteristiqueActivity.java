package fr.example.ly34u.cyclope10;

import android.app.Application;
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class caracteristiqueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caracteristique);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.caracteristique, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.parametres:
                Intent intent = new Intent(caracteristiqueActivity.this, ParametresActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(this, "paramètres", Toast.LENGTH_SHORT).show();
                return true;
        }

        switch (item.getItemId()) {
            case R.id.wifi:
                Intent intent = new Intent(caracteristiqueActivity.this, WifiActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(this, "wifi", Toast.LENGTH_SHORT).show();
                return true;
        }

        switch (item.getItemId()) {
            case R.id.bluetooth:
                Intent intent = new Intent(caracteristiqueActivity.this, BluetoohActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(this, "bluetooth", Toast.LENGTH_SHORT).show();
                return true;


        }

        switch (item.getItemId()) {
            case R.id.Apropos:
                Intent intent = new Intent(caracteristiqueActivity.this, AproposActivity.class);
                startActivity(intent);
                Toast.makeText(this, "A propos", Toast.LENGTH_SHORT).show();
                return true;
        }

        switch (item.getItemId()) {
            case R.id.quitter:
                finish();
                System.exit(0);


            default:
                return super.onOptionsItemSelected(item);
        }



    }
}

