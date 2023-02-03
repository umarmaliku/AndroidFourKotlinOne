package com.example.androidfourkotlinone.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfourkotlinone.R
import dagger.hilt.android.AndroidEntryPoint

//Topic: MVVM, ViewBindingPropertyDelegate, Kotlin Basics, Hilt

/*- Стянуть список аниме из API Kitsu, отобразить на экране фрагмента
- Использовать для инициализации binding'a библиотеку ViewBindingPropertyDelegate
- Для запроса в сеть использовать liveDat'u
- Сделать все по дизайну с низу

доп:
- При нажатии на item стянуть детальное аниме и отобразить в другом фрагменте
*/
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}