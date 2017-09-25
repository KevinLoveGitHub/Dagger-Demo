package love.org.daggerdemo.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Kevin
 * @data 2017/9/25
 */
@Module
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Cache
    String provideOkHttpWithoutCache() {
        return "without cache okHttp";
    }

    @Provides
    @Cache(value = true)
    String provideOkHttpWithCache() {
        return "with cache okHttp";
    }
}
