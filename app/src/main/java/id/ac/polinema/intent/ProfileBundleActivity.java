package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String username = extras.getString(BundleActivity.USERNAME_KEY);
            String name = extras.getString(BundleActivity.NAME_KEY);
            int age = extras.getInt(BundleActivity.AGE_KEY);
            usernameText.setText(username);
            nameText.setText(name);
            ageText.setText(String.valueOf(age));
            // TODO: display value here
        }
    }
}
