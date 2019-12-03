package com.example.messenger.di.application;

import com.example.messenger.session.SessionManager;
import com.google.firebase.auth.FirebaseAuth;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Singleton
    @Provides
    FirebaseAuth provideFirebaseAuth()
    {
        return FirebaseAuth.getInstance();
    }
    @Singleton
    @Provides
    SessionManager provideSessionManager()
    {
        return new SessionManager();
    }
}
