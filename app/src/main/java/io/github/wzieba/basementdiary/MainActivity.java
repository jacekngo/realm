package io.github.wzieba.basementdiary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Realm.init(this);

        Book book = new Book(0, "Rok 1984", "George Orwell", "997");
        Realm realm = Realm.getDefaultInstance();

        
    }
}
