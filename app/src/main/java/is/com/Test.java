package is.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.iscom.sharedprefs.R;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }


    // tbadar taswat wi gha klik 7o boton

    public void image() {
        Integer random = (int) (Math.random() * 10);
        Integer str = 0;
        ImageView img = (ImageView) findViewById(R.id.id_imageView_1);
        switch (random) {
            case 1:
                str = R.drawable.img_a;
                break;
            case 2:
                str = R.drawable.img_b;
                break;
            case 3:
                str = R.drawable.img_c;
                break;
            case 4:
                str = R.drawable.img_d;
                break;
            case 5:
                str = R.drawable.img_e;
                break;
            case 6:
                str = R.drawable.img_f;
                break;
            case 7:
                str = R.drawable.img_g;
                break;
            case 8:
                str = R.drawable.img_h;
                break;
            case 9:
                str = R.drawable.img_i;
                break;
        }

        img.setImageResource(str);
        Log.i("info", "random : " + random);


    }


    public void clickAction(View view) {
        EditText Name = (EditText) findViewById(R.id.id_EditText_Name);
        EditText Password = (EditText) findViewById(R.id.id_EditText_Password);

        Log.i("info", "random : ");

        //Toast
        Toast.makeText(this, "name : " + Name.getText().toString() +
                " -- password : " + Password.getText().toString(), Toast.LENGTH_LONG).show();

        image();
    }

}
