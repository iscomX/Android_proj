package is.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.iscom.sharedprefs.R;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);

        toggle.syncState();
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navigation_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.menu_1) {
            Intent myIntent = new Intent(this, Currency_Converter.class);
            startActivity(myIntent);

        } else if (id == R.id.menu_2) {
            Intent myIntent = new Intent(this, RandomGame.class);
            startActivity(myIntent);

        } else if (id == R.id.menu_3) {
            Intent myIntent = new Intent(this, ConnectGame.class);
            startActivity(myIntent);
        } else if (id == R.id.menu_4) {
            Toast.makeText(getApplicationContext(), "item1 is selected", Toast.LENGTH_SHORT).show();
        }



        return super.onOptionsItemSelected(item);
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
        Toast.makeText(MainActivity.this, "name : " + Name.getText().toString() +
                " -- password : " + Password.getText().toString(), Toast.LENGTH_LONG).show();

        image();
    }

}
