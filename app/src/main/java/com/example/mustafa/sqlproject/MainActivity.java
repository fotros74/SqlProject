package com.example.mustafa.sqlproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtFamily, edtID;
    Button btInsert, btView, btUpdate, btDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.editName);
        edtFamily = findViewById(R.id.editFamily);
        edtID = findViewById(R.id.editId);
        btInsert = findViewById(R.id.btnInsert);
        btView = findViewById(R.id.btnView);
        btUpdate = findViewById(R.id.btnUpdate);
        btDelete = findViewById(R.id.btnDelete);

    }
}
