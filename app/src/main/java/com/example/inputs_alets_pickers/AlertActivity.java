package com.example.inputs_alets_pickers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.inputs_alets_pickers.databinding.ActivityAlertBinding;

public class AlertActivity extends AppCompatActivity {
    private ActivityAlertBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAlertBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crearAlert();
            }
        });
    }
    public void crearAlert(){
        AlertDialog.Builder creadorAlert = new AlertDialog.Builder(AlertActivity.this);
        creadorAlert.setTitle("Alerta");
        creadorAlert.setMessage("Elige si o no");
        creadorAlert.setPositiveButton("si",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "presionaste si", Toast.LENGTH_SHORT).show();
            }
        });

        creadorAlert.setNegativeButton("no",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "presionaste no", Toast.LENGTH_SHORT).show();
            }
        });
        creadorAlert.show();
    }

}