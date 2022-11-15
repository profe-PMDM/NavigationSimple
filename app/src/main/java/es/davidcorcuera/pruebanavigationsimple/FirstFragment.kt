package es.davidcorcuera.pruebanavigationsimple

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import es.davidcorcuera.pruebanavigationsimple.databinding.FragmentFirstBinding


/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        //viewBinding
        //binding = FragmentFirstBinding.inflate(inflater)

        //dataBinding
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)
        return binding.root

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val btn = binding.button
        btn.setOnClickListener {
            this.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

    }
}