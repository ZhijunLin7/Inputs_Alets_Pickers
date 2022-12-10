package com.example.inputs_alets_pickers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;

import com.example.inputs_alets_pickers.databinding.ActivityPickerBinding;

public class PickerActivity extends AppCompatActivity {
    private ActivityPickerBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttondata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment datePicker = new DatePicker();
                datePicker.show(getSupportFragmentManager(), "Date picker");
            }
        });
        binding.buttonhora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment timePicker = new TimePicker();
                timePicker.show(getSupportFragmentManager(), "Time picker");
            }
        });
    }
}