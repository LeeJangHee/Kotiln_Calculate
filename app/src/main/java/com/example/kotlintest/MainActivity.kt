package com.example.kotlintest

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var oper: String = ""
    var result: String = ""
    var nextResult: String = ""
    var checkOperator: Boolean = false
    var checkFloat: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val screen: TextView = findViewById(R.id.textView)

        btn_0.setOnClickListener {
            if (checkOperator) {
                setNextResult("0", screen)
            } else {
                setResult("0", screen)
            }
        }
        btn_1.setOnClickListener {
            if (checkOperator) {
                setNextResult("1", screen)
            } else {
                setResult("1", screen)
            }
        }
        btn_2.setOnClickListener {
            if (checkOperator) {
                setNextResult("2", screen)
            } else {
                setResult("2", screen)
            }
        }
        btn_3.setOnClickListener {
            if (checkOperator) {
                setNextResult("3", screen)
            } else {
                setResult("3", screen)
            }
        }
        btn_4.setOnClickListener {
            if (checkOperator) {
                setNextResult("4", screen)
            } else {
                setResult("4", screen)
            }
        }
        btn_5.setOnClickListener {
            if (checkOperator) {
                setNextResult("5", screen)
            } else {
                setResult("5", screen)
            }
        }
        btn_6.setOnClickListener {
            if (checkOperator) {
                setNextResult("6", screen)
            } else {
                setResult("6", screen)
            }
        }
        btn_7.setOnClickListener {
            if (checkOperator) {
                setNextResult("7", screen)
            } else {
                setResult("7", screen)
            }
        }
        btn_8.setOnClickListener {
            if (checkOperator) {
                setNextResult("8", screen)
            } else {
                setResult("8", screen)
            }
        }
        btn_9.setOnClickListener {
            if (checkOperator) {
                setNextResult("9", screen)
            } else {
                setResult("9", screen)
            }
        }

        btn_clear.setOnClickListener {
            result = ""
            nextResult = ""
            oper = ""
            screen.setText("0")
        }

        btn_equal.setOnClickListener {
            screen.setText(calculate())
            result = screen.text.toString()
            nextResult = ""
        }

        btn_addition.setOnClickListener {
            checkOperator = true
            oper = "+"
        }

        btn_subtraction.setOnClickListener {
            checkOperator = true
            oper = "-"
        }

        btn_multiplication.setOnClickListener {
            checkOperator = true
            oper = "*"
        }

        btn_division.setOnClickListener {
            checkOperator = true
            oper = "/"
        }


    }

    private fun setResult(str: String, screen: TextView) {
        result += str
        screen.setText(result)
    }

    private fun setNextResult(str: String, screen: TextView) {
        nextResult += str
        screen.setText(nextResult)
    }

    private fun calculate(): String {
        checkOperator = false
        if (nextResult == "") nextResult = "0"
        val str: String = when (oper) {
            "+" -> {
                add(result, nextResult).toString()
            }
            "-" -> {
                sub(result, nextResult).toString()
            }
            "*" -> {
                mult(result, nextResult).toString()
            }
            else -> {
                divide(result, nextResult).toString()
            }
        }

        Log.d("TAG", "$result $oper $nextResult")

        return str
    }

    private fun add(first: String, second: String) = first.toInt() + second.toInt()

    private fun sub(first: String, second: String) = first.toInt() - second.toInt()

    private fun mult(first: String, second: String) = first.toInt() * second.toInt()

    private fun divide(first: String, second: String) = first.toInt() / second.toInt()


}