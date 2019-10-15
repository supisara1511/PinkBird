package buu.informatics.s59160134.pinkbird


import android.os.Bundle
import android.renderscript.ScriptGroup
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.informatics.s59160134.pinkbird.databinding.FragmentStartsteponeBinding





class StartStepOneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentStartsteponeBinding>(inflater,R.layout.fragment_startstepone,container,false)
        val numberPicker = binding.longPeriodPicker
        if (numberPicker != null) {
            val values = arrayOf("1 Days", "2 Days", "3 Days", "4 Days", "5 Days", "6 Days", "7 Days")
            numberPicker.minValue = 0
            numberPicker.maxValue = values.size - 1
            numberPicker.displayedValues = values
            numberPicker.wrapSelectorWheel = true
        }


        binding.nextBtn.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_startStepOneFragment_to_startStepTwoFragment)
        }




        return binding.root
    }


}
