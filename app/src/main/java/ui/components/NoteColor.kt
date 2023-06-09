package com.topic2.android.notes.util.components
import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.topic2.android.notes.theme.rwGreen

@Composable
fun NoteColor(color: Color, size: Dp, padding: Dp, border: Dp) {
    Box(
        modifier = Modifier.run {
            size(40.dp)
                .padding(padding)
                .size(size)
                .clip(CircleShape)
                .background(color)
                .border(
                    BorderStroke(
                        2.dp,
                        border,
                        SolidColor(Color.Black)
                    ),
                    CircleShape
                )
        }
    )
}

@SuppressLint("ModifierFactoryUnreferencedReceiver")
private fun Modifier.border(borderStroke: Unit, circleShape: RoundedCornerShape): Modifier {
    TODO("Not yet implemented")
}

fun BorderStroke(dp: Dp, border: Dp, solidColor: SolidColor) {

}


@Preview
@Composable
fun NoteColorPreview(){
    NoteColor(color = Color.Red, size = 40.dp, padding = 4.dp, border = 2.dp)
}