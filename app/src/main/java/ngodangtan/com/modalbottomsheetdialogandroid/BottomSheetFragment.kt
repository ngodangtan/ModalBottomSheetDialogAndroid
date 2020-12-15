package ngodangtan.com.modalbottomsheetdialogandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottomsheet_fragment.*

class BottomSheetFragment: BottomSheetDialogFragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottomsheet_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_button1.setOnClickListener {
            Toast.makeText(context,"You pressed on button 1",Toast.LENGTH_LONG).show()
        }
        btn_button2.setOnClickListener {
            Toast.makeText(context,"You pressed on button 2",Toast.LENGTH_LONG).show()
        }
    }
}