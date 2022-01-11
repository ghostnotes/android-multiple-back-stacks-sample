package co.ghostnotes.sample.multibackstacks.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import co.ghostnotes.sample.multibackstacks.databinding.FragmentDashboardFirstBinding
import timber.log.Timber

class FirstDashboardFragment : Fragment() {

    private lateinit var viewModel: FirstDashboardViewModel
    private var _binding: FragmentDashboardFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this)[FirstDashboardViewModel::class.java]

        _binding = FragmentDashboardFirstBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        viewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        binding.button.setOnClickListener {
            findNavController()
                .navigate(FirstDashboardFragmentDirections.actionDashboardFirstToDashboardSecond())
            Timber.d("### onClick()")
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}