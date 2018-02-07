package is.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.iscom.sharedprefs.R;

public class Currency_Converter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency__converter);
    }

    public void convertCurrency(View view) {
        EditText number = (EditText) findViewById(R.id.editText_CC);
        TextView convertedNumber = (TextView) findViewById(R.id.textView_CC);
        Double convNumber = Double.parseDouble(number.getText().toString()) * 11.5;
        convertedNumber.setText(convNumber.toString());
        Toast.makeText(this, "" + convNumber, Toast.LENGTH_SHORT).show();


    }

}
