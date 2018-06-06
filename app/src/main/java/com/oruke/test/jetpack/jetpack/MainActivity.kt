package com.oruke.test.jetpack.jetpack

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.oruke.test.jetpack.jetpack.base.BaseActivity
import com.oruke.test.jetpack.jetpack.ui.main.MainFragment

class MainActivity : BaseActivity() {
    override fun getContentView(): Int {
        return R.layout.main_activity
    }

    override fun initView(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        return super.onPrepareOptionsMenu(menu)
    }
}
