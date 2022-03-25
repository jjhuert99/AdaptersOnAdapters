package com.example.adaptersonadapters.ui.home

import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    val interestChips = listOf("Movies", "Gaming", "Sports", "Photography", "Tech")
    val simUsers = listOf("Alan", "Eve", "Julio", "Desiree", "Taylor")
    val interactOptions = listOf("Connect", "Block", "Add", "Delete")

}
