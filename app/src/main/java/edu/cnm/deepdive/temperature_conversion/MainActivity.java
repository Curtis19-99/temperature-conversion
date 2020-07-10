package edu.cnm.deepdive.temperature_conversion;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import edu.cnm.deepdive.temperature_conversion.convserion.Conversion;


public class MainActivity extends AppCompatActivity {

  EditText temp;
  RadioButton toC;
  RadioButton toF;
  RadioButton toC2K;
  RadioButton toK2C;
  RadioButton toF2K;
  RadioButton toK2F;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    temp = (EditText)findViewById(R.id.temperatureEditText);
    toC = (RadioButton)findViewById(R.id.toCelsiusRadioButton);
    toF = (RadioButton)findViewById(R.id.toFahrenheitRadioButton);
   toC2K = (RadioButton)findViewById(R.id.toKelvinFromCelsiusRadioButton);
   toK2C = (RadioButton)findViewById(R.id.toCelsiusFromKelvinRadioButton);
   toF2K = (RadioButton)findViewById(R.id.toKelvinFromFahrenheitRadioButton);
    toK2F = (RadioButton)findViewById(R.id.toFahrenheitFromKelvinRadioButton);
  }


  public void convert(View v) {
    double value = new Double(temp.getText().toString());
    if (toC.isChecked()) {
      value = Math.round(Conversion.convertF2C(value));
      temp.setText(Double.toString(value));
    } else if (toF.isChecked()) {
      value = Math.round(Conversion.convertC2F(value));
      temp.setText(Double.toString(value));
    } else if (toC2K.isChecked()) {
      value = Math.round(Conversion.convertC2K(value));
      temp.setText(Double.toString(value));
    } else if (toK2C.isChecked()) {
      value = Math.round(Conversion.convertK2C(value));
      temp.setText(Double.toString(value));
    } else if (toF2K.isChecked()) {
      value = Math.round(Conversion.convertC2F(value));
      temp.setText(Double.toString(value));
    } else {
      value = Math.round(Conversion.convertK2F(value));
      temp.setText(Double.toString(value));
    }
  }
}
