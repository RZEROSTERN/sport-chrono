package mx.dev1.sportchrono.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import mx.dev1.sportchrono.ui.theme.PurpleGrey40

@Composable
fun SportButtonContainer(title: String, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(PurpleGrey40)
            .aspectRatio(1f)
            .clickable { onClick() },
        contentAlignment = Alignment.Center,
    ) {
        Text(
            title,
            color = Color.White
        )
    }
}