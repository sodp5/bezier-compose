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

val BezierIcon.Android: ImageVector
    get() {
        return io.channel.bezier.icon._android ?: ImageVector.Builder(
                name = "Android",
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
                moveTo(13.8f, 5.5f)
                lineTo(14.7f, 5.5f)
                lineTo(14.7f, 4.6f)
                lineTo(13.8f, 4.6f)
                lineTo(13.8f, 5.5f)
                close()
                moveTo(9.3f, 5.5f)
                lineTo(10.2f, 5.5f)
                lineTo(10.2f, 4.6f)
                lineTo(9.3f, 4.6f)
                lineTo(9.3f, 5.5f)
                close()
                moveTo(15.177f, 2.944f)
                lineTo(16.347f, 1.774f)
                curveTo(16.527f, 1.594f, 16.527f, 1.315f, 16.347f, 1.135f)
                curveTo(16.167f, 0.955f, 15.888f, 0.955f, 15.708f, 1.135f)
                lineTo(14.376f, 2.467f)
                curveTo(13.665f, 2.107f, 12.855f, 1.9f, 12.0f, 1.9f)
                curveTo(11.136f, 1.9f, 10.326f, 2.107f, 9.606f, 2.467f)
                lineTo(8.265f, 1.135f)
                curveTo(8.085f, 0.955f, 7.806f, 0.955f, 7.626f, 1.135f)
                curveTo(7.446f, 1.315f, 7.446f, 1.594f, 7.626f, 1.774f)
                lineTo(8.805f, 2.953f)
                curveTo(7.473f, 3.934f, 6.6f, 5.509f, 6.6f, 7.3f)
                lineTo(17.4f, 7.3f)
                curveTo(17.4f, 5.509f, 16.527f, 3.925f, 15.177f, 2.944f)
                close()
                moveTo(19.65f, 8.2f)
                curveTo(18.903f, 8.2f, 18.3f, 8.803f, 18.3f, 9.55f)
                lineTo(18.3f, 15.85f)
                curveTo(18.3f, 16.597f, 18.903f, 17.2f, 19.65f, 17.2f)
                curveTo(20.397f, 17.2f, 21.0f, 16.597f, 21.0f, 15.85f)
                lineTo(21.0f, 9.55f)
                curveTo(21.0f, 8.803f, 20.397f, 8.2f, 19.65f, 8.2f)
                close()
                moveTo(4.35f, 8.2f)
                curveTo(3.603f, 8.2f, 3.0f, 8.803f, 3.0f, 9.55f)
                lineTo(3.0f, 15.85f)
                curveTo(3.0f, 16.597f, 3.603f, 17.2f, 4.35f, 17.2f)
                curveTo(5.097f, 17.2f, 5.7f, 16.597f, 5.7f, 15.85f)
                lineTo(5.7f, 9.55f)
                curveTo(5.7f, 8.803f, 5.097f, 8.2f, 4.35f, 8.2f)
                close()
                moveTo(6.6f, 17.2f)
                curveTo(6.6f, 17.695f, 7.005f, 18.1f, 7.5f, 18.1f)
                lineTo(8.4f, 18.1f)
                lineTo(8.4f, 21.25f)
                curveTo(8.4f, 21.997f, 9.003f, 22.6f, 9.75f, 22.6f)
                curveTo(10.497f, 22.6f, 11.1f, 21.997f, 11.1f, 21.25f)
                lineTo(11.1f, 18.1f)
                lineTo(12.9f, 18.1f)
                lineTo(12.9f, 21.25f)
                curveTo(12.9f, 21.997f, 13.503f, 22.6f, 14.25f, 22.6f)
                curveTo(14.997f, 22.6f, 15.6f, 21.997f, 15.6f, 21.25f)
                lineTo(15.6f, 18.1f)
                lineTo(16.5f, 18.1f)
                curveTo(16.995f, 18.1f, 17.4f, 17.695f, 17.4f, 17.2f)
                lineTo(17.4f, 8.2f)
                lineTo(6.6f, 8.2f)
                lineTo(6.6f, 17.2f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._android = it
        }
    }

private var _android: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun AndroidIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Android,
            contentDescription = null,
    )
}
