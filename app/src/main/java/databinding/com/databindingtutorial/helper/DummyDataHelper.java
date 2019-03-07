package databinding.com.databindingtutorial.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import databinding.com.databindingtutorial.model.TutorialData;

public class DummyDataHelper {
    public static TutorialData getRandomTutorialData() {
        List<TutorialData> tutorialDataList = getTutorialList();
        int randPos = new Random().nextInt(tutorialDataList.size() - 1);

        return tutorialDataList.get(randPos);

    }

    public static List<TutorialData> getTutorialList() {
        List<TutorialData> tutorialDataList = new ArrayList<>();
        tutorialDataList.add(new TutorialData().setTutorialTitle("Android Lesson 1").setTutorialDescription("First Lesson").setAuthorName("Emre Karataş").setNumberOfReadings(new Random().nextInt(250)));
        tutorialDataList.add(new TutorialData().setTutorialTitle("Android Lesson 2").setTutorialDescription("Second Lesson").setAuthorName("Kemal Kılıç").setNumberOfReadings(new Random().nextInt(250)));
        tutorialDataList.add(new TutorialData().setTutorialTitle("Android Recycleview").setTutorialDescription("Recycleview").setAuthorName("Sabri Ulu").setNumberOfReadings(new Random().nextInt(250)));
        tutorialDataList.add(new TutorialData().setTutorialTitle("Databinding Lesson 1").setTutorialDescription("Databinding").setAuthorName("Emre Karataş").setNumberOfReadings(new Random().nextInt(250)));
        tutorialDataList.add(new TutorialData().setTutorialTitle("Advanced Examples 1").setTutorialDescription("Sample Apps").setAuthorName("Kemal Kılıç").setNumberOfReadings(new Random().nextInt(250)));
        tutorialDataList.add(new TutorialData().setTutorialTitle("Advanced Examples 2").setTutorialDescription("Sample Apps 2").setAuthorName("Emre Karataş").setNumberOfReadings(new Random().nextInt(250)));
        tutorialDataList.add(new TutorialData().setTutorialTitle("Garbage Collections").setTutorialDescription("Collection").setAuthorName("Kemal Kılıç").setNumberOfReadings(new Random().nextInt(250)));
        tutorialDataList.add(new TutorialData().setTutorialTitle("Array Lesson").setTutorialDescription("Arrays").setAuthorName("Sabri Ulu").setNumberOfReadings(new Random().nextInt(250)));
        tutorialDataList.add(new TutorialData().setTutorialTitle("List & Grid").setTutorialDescription("List & Grid").setAuthorName("Emre Karataş").setNumberOfReadings(new Random().nextInt(250)));
        tutorialDataList.add(new TutorialData().setTutorialTitle("Butterknife").setTutorialDescription("View injections").setAuthorName("Emre Karataş").setNumberOfReadings(new Random().nextInt(250)));
        tutorialDataList.add(new TutorialData().setTutorialTitle("Mvp Lesson").setTutorialDescription("Mvp Tutorial").setAuthorName("Sabri Ulu").setNumberOfReadings(new Random().nextInt(250)));
        tutorialDataList.add(new TutorialData().setTutorialTitle("Mvvvm Lesson").setTutorialDescription("Mvvm Tutorial").setAuthorName("Sabri Ulu").setNumberOfReadings(new Random().nextInt(250)));

        return tutorialDataList;
    }
}
