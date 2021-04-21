package com.othman.autobet.ui

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import com.othman.autobet.R
import com.othman.autobet.model.Match
import kotlinx.android.synthetic.main.add_match_dialog.*

class AddMatchDialog(context: Context, var addDialogListener: AddDialogListener): AppCompatDialog(context) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.match_itemview)

        tvAdd.setOnClickListener {
            val homeTeam = etHomeTeam.text.toString()
            val awayTeam = etAwayTeam.text.toString()
            val time = etChooseTime.text.toString()

            if (awayTeam.isEmpty() || homeTeam.isEmpty() || time.isEmpty()) {
                Toast.makeText(context, "Missing infos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val item = Match(time, homeTeam, awayTeam)
            addDialogListener.onAddButtonClicked(item)
            dismiss()
        }

        tvCancel.setOnClickListener { cancel() }
    }
}