package com.jdd.sandbox.android

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.testing.TestNavHostController
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.jdd.sandbox.android", appContext.packageName)
    }

    @Test
    fun testFirstButton() {
        val mainScreen = launchFragmentInContainer<FirstFragment>()
        onView(withId(R.id.button_first)).check(matches(isDisplayed()))
    }

    @Test
    fun testSecondButton() {
        val mainScreen = launchFragmentInContainer<FirstFragment>()
        onView(withId(R.id.button_second)).check(matches(isDisplayed()))
    }
}