
package com.fatec.composeui.ui.components.card

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun CustomFilledCard(stateUser : Boolean) {
    val stateUser = true
    var isLoggedColor = if (stateUser){
        MaterialTheme.colorScheme.primaryContainer
    }else{
        MaterialTheme.colorScheme.surfaceVariant
    }
    val config = ConfigCustomFilledCard(containerColor = isLoggedColor)
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        modifier = Modifier.size(width = 240.dp, height = 100.dp)
    ) {
        Text(
            text = "Filled",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center,
        )
    }
}
class ConfigCustomFilledCard(val containerColor: Color){}


