package com.programmer.challenge6_ma.di

import com.programmer.challenge6_ma.database.CartDatabase
import com.programmer.challenge6_ma.repository.CartRepository
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module
import com.programmer.challenge6_ma.viewmodel.CartViewModel

object KoinModule {

    private val localModule = module {
        single { CartDatabase.getDatabase(androidContext()) }
        single { get<CartDatabase>().cartItemDao() }
    }

    private val repositoryModule = module {
        single<CartRepository> { CartRepository(get()) }
    }

    private val viewModelModule = module {
        viewModel { CartViewModel(get()) }
    }

    val module: List<Module> = listOf(
        localModule,
        repositoryModule,
        viewModelModule
    )
}
