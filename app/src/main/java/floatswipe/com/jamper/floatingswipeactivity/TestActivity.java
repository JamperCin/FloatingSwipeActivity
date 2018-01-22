package floatswipe.com.jamper.floatingswipeactivity;

import android.os.Bundle;

import floatswipe.com.jamper.floatingswipedactivity.UI.FloatingActivity;

public class TestActivity extends FloatingActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_layout);
    }
}
