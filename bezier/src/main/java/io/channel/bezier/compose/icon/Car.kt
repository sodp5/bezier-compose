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

val BezierIcon.Car: ImageVector
    get() {
        return _car ?: ImageVector.Builder(
                name = "Car",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(5.0f, 13.5f)
                curveTo(5.0f, 12.6716f, 5.6716f, 12.0f, 6.5f, 12.0f)
                curveTo(7.3284f, 12.0f, 8.0f, 12.6716f, 8.0f, 13.5f)
                curveTo(8.0f, 14.3284f, 7.3284f, 15.0f, 6.5f, 15.0f)
                curveTo(5.6716f, 15.0f, 5.0f, 14.3284f, 5.0f, 13.5f)
                close()
                moveTo(17.5f, 12.0f)
                curveTo(16.6716f, 12.0f, 16.0f, 12.6716f, 16.0f, 13.5f)
                curveTo(16.0f, 14.3284f, 16.6716f, 15.0f, 17.5f, 15.0f)
                curveTo(18.3284f, 15.0f, 19.0f, 14.3284f, 19.0f, 13.5f)
                curveTo(19.0f, 12.6716f, 18.3284f, 12.0f, 17.5f, 12.0f)
                close()
            }

            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(14.9623f, 3.0f)
                curveTo(17.2023f, 3.0f, 19.169f, 4.4899f, 19.7755f, 6.6463f)
                lineTo(20.7439f, 10.0895f)
                curveTo(21.5173f, 10.8189f, 22.0f, 11.8531f, 22.0f, 13.0f)
                lineTo(22.0f, 17.0f)
                curveTo(22.0f, 17.5523f, 21.5523f, 18.0f, 21.0f, 18.0f)
                lineTo(21.0f, 20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                lineTo(18.0f, 21.0f)
                curveTo(17.4477f, 21.0f, 17.0f, 20.5523f, 17.0f, 20.0f)
                lineTo(17.0f, 18.0f)
                lineTo(7.0f, 18.0f)
                lineTo(7.0f, 20.0f)
                curveTo(7.0f, 20.5523f, 6.5523f, 21.0f, 6.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                lineTo(3.0f, 18.0f)
                curveTo(2.4477f, 18.0f, 2.0f, 17.5523f, 2.0f, 17.0f)
                lineTo(2.0f, 13.0f)
                curveTo(2.0f, 11.8531f, 2.4827f, 10.8189f, 3.2561f, 10.0895f)
                lineTo(4.2245f, 6.6463f)
                curveTo(4.831f, 4.4899f, 6.7977f, 3.0f, 9.0377f, 3.0f)
                lineTo(14.9623f, 3.0f)
                close()
                moveTo(18.36f, 9.0f)
                lineTo(17.8502f, 7.1878f)
                curveTo(17.5029f, 5.9527f, 16.4119f, 5.0821f, 15.1445f, 5.0055f)
                lineTo(14.9623f, 5.0f)
                lineTo(9.0377f, 5.0f)
                curveTo(7.7548f, 5.0f, 6.6213f, 5.8145f, 6.2044f, 7.0139f)
                lineTo(6.1498f, 7.1878f)
                lineTo(5.639f, 9.0f)
                lineTo(18.36f, 9.0f)
                close()
                moveTo(6.0f, 11.0f)
                curveTo(4.9456f, 11.0f, 4.0818f, 11.8159f, 4.0055f, 12.8507f)
                lineTo(4.0f, 13.0f)
                lineTo(4.0f, 16.0f)
                lineTo(20.0f, 16.0f)
                lineTo(20.0f, 13.0f)
                curveTo(20.0f, 11.9456f, 19.1841f, 11.0818f, 18.1493f, 11.0055f)
                lineTo(18.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                close()
            }
        }.build().also {
            _car = it
        }
    }

private var _car: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CarIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Car,
            contentDescription = null,
    )
}