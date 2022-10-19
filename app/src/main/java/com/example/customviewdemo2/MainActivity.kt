package com.example.customviewdemo2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnRefresh : Button
    private lateinit var taskView: TaskView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews(){
        btnRefresh = findViewById(R.id.btnRefresh)
        taskView = findViewById(R.id.taskView)

        btnRefresh.setOnClickListener {
            var random = java.util.Random()
            taskView.marginColor = Color.rgb(
                (Math.abs(random.nextInt() % 256)),
                (Math.abs(random.nextInt() % 256)),
                (Math.abs(random.nextInt() % 256))
            )
            taskView.invalidate()
        }
    }
}