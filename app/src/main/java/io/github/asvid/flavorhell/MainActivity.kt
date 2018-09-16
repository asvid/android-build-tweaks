package io.github.asvid.flavorhell

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.github.asvid.flavorhell.BuildConfig.FOO
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text.setText("FOO: $FOO | string_val: ${resources.getString(R.string
                .string_val)}")
    }
}
