package love.org.daggerdemo.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import love.org.daggerdemo.ui.MainActivity;
import love.org.daggerdemo.ui.MainActivityModule;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();
}