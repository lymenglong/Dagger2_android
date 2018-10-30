package com.example.mely.exampleofdagger.mvp

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mely.exampleofdagger.R
import com.example.mely.exampleofdagger.mvp.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var context: Context

    @Inject
    lateinit var menglong: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sample_text.text=menglong

        showMessage(menglong)
    }
}
