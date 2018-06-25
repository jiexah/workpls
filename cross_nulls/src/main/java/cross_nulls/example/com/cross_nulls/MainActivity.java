package cross_nulls.example.com.cross_nulls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Play;
    EditText First;
    EditText Second;
    EditText Best_of;
    int i;
    String[] data = {"Cross", "Nollik"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        First = findViewById(R.id.First);
        Second = findViewById(R.id.Second);
        Best_of = findViewById(R.id.Best_of);
        Play = findViewById(R.id.Play);
        Play.setOnClickListener(this);
        // адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        // заголовок
        spinner.setPrompt("Cross or Nollik");
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                i= position;
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                i=0;
            }
        });
    }
    @Override
    public void onClick(View v) {
        if (Best_of.getText().toString().matches("")){
            Toast.makeText(this, "Введите сколько будет игр.", Toast.LENGTH_LONG).show();
        }
        else {
            switch (v.getId()) {
                case R.id.Play:
                    Intent intent = new Intent(this, ActivityTwo.class);
                    intent.putExtra("First", First.getText().toString());
                    intent.putExtra("Second", Second.getText().toString());
                    intent.putExtra("Best_of", Best_of.getText().toString());
                    intent.putExtra("First_turn", i);
                    startActivity(intent);
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
