package com.dicoding.mysimplelogin

import org.koin.dsl.*


val storageModule = module {
    factory {
        SessionManager(get())
    }

    factory {
        UserRepository(get())
    }
}
