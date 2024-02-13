package com.phillipdev.dialogfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment

class DialogFragment : DialogFragment() {

    lateinit var name : EditText
    lateinit var age: EditText
    lateinit var cancel : Button
    lateinit var ok : Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view : View = inflater.inflate(R.layout.fragment_dialog, container, false)

        name = view.findViewById(R.id.editName)
        age = view.findViewById(R.id.editAge)
        cancel = view.findViewById(R.id.btnCancel)
        ok = view.findViewById(R.id.btnOk)

        ok.setOnClickListener {

        }
        cancel.setOnClickListener {
            dialog!!.dismiss()
        }
        // Inflate the layout for this fragment
        return view
    }

}