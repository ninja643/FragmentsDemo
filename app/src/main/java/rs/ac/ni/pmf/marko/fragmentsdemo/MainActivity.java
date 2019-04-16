package rs.ac.ni.pmf.marko.fragmentsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements StudentListFragment.OnStudentSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View singleFragmentContainer = findViewById(R.id.single_fragment_container);
        if (singleFragmentContainer != null) {
            // Portrait mode
            if (savedInstanceState != null) {
                // Fragment already created
                return;
            }

            StudentListFragment listFragment = new StudentListFragment();

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.single_fragment_container, listFragment)
                    .commit();
        }
    }

    @Override
    public void onStudentSelected(int position) {
        Log.i("STUDENT", "Selected position " + position);

        View singleFragmentContainer = findViewById(R.id.single_fragment_container);
        if (singleFragmentContainer != null) {
            // We need to create and show details fragment
            DetailsFragment detailsFragment = DetailsFragment.newInstance(position);
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.single_fragment_container, detailsFragment)
                .addToBackStack(null)
                .commit();

        } else {
            // Details fragment already present, just show the details
        }
    }
}
