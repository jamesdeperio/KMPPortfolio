package di

import MainScreenViewModel
import org.koin.dsl.module

val navigationModule = module {
    single { MainScreenViewModel() }
}