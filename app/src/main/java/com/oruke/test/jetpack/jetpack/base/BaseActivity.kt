package com.oruke.test.jetpack.jetpack.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.oruke.test.jetpack.jetpack.R

abstract class BaseActivity : AppCompatActivity() {
    abstract fun getContentView() : Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getContentView())
        initView(savedInstanceState)
    }

    open fun initView(savedInstanceState: Bundle?) {

    }
}
