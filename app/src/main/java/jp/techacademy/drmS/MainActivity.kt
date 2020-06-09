package jp.techacademy.drmS

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button4timeSet.setOnClickListener{
            showTimePickerDialog()
        }


    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                updateTextView(hour)
            },
            13, 0, true)
        timePickerDialog.show()
    }

    private fun updateTextView(hour: Int){
        when{
            (2 <= hour && hour <= 9) -> textView4greeting.setText("おはよう")
            (10 <= hour && hour <= 17) -> textView4greeting.setText("こんにちは")
            else -> textView4greeting.setText("こんばんは")
        }
    }
}
