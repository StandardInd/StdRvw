package stdind.standardreview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class Categorie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        GridView listacategorie = (GridView) findViewById(R.id._categorylist);
        String[] categorie = new String[]{"A", "B", "C"};
        ArrayList<String> Lista = new ArrayList<String>();
        setSupportActionBar(toolbar);
        for(int i = 0; i < categorie.length; i++){
            Lista.add(categorie[i]);
        }

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Lista);
        listacategorie.setAdapter(adapter);

    }


}
