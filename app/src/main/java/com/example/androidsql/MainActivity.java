package com.example.androidsql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv =findViewById(R.id.tv);
        // Save to DB
        Dbhelper dbhelper=new Dbhelper(this);
       // SQLiteDatabase db = dbhelper.getWritableDatabase();

//        ContentValues values = new ContentValues();
//        values.put("id","2");
//        values.put("name","Ayomide");
//        values.put("mark","65");
//
//        long row= db.insert("student",null,values);
//        System.out.println("Roll number is "+row);

            // Retrieve Values from DB
        SQLiteDatabase db = dbhelper.getReadableDatabase();

        String projection [] ={"id","name","mark"};
        Cursor c = db.query("student",projection,
                null,null,null,
                null,null);
        c.moveToPosition(0);
        tv.setText(c.getString(1));

    }
}