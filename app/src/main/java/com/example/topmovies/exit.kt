package com.example.topmovies

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class exit : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        builder
            .setIcon(android.R.drawable.ic_menu_close_clear_cancel)
            .setTitle(" Exit?")
            .setMessage("Do you want to exit ?")
            .setPositiveButton("ok"){_, _ -> activity?.finish()}
            .setNegativeButton("Cancle"){dialog, _ -> dialog.dismiss() }

        return builder.create()
    }
}