package com.dicoding.androidprogramming.submission1jetpackpro.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.androidprogramming.submission1jetpackpro.R
import com.dicoding.androidprogramming.submission1jetpackpro.utils.EspressoIdlingResource
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class HomeActivityTest {

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Before
    fun setUp(){
        IdlingRegistry.getInstance().register(EspressoIdlingResource.idlingResource)
    }

    @After
    fun tearDown(){
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.idlingResource)
    }

    @Test
    fun loadMovies(){
        onView(withId(R.id.rv_movies)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(20))
    }

    @Test
    fun loadMovieDetails(){
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.img_poster_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_share)).perform(click())
    }

    @Test
    fun loadSeries(){
        onView(withText("TV Series")).perform(click())
        onView(withId(R.id.rv_shows)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_shows)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(20))
    }

    @Test
    fun loadSeriesDetails(){
        onView(withText("TV Series")).perform(click())
        onView(withId(R.id.rv_shows)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_shows)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.img_poster_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_share)).perform(click())
    }

    @Test
    fun loadFavoriteMovies(){
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.btn_favorite)).perform(click())
        onView(isRoot()).perform(ViewActions.pressBack())
        onView(withId(R.id.to_favorite)).perform(click())
        onView(withId(R.id.rv_movies)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.img_poster_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_favorite)).perform(click())
        onView(isRoot()).perform(ViewActions.pressBack())
    }

    @Test
    fun loadFavoriteShows(){
        onView(withText("TV Series")).perform(click())
        onView(withId(R.id.rv_shows)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.btn_favorite)).perform(click())
        onView(isRoot()).perform(ViewActions.pressBack())
        onView(withId(R.id.to_favorite)).perform(click())
        onView(withText("Favorite TV Series")).perform(click())
        onView(withId(R.id.rv_shows)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_shows)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.img_poster_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_favorite)).perform(click())
        onView(isRoot()).perform(ViewActions.pressBack())
    }
}