package buu.informatics.s59160134.pinkbird


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.informatics.s59160134.pinkbird.databinding.FragmentStartsteptwoBinding



class StartStepTwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentStartsteptwoBinding>(inflater,R.layout.fragment_startsteptwo,container,false)
        val numberPicker = binding.numberPickerStep2
        if (numberPicker != null) {
            val values = arrayOf("22 Days", "23 Days", "24 Days", "25 Days", "26 Days", "27 Days", "28 Days")
            numberPicker.minValue = 0
            numberPicker.maxValue = values.size - 1
            numberPicker.displayedValues = values
            numberPicker.wrapSelectorWheel = true
        }


        return binding.root
    }


}
