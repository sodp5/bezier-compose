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

val BezierIcon.Bus: ImageVector
    get() {
        return io.channel.bezier.icon._bus ?: ImageVector.Builder(
                name = "Bus",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(6.0f, 14.5f)
                curveTo(6.0f, 13.6716f, 6.6716f, 13.0f, 7.5f, 13.0f)
                curveTo(8.3284f, 13.0f, 9.0f, 13.6716f, 9.0f, 14.5f)
                curveTo(9.0f, 15.3284f, 8.3284f, 16.0f, 7.5f, 16.0f)
                curveTo(6.6716f, 16.0f, 6.0f, 15.3284f, 6.0f, 14.5f)
                close()
                moveTo(16.5f, 13.0f)
                curveTo(15.6716f, 13.0f, 15.0f, 13.6716f, 15.0f, 14.5f)
                curveTo(15.0f, 15.3284f, 15.6716f, 16.0f, 16.5f, 16.0f)
                curveTo(17.3284f, 16.0f, 18.0f, 15.3284f, 18.0f, 14.5f)
                curveTo(18.0f, 13.6716f, 17.3284f, 13.0f, 16.5f, 13.0f)
                close()
            }

            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(17.0f, 2.0f)
                curveTo(19.2091f, 2.0f, 21.0f, 3.7909f, 21.0f, 6.0f)
                lineTo(21.0f, 21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                lineTo(18.0f, 22.0f)
                curveTo(17.4477f, 22.0f, 17.0f, 21.5523f, 17.0f, 21.0f)
                lineTo(17.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                lineTo(7.0f, 21.0f)
                curveTo(7.0f, 21.5523f, 6.5523f, 22.0f, 6.0f, 22.0f)
                lineTo(4.0f, 22.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                lineTo(3.0f, 6.0f)
                curveTo(3.0f, 3.7909f, 4.7909f, 2.0f, 7.0f, 2.0f)
                lineTo(17.0f, 2.0f)
                close()
                moveTo(19.0f, 6.0f)
                lineTo(19.0f, 10.0f)
                lineTo(5.0f, 10.0f)
                lineTo(5.0f, 6.0f)
                lineTo(5.0055f, 5.8507f)
                curveTo(5.0818f, 4.8159f, 5.9456f, 4.0f, 7.0f, 4.0f)
                lineTo(17.0f, 4.0f)
                lineTo(17.1493f, 4.0055f)
                curveTo(18.1841f, 4.0818f, 19.0f, 4.9456f, 19.0f, 6.0f)
                close()
                moveTo(19.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                lineTo(5.0f, 17.0f)
                lineTo(19.0f, 17.0f)
                lineTo(19.0f, 12.0f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._bus = it
        }
    }

private var _bus: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BusIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Bus,
            contentDescription = null,
    )
}
