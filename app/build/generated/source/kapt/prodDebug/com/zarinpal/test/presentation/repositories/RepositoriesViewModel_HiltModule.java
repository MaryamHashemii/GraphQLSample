package com.zarinpal.test.presentation.repositories;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = RepositoriesViewModel.class
)
public interface RepositoriesViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.zarinpal.test.presentation.repositories.RepositoriesViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(RepositoriesViewModel_AssistedFactory factory);
}
