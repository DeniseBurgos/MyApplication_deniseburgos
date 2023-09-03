package com.myapplication_deniseburgos

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MainViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()


    @Mock
    private lateinit var observer: Observer<String>

    private lateinit var viewModel: MainViewModel

    @Before
    fun setup() {
        viewModel = MainViewModel()
        viewModel.getResultLiveData().observeForever(observer)
    }

    @Test
    fun testCompareStrings() {
        viewModel.compareStrings("hello", "hello")
        // Verificar que el resultado sea "Las cadenas son iguales."
        verify(observer).onChanged("Las cadenas son iguales.")

    }
}
