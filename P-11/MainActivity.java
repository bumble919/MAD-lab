package com.example.grid;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int[] image = {
            R.drawable.mahi,
            R.drawable.virat,
            R.drawable.rohit,
            R.drawable.sachin
    };

    String[] names = {
            "Mahi",
            "Virat",
            "Rohit",
            "Sachin"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        // Create adapter
        ImageAdapter adapter = new ImageAdapter(this, image);

        // Set adapter to GridView
        gridView.setAdapter(adapter);

        // Handle image click
        gridView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(
                            AdapterView<?> parent,
                            View view,
                            int position,
                            long id) {

                        showAlertDialog(position);
                    }
                }
        );
    }

    private void showAlertDialog(int position) {

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this);

        builder.setTitle("Selected Image");

        builder.setMessage(names[position]);

        builder.setPositiveButton("OK", null);

        builder.show();
    }
}