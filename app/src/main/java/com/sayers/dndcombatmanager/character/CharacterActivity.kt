package com.sayers.dndcombatmanager.character

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.sayers.dndcombatmanager.databinding.CharacterViewBinding
import com.sayers.dndcombatmanager.mainactivity.MainActivityViewModel

class CharacterActivity: AppCompatActivity() {

    lateinit var binding: CharacterViewBinding
    lateinit var viewModel: CharacterViewModel

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        binding = CharacterViewBinding.inflate(layoutInflater)
        setContentView( binding.root)

        viewModel = ViewModelProvider(this)[CharacterViewModel::class.java]
    }

}