@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons

val BezierIcons.CancelSmall: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _cancelSmall ?: ImageVector.Builder(
                    name = "CancelSmall",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(16.95f, 8.464f)
                    arcTo(1.0f, 1.0f, 45.99574461357973f, isMoreThanHalf = true, isPositiveArc = false, 15.536f, 7.050000000000001f)
                    lineTo(12.0f, 10.586f)
                    lineTo(8.465f, 7.051f)
                    arcTo(1.0f, 1.0f, 314.0456004492186f, isMoreThanHalf = false, isPositiveArc = false, 7.05f, 8.464f)
                    lineTo(10.586f, 12.0f)
                    lineTo(7.05f, 15.535f)
                    arcTo(1.0f, 1.0f, 225.99574461357642f, isMoreThanHalf = true, isPositiveArc = false, 8.464f, 16.949f)
                    lineTo(12.0f, 13.414f)
                    lineTo(15.536f, 16.95f)
                    arcTo(1.0f, 1.0f, 134.97974638235135f, isMoreThanHalf = false, isPositiveArc = false, 16.95f, 15.535f)
                    lineTo(13.414f, 12.0f)
                    close()
                }
            }.build().also {
                _cancelSmall = it
            }
    }


private var _cancelSmall: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CancelSmallIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CancelSmall.imageVector,
            contentDescription = null,
    )
}