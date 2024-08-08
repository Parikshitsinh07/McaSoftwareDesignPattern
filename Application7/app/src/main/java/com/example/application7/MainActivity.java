package com.example.application7;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText,floatEditText,longEditText,intEditText,booleanEditText;
    Button clearbutton,putbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText);
        floatEditText=findViewById(R.id.floatEditText);
        intEditText=findViewById(R.id.intEditText);
        longEditText=findViewById(R.id.longEditText);
        booleanEditText=findViewById(R.id.booleanEditText);


       clearbutton=findViewById(R.id.buttonClear);
       clearbutton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               editText.setText("");
               textView.setText("");
               floatEditText.setText("");
               intEditText.setText("");
               longEditText.setText("");
               booleanEditText.setText("");

           }
       });
    }
    public void buttonPut(View view){
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.clear();
        editor.putBoolean("booleanValue", parseBoolean(booleanEditText.getText().toString()));
        editor.putFloat("floatValue", parseFloat(floatEditText.getText().toString()));
        editor.putInt("intValue", parseInt(intEditText.getText().toString()));
        editor.putLong("longValue", parseLong(longEditText.getText().toString()));
        editor.putString("name", editText.getText().toString());
        Toast.makeText(this, "Value Puted", Toast.LENGTH_SHORT).show();
        editor.apply();
    }
    public void buttonGet(View view){
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        String name = sharedPreferences.getString("name", null);
        boolean booleanValue=sharedPreferences.getBoolean("booleanValue",false);
        float floatValue=sharedPreferences.getFloat("floatValue",0f);
        int intValue=sharedPreferences.getInt("intValue",0);
        long longValue=sharedPreferences.getLong("longValue",0L);

        if (name == null || name.equals("")) {
            textView.setText("Shared Preference data does not exist");
            booleanEditText.setText("");
            floatEditText.setText("");
            intEditText.setText("");
            longEditText.setText("");
            editText.setText("");
        }
        else
        {
            String displayText="String:"+name+"\n"+"Float:"+floatValue+"\n"+"Int:"+intValue+"\n"+"Long:"+longValue+"\n"+"Boolean:"+booleanValue;
            textView.setText(displayText);

            booleanEditText.setText(String.valueOf(booleanValue));
            floatEditText.setText(String.valueOf(floatValue));
            intEditText.setText(String.valueOf(intValue));
            longEditText.setText(String.valueOf(longValue));
            editText.setText(name != null ? name : "");
        }




    }
    public void buttonDeleteAll(View view){
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        //removes all the shared preference variables
        sharedPreferences.edit().clear().commit();
        Toast.makeText(this, "Data is Clear", Toast.LENGTH_SHORT).show();
    }
    public void buttonDelete(View view){
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        // removes specific shared preference variable
        sharedPreferences.edit().remove("name").commit();
    }

}