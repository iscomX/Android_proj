package is.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.iscom.sharedprefs.R;

import java.util.Random;

public class RandomGame extends AppCompatActivity {

    Integer randInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_game);
        randInt = new Random().nextInt(100) + 1;
    }

    public void generate(View view) {
        Log.i("info", "" + randInt);
        EditText editText = (EditText) findViewById(R.id.editText_RG);
        TextView textView = (TextView) findViewById(R.id.textView_RG);
        Integer numEdit = Integer.parseInt(editText.getText().toString());

        if (randInt == numEdit) {
            randInt = new Random().nextInt(100) + 1;
            toastMessage("Good");
            textView.setText("Good");
        } else if (randInt > numEdit) {
            toastMessage("Great than");
            textView.setText("Great than");
        } else {
            toastMessage("Less than");
            textView.setText("Less than");
        }


    }

    public void toastMessage(String string) {
        Toast.makeText(this, "" + string, Toast.LENGTH_LONG).show();
    }

}
