package sg.edu.rp.c346.id18015906.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button dbs;
    Button ocbc;
    Button uob;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbs = findViewById(R.id.buttonDBS);
        ocbc = findViewById(R.id.buttonOCBC);
        uob = findViewById(R.id.buttonUOB);

        registerForContextMenu(dbs);
        registerForContextMenu(ocbc);
        registerForContextMenu(uob);

        dbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


    }


    //Menu Options
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_main,menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.Website) {
            Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("https://www.dbs.com.sg"));
            startActivity(intent);

            return true;
        } else if (id == R.id.Contact) {
            //..
            return true;
        }

        return super.onOptionsItemSelected(item);
    }





    //Language Change
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.language, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            dbs.setText(R.string.dbs);
            ocbc.setText(R.string.ocbc);
            uob.setText(R.string.uob);
            return true;
        } else if (id == R.id.ChineseSelection) {
            dbs.setText(R.string.cdbs);
            ocbc.setText(R.string.cocbc);
            uob.setText(R.string.cuob);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }






}
