package com.example.user.educateyourselfquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int scoreQ1, scoreQ2, scoreQ3, scoreQ4, scoreQ5, scoreQ6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit answer button is clicked.
     */
    public void getScore(View view) {

        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        RadioButton thoughtsButton = (RadioButton) findViewById(R.id.thoughts_button);
        boolean thoughtsButtonChecked = thoughtsButton.isChecked();

        RadioButton organicButton = (RadioButton) findViewById(R.id.organic_button);
        boolean organicButtonChecked = organicButton.isChecked();

        RadioButton vaccineButton = (RadioButton) findViewById(R.id.vaccine_button);
        boolean vaccineButtonChecked = vaccineButton.isChecked();

        RadioButton steveDeathButton = (RadioButton) findViewById(R.id.steve_death_button);
        boolean steveDeathButtonChecked = steveDeathButton.isChecked();

        RadioButton noButton = (RadioButton) findViewById(R.id.no_button);
        boolean noButtonChecked = noButton.isChecked();

        RadioButton hepcButton = (RadioButton) findViewById(R.id.hepc_button);
        boolean hepcButtonChecked = hepcButton.isChecked();

        RadioButton hepabButton = (RadioButton) findViewById(R.id.hepab_button);
        boolean hepabButtonChecked = hepabButton.isChecked();

        RadioButton anemiaButton = (RadioButton) findViewById(R.id.anemia_button);
        boolean anemiaButtonChecked = anemiaButton.isChecked();

        RadioButton meteorButton = (RadioButton) findViewById(R.id.meteor_button);
        boolean meteorButtonChecked = meteorButton.isChecked();

        RadioButton paltrowButton = (RadioButton) findViewById(R.id.paltrow_button);
        boolean paltrowButtonChecked = paltrowButton.isChecked();

        RadioButton kissingButton = (RadioButton) findViewById(R.id.kissing_button);
        boolean kissingButtonChecked = kissingButton.isChecked();

        RadioButton sexButton = (RadioButton) findViewById(R.id.sex_button);
        boolean sexButtonChecked = sexButton.isChecked();

        RadioButton foodButton = (RadioButton) findViewById(R.id.food_button);
        boolean foodButtonChecked = foodButton.isChecked();

        RadioButton crisprButton = (RadioButton) findViewById(R.id.crispr_button);
        boolean crisprButtonChecked = crisprButton.isChecked();

        RadioButton deadlyButton = (RadioButton) findViewById(R.id.deadly_button);
        boolean deadlyButtonChecked = deadlyButton.isChecked();

        RadioButton starButton = (RadioButton) findViewById(R.id.star_button);
        boolean starButtonChecked = starButton.isChecked();

        if (thoughtsButtonChecked && organicButtonChecked) {
            scoreQ1 = 0;
        }

        if (vaccineButtonChecked) {
            scoreQ1 = 1;
        }

        if (steveDeathButtonChecked) {
            scoreQ2 = 0;
        }

        if (noButtonChecked) {
            scoreQ2 = 1;
        }

        if (hepcButtonChecked && anemiaButtonChecked) {
            scoreQ3 = 0;
        }

        if (hepabButtonChecked) {
            scoreQ3 = 1;
        }

        if (meteorButtonChecked) {
            scoreQ4 = 0;
        }

        if (paltrowButtonChecked) {
            scoreQ4 = 1;
        }

        if (kissingButtonChecked && foodButtonChecked) {
            scoreQ5 = 0;
        }

        if (sexButtonChecked) {
            scoreQ5 = 1;
        }

        if (deadlyButtonChecked && starButtonChecked) {
            scoreQ6 = 0;
        }

        if (crisprButtonChecked) {
            scoreQ6 = 1;
        }

        score = scoreQ1 + scoreQ2 + scoreQ3 + scoreQ4 + scoreQ5 + scoreQ6;

        if (score == 6)

        {
            Toast.makeText(this, name + getString(R.string.your_score_is)
                    + " " + score + getString(R.string.excellent), Toast.LENGTH_LONG).show();
        }

        if (score == 5)

        {
            Toast.makeText(this, name + getString(R.string.your_score_is)
                    + " " + score + getString(R.string.very_good), Toast.LENGTH_LONG).show();
        }

        if (score == 4)

        {
            Toast.makeText(this, name + getString(R.string.your_score_is)
                    + " " + score + getString(R.string.good), Toast.LENGTH_LONG).show();
        }

        if (score == 3)

        {
            Toast.makeText(this, name + getString(R.string.your_score_is)
                    + " " + score + getString(R.string.not_bad), Toast.LENGTH_LONG).show();
        }

        if (score == 2)

        {
            Toast.makeText(this, name + getString(R.string.your_score_is)
                    + " " + score + getString(R.string.should_be_better), Toast.LENGTH_LONG).show();
        }

        if (score == 1)

        {
            Toast.makeText(this, name + getString(R.string.your_score_is)
                    + " " + score + getString(R.string.educate_yourself), Toast.LENGTH_LONG).show();
        }

        if (score == 0)

        {
            Toast.makeText(this, name + getString(R.string.your_score_is)
                    + " " + score + getString(R.string.rethink), Toast.LENGTH_LONG).show();
        }
    }

    /**
     * This method is called when the reset button is clicked.
     */
    public void resetScore(View view)
    {
        score = 0;
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}