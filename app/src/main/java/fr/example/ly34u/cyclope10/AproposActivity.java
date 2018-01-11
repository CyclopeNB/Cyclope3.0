package fr.example.ly34u.cyclope10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class AproposActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apropos);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.apropos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.caracteristiques:
                Intent intent = new Intent(AproposActivity.this, caracteristiqueActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(this, "caractéristiques", Toast.LENGTH_SHORT).show();
                return true;
        }

        switch (item.getItemId()) {
            case R.id.parametres:
                Intent intent = new Intent(AproposActivity.this, ParametresActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(this, "paramètres", Toast.LENGTH_SHORT).show();
                return true;
        }

        switch (item.getItemId()) {
            case R.id.wifi:
                Intent intent = new Intent(AproposActivity.this, WifiActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(this, "wifi", Toast.LENGTH_SHORT).show();
                return true;
        }

        switch (item.getItemId()) {
            case R.id.bluetooth:
                Intent intent = new Intent(AproposActivity.this, BluetoohActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(this, "bluetooth", Toast.LENGTH_SHORT).show();
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