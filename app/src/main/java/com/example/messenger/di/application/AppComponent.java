package com.example.messenger.di.application;

import android.app.Application;

import com.example.messenger.MainApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
@Singleton
@Component(modules = {AndroidSupportInjectionModule.class,AppModule.class})
public interface AppComponent extends AndroidInjector<MainApplication> {

    @Component.Builder
     interface Builder
    {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
}
