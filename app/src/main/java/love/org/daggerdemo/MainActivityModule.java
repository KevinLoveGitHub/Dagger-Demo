package love.org.daggerdemo;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    // TODO #2.2 - Provides dependency to MainView.
    @Provides
    MainView provideMainView(MainActivity mainActivity) {
        return mainActivity;
    }

    // TODO #2.2 - Provides dependency to MainPresenter
    // params:
    //      MainView - dependency will come from #2.2 - MainActivityModule#provideMainView(MainActivity):MainView
    //      ApiService - dependency will from from #1.2 AppModule#provideApiService():ApiService

    @Provides
    MainPresenter provideMainPresenter(MainView mainView) {
        return new MainPresenterImpl(mainView);
    }

}