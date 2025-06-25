package com.example.basicnotesapp


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ViewScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
//        items() { index ->
//            CardUI(index = index)
//        }
    }
    Box(modifier = Modifier.fillMaxSize()) {
        FloatingActionButton(
            onClick = {},
            modifier = Modifier.padding(16.dp).align(Alignment.BottomEnd),
            shape = CircleShape,
            containerColor = Color(0xFF4CAF50)
        ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = null)
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CardUI() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(28.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Text(
            text = "Sample Card",
            modifier = Modifier.padding(16.dp),
            style = typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "This is a description for the card. Add more details here.",
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            style = typography.bodyMedium
        )
    }
}
