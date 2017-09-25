package love.org.daggerdemo.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import love.org.daggerdemo.ui.MainActivity;
import love.org.daggerdemo.ui.MainActivityModule;

@Module
public abstract class ActivityBuilder {

    // TODO #3.2 - Map the Activity to the Builder
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

}