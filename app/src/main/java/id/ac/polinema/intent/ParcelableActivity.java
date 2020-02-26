package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.intent.model.User;

public class ParcelableActivity extends AppCompatActivity {
    public static final String USER_KEY = "User";
    private EditText username;
    private EditText name;
    private EditText age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);
        username = findViewById(R.id.input_username);
        name = findViewById(R.id.input_name);
        age = findViewById(R.id.input_age);
    }

    public void handleParcelable(View view) {
        String username1 = username.getText().toString();
        String name1 = name.getText().toString();
        int age1 = Integer.parseInt(age.getText().toString());

        User user = new User(username1, name1, age1);

        Intent intent = new Intent (this, ProfileParcelableActivity.class);
        intent.putExtra(USER_KEY, user);
        startActivity(intent);
    }
}