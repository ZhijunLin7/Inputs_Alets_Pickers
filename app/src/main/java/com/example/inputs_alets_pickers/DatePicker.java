package com.example.inputs_alets_pickers;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class DatePicker extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

            Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);


            return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    public void onDateSet(android.widget.DatePicker view, int year, int month, int day) {
        Toast.makeText(getContext(), day+"/"+month+"/"+year, Toast.LENGTH_SHORT).show();
    }
}
