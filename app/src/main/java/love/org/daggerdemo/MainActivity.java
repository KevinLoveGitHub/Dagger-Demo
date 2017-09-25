package love.org.daggerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends Activity implements MainView {

    @Inject
    MainPresenter mPresenter;

    @Inject
    @Cache(value = true)
    String okHttp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);
        setContentView(R.layout.activity_main);
        mPresenter.showHelloWorld();
    }

    @Override
    public void showToast(String s) {
        Log.e(okHttp, s);
    }
}
