package com.example.customviewdemo2

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.widget.Toast

class TaskView(context : Context,
               attributeSet: AttributeSet) : androidx.appcompat.widget.AppCompatTextView(context,attributeSet){

        var taskStatus : Boolean = false
        var marginColor : Int = Color.GREEN

        private var paint = Paint()

    init{
        setTextColor(Color.MAGENTA)
        paint.strokeWidth = 10F
        setPadding(80,10,10,10)
        setOnClickListener {
            taskStatus = !taskStatus
            var textColor = Color.MAGENTA
            if(taskStatus) textColor = Color.CYAN
            setTextColor(textColor)
        }
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        Log.e("tag","onDraw()")
        Toast.makeText(context,"onDraw()method Called",Toast.LENGTH_LONG).show()
        paint.setColor(marginColor)

        canvas!!.let {
            it.drawLine(60F,0F,60F,height.toFloat(),paint)
            it.drawLine(80F,0F,80F,height.toFloat(),paint)
        }
    }
}