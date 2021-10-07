package net.contriverssoft.viewbinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import net.contriverssoft.viewbinding.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _homeBinding: FragmentHomeBinding? = null
    private val homeBinding get() = _homeBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _homeBinding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = homeBinding.root

        homeBinding.btnMoodSubmit.setOnClickListener {

            val userMood = homeBinding.etUserMood.text.toString()
            Toast.makeText(context, userMood, Toast.LENGTH_SHORT).show()
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _homeBinding = FragmentHomeBinding.bind(view)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _homeBinding = null
    }

}