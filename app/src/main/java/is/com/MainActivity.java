package is.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.iscom.sharedprefs.R;

import junit.framework.Test;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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

        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);

        toggle.syncState();
    }


    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {

            drawerLayout.closeDrawer(GravityCompat.START);
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
        if (id == R.id.menu_01) {
            Intent myIntent = new Intent(this, Currency_Converter.class);
            startActivity(myIntent);
        } else if (id == R.id.menu_02) {
            Intent myIntent = new Intent(this, RandomGame.class);
            startActivity(myIntent);
        } else if (id == R.id.menu_03) {
            Intent myIntent = new Intent(this, ConnectGame.class);
            startActivity(myIntent);
        } else if (id == R.id.menu_04) {
            Intent myIntent = new Intent(this, Media.class);
            startActivity(myIntent);
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.menu_01:
                Intent myIntent = new Intent(this, Test.class);
                startActivity(myIntent);
                break;
            case R.id.menu_02:
                myIntent = new Intent(this, Currency_Converter.class);
                startActivity(myIntent);
                break;
            case R.id.menu_03:
                myIntent = new Intent(this, RandomGame.class);
                startActivity(myIntent);
                break;
            case R.id.menu_04:
                myIntent = new Intent(this, ConnectGame.class);
                startActivity(myIntent);
                break;
            case R.id.menu_051:
                myIntent = new Intent(this, Media.class);
                startActivity(myIntent);
                break;
            case R.id.menu_052:
                myIntent = new Intent(this, Media.class);
                startActivity(myIntent);
                break;
            case R.id.menu_053:
                myIntent = new Intent(this, Media.class);
                startActivity(myIntent);
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);

        return true;

    }



}
