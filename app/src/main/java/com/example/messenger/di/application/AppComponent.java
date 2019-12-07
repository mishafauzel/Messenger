package com.example.messenger.di.application;

import android.app.Application;

import com.example.messenger.MainApplication;
import com.example.messenger.di.activity.ActivityModules;
import com.example.messenger.di.viewmodel.ViewModelsFactoryProvider;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
@Singleton
@Component(modules = {AndroidSupportInjectionModule.class,AppModule.class, ActivityModules.class, ViewModelsFactoryProvider.class})
public interface AppComponent extends AndroidInjector<MainApplication> {

    @Component.Builder
     interface Builder
    {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
}
