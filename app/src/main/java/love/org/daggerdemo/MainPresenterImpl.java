package love.org.daggerdemo;


/**
 * Created by Pao on 23/9/17.
 */

public class MainPresenterImpl implements MainPresenter {


    private final MainView mView;

    public MainPresenterImpl(MainView mainView) {
        mView = mainView;
    }

    @Override
    public void showHelloWorld() {
        mView.showToast("Hello World!");
    }
}
