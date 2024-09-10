package com.example.materialdesign.ui.components.fab

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.runtime.Composable

@Composable
fun CustomFABLarge(onClick: ()-> Unit){
    LargeFloatingActionButton(
        onClick = {onClick() },
        shape = CircleShape)

    {

        Icon(Icons.Filled.Add, "Large Floating action Button")
    }
}