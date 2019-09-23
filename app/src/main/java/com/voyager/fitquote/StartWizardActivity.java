package com.voyager.fitquote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.stepstone.stepper.StepperLayout;
import com.voyager.fitquote.steps.StepAdapter;

public class StartWizardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_wizard);

        StepperLayout mStepperLayout = (StepperLayout) findViewById(R.id.stepperLayout);
        mStepperLayout.setAdapter(new StepAdapter(getSupportFragmentManager(), this));
    }
}
