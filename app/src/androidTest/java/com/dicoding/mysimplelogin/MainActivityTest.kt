package com.dicoding.mysimplelogin

import org.junit.*
import org.junit.Assert.assertEquals
import org.koin.core.context.*
import org.koin.test.*

class MainActivityTest : KoinTest {

    private val userRepository: UserRepository by inject()
    private val username = "usmar manalu"

    @Before
    fun before() {
        loadKoinModules(storageModule)
        userRepository.loginUser(username)
    }

    @After
    fun after() {
        stopKoin()
    }

    @Test
    fun getUsernameFromRepository() {
        val requestedUsername = userRepository.getUser()
        assertEquals(username, requestedUsername)
    }
}