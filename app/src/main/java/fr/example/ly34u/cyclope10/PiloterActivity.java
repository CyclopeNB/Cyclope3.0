package fr.example.ly34u.cyclope10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.longdo.mjpegviewer.MjpegView;

import io.github.controlwear.virtual.joystick.android.JoystickView;

public class PiloterActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulation);

        MjpegView viewer = (MjpegView) findViewById(R.id.mjpegview);
        viewer.setMode(MjpegView.MODE_FIT_WIDTH);
        viewer.setAdjustHeight(true);
        viewer.setUrl("http://194.179.37.149:81/mjpg/video.mjpg?COUNTER");
        viewer.startStream();

        JoystickView joystick = (JoystickView) findViewById(R.id.joystickView);
        joystick.setOnMoveListener(new JoystickView.OnMoveListener() {
                                       @Override
                                       public void onMove(int angle, int strength) {

                                       }
                                   });
        JoystickView joystick2 = (JoystickView) findViewById(R.id.joystickView2);
        joystick.setOnMoveListener(new JoystickView.OnMoveListener() {
            @Override
            public void onMove(int angle, int strength) {
                // do whatever you want
            }
        });
    }
}