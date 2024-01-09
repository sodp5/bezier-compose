@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.BezierIcon

val BezierIcon.Beta: ImageVector
    get() {
        return _beta ?: ImageVector.Builder(
                name = "Beta",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(7.5f, 7.7222f)
                curveTo(7.5f, 5.3903f, 9.3904f, 3.5f, 11.7222f, 3.5f)
                curveTo(14.0541f, 3.5f, 15.9444f, 5.3903f, 15.9444f, 7.7222f)
                lineTo(15.9444f, 7.8f)
                curveTo(15.9444f, 8.5574f, 15.7486f, 9.2691f, 15.4048f, 9.8872f)
                curveTo(16.6679f, 10.7298f, 17.5f, 12.1677f, 17.5f, 13.8f)
                curveTo(17.5f, 16.3957f, 15.3957f, 18.5f, 12.8f, 18.5f)
                lineTo(10.5f, 18.5f)
                lineTo(10.5f, 20.0f)
                curveTo(10.5f, 20.8284f, 9.8284f, 21.5f, 9.0f, 21.5f)
                curveTo(8.1716f, 21.5f, 7.5f, 20.8284f, 7.5f, 20.0f)
                lineTo(7.5f, 7.7222f)
                close()
                moveTo(10.5f, 15.5f)
                lineTo(12.8f, 15.5f)
                curveTo(13.7389f, 15.5f, 14.5f, 14.7389f, 14.5f, 13.8f)
                curveTo(14.5f, 12.8611f, 13.7389f, 12.1f, 12.8f, 12.1f)
                lineTo(10.5f, 12.1f)
                lineTo(10.5f, 15.5f)
                close()
                moveTo(10.5f, 9.1f)
                lineTo(11.6444f, 9.1f)
                curveTo(12.3624f, 9.1f, 12.9444f, 8.518f, 12.9444f, 7.8f)
                lineTo(12.9444f, 7.7222f)
                curveTo(12.9444f, 7.0472f, 12.3972f, 6.5f, 11.7222f, 6.5f)
                curveTo(11.0472f, 6.5f, 10.5f, 7.0472f, 10.5f, 7.7222f)
                lineTo(10.5f, 9.1f)
                close()
            }
        }.build().also {
            _beta = it
        }
    }

private var _beta: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BetaIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Beta,
            contentDescription = null,
    )
}