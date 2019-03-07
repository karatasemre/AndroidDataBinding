package databinding.com.databindingtutorial;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import databinding.com.databindingtutorial.databinding.ActivityMainBinding;
import databinding.com.databindingtutorial.model.TutorialData;

import static databinding.com.databindingtutorial.helper.DummyDataHelper.getRandomTutorialData;

public class MainActivity extends AppCompatActivity {

    private TutorialData data;
    ActivityMainBinding bindings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindings = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bindings.setActivity(this);
        data = getRandomTutorialData();
        bindings.setTutorial(data);
    }

    public void changeTutorial(View view) {
        bindings.setTutorial(getRandomTutorialData());

        //or

        //data.setTutorialTitle("End Lesson").setTutorialDescription("Finally").setAuthorName("Emre Karataş").setNumberOfReadings(500);

    }
}
