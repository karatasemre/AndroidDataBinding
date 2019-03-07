package databinding.com.databindingtutorial.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

public class TutorialData extends BaseObservable {
    private String tutorialTitle;
    private String tutorialDescription;
    private String authorName;
    private int numberOfReadings;

    @Bindable
    public String getTutorialTitle() {
        return tutorialTitle;
    }

    public TutorialData setTutorialTitle(String tutorialTitle) {
        this.tutorialTitle = tutorialTitle;
        notifyPropertyChanged(BR.tutorialTitle);
        return this;
    }

    @Bindable
    public String getTutorialDescription() {
        return tutorialDescription;
    }

    public TutorialData setTutorialDescription(String tutorialDescription) {
        this.tutorialDescription = tutorialDescription;
        notifyPropertyChanged(BR.tutorialDescription);
        return this;
    }

    @Bindable
    public String getAuthorName() {
        return authorName;
    }

    public TutorialData setAuthorName(String authorName) {
        this.authorName = authorName;
        notifyPropertyChanged(BR.authorName);
        return this;
    }

    @Bindable
    public int getNumberOfReadings() {
        return numberOfReadings;
    }

    public TutorialData setNumberOfReadings(int numberOfReadings) {
        this.numberOfReadings = numberOfReadings;
        notifyPropertyChanged(BR.numberOfReadings);
        return this;
    }
}