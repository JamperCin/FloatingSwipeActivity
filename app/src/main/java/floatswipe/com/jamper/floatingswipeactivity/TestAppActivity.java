package floatswipe.com.jamper.floatingswipeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TestAppActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_app);
        button = findViewById(R.id.click);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(TestAppActivity.this,TestActivity.class));
    }
}
