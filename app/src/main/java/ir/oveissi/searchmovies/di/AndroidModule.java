package ir.oveissi.searchmovies.di;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ir.oveissi.searchmovies.SearchMovieApplication;

/**
 * Created by Abbas on 22/05/16.
 */
@Module
public class AndroidModule {
    private final Context context;
    
    public AndroidModule(Context context){
    this.context = context;
    }
    
    public 
    @Provides
    @Singleton
    public static Context provideContext(SearchMovieApplication application) {
        return context;
    }

    @Provides
    @Singleton
    public static Resources provideResources(SearchMovieApplication application) {
        return application.getResources();
    }

    @Provides
    @Singleton
    public static SharedPreferences provideSharedPreferences(SearchMovieApplication application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

}
