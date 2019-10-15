package buu.informatics.s59160134.pinkbird


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160134.pinkbird.databinding.FragmentStartstepthreeBinding


class StartStepThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentStartstepthreeBinding>(inflater,R.layout.fragment_startstepthree,container,false)
        return inflater.inflate(R.layout.fragment_startstepthree, container, false)
    }


}
