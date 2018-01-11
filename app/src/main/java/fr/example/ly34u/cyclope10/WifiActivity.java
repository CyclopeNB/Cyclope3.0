package fr.example.ly34u.cyclope10;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class WifiActivity extends AppCompatActivity {

    private Button buttonWifi;
    private ToggleButton wifiOnOff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buttonWifi = (Button) findViewById(R.id.buttonWifi);
        buttonWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
            }
        });

        wifiOnOff = (ToggleButton) findViewById(R.id.toggleButton);
        wifiOnOff.setSelected(true);

        wifiOnOff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    WifiManager onwifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
                    onwifi.setWifiEnabled(true);
                } else {
                    WifiManager offwifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
                    offwifi.setWifiEnabled(false);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.wifi, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.caracteristiques:
                Intent intent = new Intent(WifiActivity.this, caracteristiqueActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(this, "caractéristiques", Toast.LENGTH_SHORT).show();
                return true;
        }

        switch (item.getItemId()) {
            case R.id.parametres:
                Intent intent = new Intent(WifiActivity.this, ParametresActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(this, "paramètres", Toast.LENGTH_SHORT).show();
                return true;
        }

        switch (item.getItemId()) {
            case R.id.bluetooth:
                Intent intent = new Intent(WifiActivity.this, BluetoohActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(this, "bluetooth", Toast.LENGTH_SHORT).show();
                return true;


        }

        switch (item.getItemId()) {
            case R.id.Apropos:
                Intent intent = new Intent(WifiActivity.this, AproposActivity.class);
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

