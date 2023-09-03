package com.myapplication_deniseburgos

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.runner.RunWith

@RunWith (AndroidJUnit4 :: class)
class MainActivityTest  {

    @get:Rule
    var rule: ActivityScenarioRule <*> = ActivityScenarioRule (MainActivity::class.java)
    

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }




        @Test
        fun testCompareButton() {

            Espresso.onView(
                ViewMatchers.withId(R.id.editText1)
            ).perform(
                ViewActions.typeText("hello"))

            Espresso.onView(
                ViewMatchers.withId(R.id.editText2)
            ).perform(
                ViewActions.typeText("world"))

            Espresso.onView(
                ViewMatchers.withId(R.id.compareButton)
            ).perform(
                ViewActions.typeText("Comparar"))

            Espresso.onView(
                ViewMatchers.withId(R.id.resultTextView)
            ).check(
                ViewAssertions.matches(
                    ViewMatchers.withText("Las cadenas no son iguales.")))

        }


    }


