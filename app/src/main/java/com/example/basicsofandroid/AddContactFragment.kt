package com.example.basicsofandroid

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.basicsofandroid.databinding.FragmentAddContactBinding


class AddContactFragment : Fragment() {

    private var _binding : FragmentAddContactBinding? = null
    private val binding get() = _binding!!
    private lateinit var contactList: MutableList<Contact>
    private lateinit var contact: Contact

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentAddContactBinding.inflate(inflater, container, false)
        contactList = mutableListOf()
        contact = Contact("",0)
        binding.addButton.setOnClickListener {
            contact.name = binding.etPersonName.text.toString()
            contact.phoneNumber = binding.etPhoneNumber.text.toString().toInt()
            contactList.add(Contact(contact.name, contact.phoneNumber))
            binding.recyclerView.adapter =RecyclerViewAdapter(contactList)
        }
        binding.recyclerView.adapter =RecyclerViewAdapter(contactList)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)

        return binding.root
    }




    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}