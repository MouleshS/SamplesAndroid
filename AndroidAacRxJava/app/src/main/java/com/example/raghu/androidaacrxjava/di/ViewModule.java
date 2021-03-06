package com.example.raghu.androidaacrxjava.di;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;


import com.example.raghu.androidaacrxjava.ApiViewModel;
import com.example.raghu.androidaacrxjava.viewmodel.DemoViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by raghu on 26/9/17.
 */

@Module
abstract class ViewModule {

    @Binds
    @IntoMap
    @ViewModelKey(ApiViewModel.class)
    abstract ViewModel bindApiViewModel(ApiViewModel repoViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(DemoViewModelFactory factory);
}
