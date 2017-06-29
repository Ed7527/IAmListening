package com.edwardtorpy.iamlistening;

import android.Manifest;
import android.media.MediaRecorder;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaRecorder mRecorder;

    // Requesting permission to record audio
    private boolean permissionToRecordAudioGranted = false;
    private String [] permissions = {Manifest.permission.RECORD_AUDIO};

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    public void recordSound(View view) {
        Toast.makeText(this, "Record", Toast.LENGTH_SHORT).show();
    }

    public void playSound(View view) {
        Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show();
    }

    public void stopSound (View view) {
        Toast.makeText(this, "STOP!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
