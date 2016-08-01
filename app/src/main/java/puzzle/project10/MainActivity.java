package puzzle.project10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View v) {
        if (v.getId() == R.id.button2) {
            Intent i = new Intent(MainActivity.this, sginup.class);
            startActivity(i);
        }
    }

    public void onclick2(View v) {
        if (v.getId() == R.id.button) {
            Intent i2 = new Intent(MainActivity.this, login.class);
            startActivity(i2);
        }
    }
}