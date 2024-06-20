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

val BezierIcons.Invert: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _invert ?: ImageVector.Builder(
                    name = "Invert",
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
                    moveTo(22.0f, 12.0f)
                    curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                    curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                    curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                    curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                    moveTo(20.0f, 12.0f)
                    arcTo(8.0f, 8.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 20.0f)
                    lineTo(12.0f, 17.0f)
                    arcTo(5.0f, 5.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 7.0f)
                    lineTo(12.0f, 4.0f)
                    arcTo(8.0f, 8.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 20.0f, 12.0f)
                    moveTo(12.0f, 7.0f)
                    arcTo(5.0f, 5.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 17.0f)
                    close()
                }
            }.build().also {
                _invert = it
            }
    }


private var _invert: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun InvertIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Invert.imageVector,
            contentDescription = null,
    )
}