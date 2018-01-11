package fr.example.ly34u.cyclope10;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BluetoohActivity extends AppCompatActivity {

    private Button buttonBluetooth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooh);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            buttonBluetooth = (Button) findViewById(R.id.buttonBluetooth);
            buttonBluetooth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    startActivity(new Intent(Settings.ACTION_BLUETOOTH_SETTINGS));
                }

            });
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bluetooth, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.caracteristiques:
                Intent intent = new Intent(BluetoohActivity.this, caracteristiqueActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(this, "caractéristiques", Toast.LENGTH_SHORT).show();
                return true;
        }

        switch (item.getItemId()) {
            case R.id.parametres:
                Intent intent = new Intent(BluetoohActivity.this, ParametresActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(this, "paramètres", Toast.LENGTH_SHORT).show();
                return true;
        }

        switch (item.getItemId()) {
            case R.id.wifi:
                Intent intent = new Intent(BluetoohActivity.this, WifiActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(this, "wifi", Toast.LENGTH_SHORT).show();
                return true;
        }

        switch (item.getItemId()) {
            case R.id.Apropos:
                Intent intent = new Intent(BluetoohActivity.this, AproposActivity.class);
                startActivity(intent);
                finish();
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