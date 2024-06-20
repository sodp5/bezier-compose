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

val BezierIcons.ButtonRoute: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _buttonRoute ?: ImageVector.Builder(
                    name = "ButtonRoute",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(4.0f, 9.0f)
                    lineTo(4.0f, 16.0f)
                    lineTo(7.0f, 16.0f)
                    lineTo(7.0f, 18.0f)
                    lineTo(3.5f, 18.0f)
                    arcTo(1.5f, 1.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 2.0f, 16.5f)
                    lineTo(2.0f, 3.0f)
                    lineTo(4.0f, 3.0f)
                    lineTo(4.0f, 7.0f)
                    lineTo(7.0f, 7.0f)
                    lineTo(7.0f, 9.0f)
                    close()
                    moveTo(9.5f, 4.0f)
                    arcTo(1.5f, 1.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 8.0f, 5.5f)
                    lineTo(8.0f, 9.5f)
                    arcTo(1.5f, 1.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 11.0f)
                    lineTo(20.5f, 11.0f)
                    arcTo(1.5f, 1.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 22.0f, 9.5f)
                    lineTo(22.0f, 5.5f)
                    arcTo(1.5f, 1.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 4.0f)
                    close()
                    moveTo(9.5f, 13.0f)
                    arcTo(1.5f, 1.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 8.0f, 14.5f)
                    lineTo(8.0f, 18.5f)
                    arcTo(1.5f, 1.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 20.0f)
                    lineTo(20.5f, 20.0f)
                    arcTo(1.5f, 1.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 22.0f, 18.5f)
                    lineTo(22.0f, 14.5f)
                    arcTo(1.5f, 1.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 13.0f)
                    close()
                }
            }.build().also {
                _buttonRoute = it
            }
    }


private var _buttonRoute: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ButtonRouteIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ButtonRoute.imageVector,
            contentDescription = null,
    )
}