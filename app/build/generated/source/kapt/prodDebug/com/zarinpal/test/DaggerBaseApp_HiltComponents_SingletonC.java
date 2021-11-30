package com.zarinpal.test;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.zarinpal.test.data.GraphQlApolloClient;
import com.zarinpal.test.data.datasource.local.AppDao;
import com.zarinpal.test.data.datasource.local.AppDb;
import com.zarinpal.test.data.datasource.remote.RemoteDataSourceImpl;
import com.zarinpal.test.data.datasource.sharedPref.UserSharedPref;
import com.zarinpal.test.di.NetworkModule;
import com.zarinpal.test.di.NetworkModule_ApolloClientFactory;
import com.zarinpal.test.di.RepositoryModule;
import com.zarinpal.test.di.RepositoryModule_ProvideAppRepositoryFactory;
import com.zarinpal.test.di.RepositoryModule_ProvideRemoteDataSourceImplFactory;
import com.zarinpal.test.di.RoomModule;
import com.zarinpal.test.di.RoomModule_ProvideAppDAOFactory;
import com.zarinpal.test.di.RoomModule_ProvideAppDatabaseFactory;
import com.zarinpal.test.di.coroutine.CoroutinesModule;
import com.zarinpal.test.di.coroutine.CoroutinesModule_ProvidesIoDispatcherFactory;
import com.zarinpal.test.domain.repository.AppRepository;
import com.zarinpal.test.domain.usecases.GetRepositoriesUseCase;
import com.zarinpal.test.domain.usecases.LoginUseCase;
import com.zarinpal.test.presentation.main.MainActivity;
import com.zarinpal.test.presentation.main.MainFragment;
import com.zarinpal.test.presentation.repositories.RepositoriesViewModel_AssistedFactory;
import com.zarinpal.test.presentation.repositories.RepositoriesViewModel_AssistedFactory_Factory;
import com.zarinpal.test.presentation.repositories.RepositoryFragment;
import com.zarinpal.test.presentation.splash.SplashFragment;
import com.zarinpal.test.presentation.user.UserFragment;
import com.zarinpal.test.presentation.user.UserViewModel_AssistedFactory;
import com.zarinpal.test.presentation.user.UserViewModel_AssistedFactory_Factory;
import com.zarinpal.test.utils.NetworkConnectivity;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerBaseApp_HiltComponents_SingletonC extends BaseApp_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object appDb = new MemoizedSentinel();

  private volatile Object remoteDataSourceImpl = new MemoizedSentinel();

  private volatile Object appRepository = new MemoizedSentinel();

  private DaggerBaseApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private AppDb getAppDb() {
    Object local = appDb;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = appDb;
        if (local instanceof MemoizedSentinel) {
          local = RoomModule_ProvideAppDatabaseFactory.provideAppDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          appDb = DoubleCheck.reentrantCheck(appDb, local);
        }
      }
    }
    return (AppDb) local;
  }

  private AppDao getAppDao() {
    return RoomModule_ProvideAppDAOFactory.provideAppDAO(getAppDb());
  }

  private NetworkConnectivity getNetworkConnectivity() {
    return new NetworkConnectivity(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private GraphQlApolloClient getGraphQlApolloClient() {
    return new GraphQlApolloClient(NetworkModule_ApolloClientFactory.apolloClient());
  }

  private RemoteDataSourceImpl getRemoteDataSourceImpl() {
    Object local = remoteDataSourceImpl;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = remoteDataSourceImpl;
        if (local instanceof MemoizedSentinel) {
          local = RepositoryModule_ProvideRemoteDataSourceImplFactory.provideRemoteDataSourceImpl(getGraphQlApolloClient());
          remoteDataSourceImpl = DoubleCheck.reentrantCheck(remoteDataSourceImpl, local);
        }
      }
    }
    return (RemoteDataSourceImpl) local;
  }

  private AppRepository getAppRepository() {
    Object local = appRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = appRepository;
        if (local instanceof MemoizedSentinel) {
          local = RepositoryModule_ProvideAppRepositoryFactory.provideAppRepository(getAppDao(), getNetworkConnectivity(), getRemoteDataSourceImpl());
          appRepository = DoubleCheck.reentrantCheck(appRepository, local);
        }
      }
    }
    return (AppRepository) local;
  }

  @Override
  public void injectBaseApp(BaseApp baseApp) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder coroutinesModule(CoroutinesModule coroutinesModule) {
      Preconditions.checkNotNull(coroutinesModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder repositoryModule(RepositoryModule repositoryModule) {
      Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder roomModule(RoomModule roomModule) {
      Preconditions.checkNotNull(roomModule);
      return this;
    }

    public BaseApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerBaseApp_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements BaseApp_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public BaseApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends BaseApp_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements BaseApp_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public BaseApp_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends BaseApp_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<GetRepositoriesUseCase> getRepositoriesUseCaseProvider;

      private volatile Provider<RepositoriesViewModel_AssistedFactory> repositoriesViewModel_AssistedFactoryProvider;

      private volatile Provider<LoginUseCase> loginUseCaseProvider;

      private volatile Provider<UserSharedPref> userSharedPrefProvider;

      private volatile Provider<UserViewModel_AssistedFactory> userViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private GetRepositoriesUseCase getGetRepositoriesUseCase() {
        return new GetRepositoriesUseCase(DaggerBaseApp_HiltComponents_SingletonC.this.getAppRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<GetRepositoriesUseCase> getGetRepositoriesUseCaseProvider() {
        Object local = getRepositoriesUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          getRepositoriesUseCaseProvider = (Provider<GetRepositoriesUseCase>) local;
        }
        return (Provider<GetRepositoriesUseCase>) local;
      }

      private RepositoriesViewModel_AssistedFactory getRepositoriesViewModel_AssistedFactory() {
        return RepositoriesViewModel_AssistedFactory_Factory.newInstance(getGetRepositoriesUseCaseProvider());
      }

      private Provider<RepositoriesViewModel_AssistedFactory> getRepositoriesViewModel_AssistedFactoryProvider(
          ) {
        Object local = repositoriesViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          repositoriesViewModel_AssistedFactoryProvider = (Provider<RepositoriesViewModel_AssistedFactory>) local;
        }
        return (Provider<RepositoriesViewModel_AssistedFactory>) local;
      }

      private LoginUseCase getLoginUseCase() {
        return new LoginUseCase(DaggerBaseApp_HiltComponents_SingletonC.this.getAppRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<LoginUseCase> getLoginUseCaseProvider() {
        Object local = loginUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          loginUseCaseProvider = (Provider<LoginUseCase>) local;
        }
        return (Provider<LoginUseCase>) local;
      }

      private UserSharedPref getUserSharedPref() {
        return new UserSharedPref(ApplicationContextModule_ProvideContextFactory.provideContext(DaggerBaseApp_HiltComponents_SingletonC.this.applicationContextModule));
      }

      private Provider<UserSharedPref> getUserSharedPrefProvider() {
        Object local = userSharedPrefProvider;
        if (local == null) {
          local = new SwitchingProvider<>(4);
          userSharedPrefProvider = (Provider<UserSharedPref>) local;
        }
        return (Provider<UserSharedPref>) local;
      }

      private UserViewModel_AssistedFactory getUserViewModel_AssistedFactory() {
        return UserViewModel_AssistedFactory_Factory.newInstance(getLoginUseCaseProvider(), getUserSharedPrefProvider());
      }

      private Provider<UserViewModel_AssistedFactory> getUserViewModel_AssistedFactoryProvider() {
        Object local = userViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          userViewModel_AssistedFactoryProvider = (Provider<UserViewModel_AssistedFactory>) local;
        }
        return (Provider<UserViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(2).put("com.zarinpal.test.presentation.repositories.RepositoriesViewModel", (Provider) getRepositoriesViewModel_AssistedFactoryProvider()).put("com.zarinpal.test.presentation.user.UserViewModel", (Provider) getUserViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerBaseApp_HiltComponents_SingletonC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements BaseApp_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public BaseApp_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends BaseApp_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerBaseApp_HiltComponents_SingletonC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectMainFragment(MainFragment mainFragment) {
        }

        @Override
        public void injectRepositoryFragment(RepositoryFragment repositoryFragment) {
        }

        @Override
        public void injectSplashFragment(SplashFragment splashFragment) {
        }

        @Override
        public void injectUserFragment(UserFragment userFragment) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements BaseApp_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public BaseApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends BaseApp_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements BaseApp_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public BaseApp_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends BaseApp_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.zarinpal.test.presentation.repositories.RepositoriesViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getRepositoriesViewModel_AssistedFactory();

            case 1: // com.zarinpal.test.domain.usecases.GetRepositoriesUseCase 
            return (T) ActivityCImpl.this.getGetRepositoriesUseCase();

            case 2: // com.zarinpal.test.presentation.user.UserViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getUserViewModel_AssistedFactory();

            case 3: // com.zarinpal.test.domain.usecases.LoginUseCase 
            return (T) ActivityCImpl.this.getLoginUseCase();

            case 4: // com.zarinpal.test.data.datasource.sharedPref.UserSharedPref 
            return (T) ActivityCImpl.this.getUserSharedPref();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements BaseApp_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public BaseApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends BaseApp_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
