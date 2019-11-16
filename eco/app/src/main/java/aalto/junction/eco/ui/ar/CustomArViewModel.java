package aalto.junction.eco.ui.ar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CustomArViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CustomArViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is ar fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}