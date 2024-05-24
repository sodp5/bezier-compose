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

val BezierIcon.Ghost: ImageVector
    get() {
        return _ghost ?: ImageVector.Builder(
                name = "Ghost",
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
                moveTo(17.964f, 18.4552f)
                curveTo(17.964f, 18.6482f, 17.841f, 18.7302f, 17.738f, 18.7652f)
                curveTo(17.637f, 18.8022f, 17.488f, 18.8092f, 17.367f, 18.6542f)
                curveTo(16.915f, 18.0792f, 16.231f, 17.7492f, 15.491f, 17.7492f)
                lineTo(15.49f, 17.7492f)
                curveTo(14.751f, 17.7492f, 14.068f, 18.0792f, 13.616f, 18.6542f)
                lineTo(12.9f, 19.5652f)
                curveTo(12.466f, 20.1192f, 11.534f, 20.1172f, 11.1f, 19.5662f)
                lineTo(10.385f, 18.6542f)
                curveTo(9.932f, 18.0792f, 9.249f, 17.7492f, 8.509f, 17.7492f)
                lineTo(8.508f, 17.7492f)
                curveTo(7.769f, 17.7492f, 7.086f, 18.0792f, 6.633f, 18.6542f)
                curveTo(6.513f, 18.8092f, 6.364f, 18.8012f, 6.261f, 18.7652f)
                curveTo(6.158f, 18.7302f, 6.036f, 18.6482f, 6.036f, 18.4552f)
                lineTo(6.036f, 9.8592f)
                curveTo(6.036f, 6.6292f, 8.711f, 4.0002f, 12.0f, 4.0002f)
                curveTo(15.289f, 4.0002f, 17.964f, 6.6292f, 17.964f, 9.8592f)
                lineTo(17.964f, 18.4552f)
                close()
                moveTo(12.0f, 2.0002f)
                curveTo(7.589f, 2.0002f, 4.0f, 5.5252f, 4.0f, 9.8592f)
                lineTo(4.0f, 18.4552f)
                curveTo(4.0f, 19.4672f, 4.63f, 20.3312f, 5.604f, 20.6582f)
                curveTo(6.581f, 20.9822f, 7.616f, 20.6782f, 8.245f, 19.8772f)
                curveTo(8.419f, 19.6542f, 8.599f, 19.6552f, 8.773f, 19.8762f)
                lineTo(9.488f, 20.7882f)
                curveTo(10.094f, 21.5592f, 11.01f, 22.0002f, 12.001f, 22.0002f)
                curveTo(12.991f, 22.0002f, 13.906f, 21.5582f, 14.511f, 20.7882f)
                lineTo(15.227f, 19.8772f)
                curveTo(15.401f, 19.6542f, 15.581f, 19.6552f, 15.755f, 19.8762f)
                curveTo(16.383f, 20.6772f, 17.421f, 20.9812f, 18.395f, 20.6582f)
                curveTo(19.37f, 20.3322f, 20.0f, 19.4672f, 20.0f, 18.4552f)
                lineTo(20.0f, 9.8592f)
                curveTo(20.0f, 5.5252f, 16.411f, 2.0002f, 12.0f, 2.0002f)
                close()
                moveTo(9.0964f, 8.0763f)
                curveTo(8.3324f, 8.0763f, 8.0134f, 8.6183f, 8.0134f, 9.9443f)
                curveTo(8.0134f, 11.2713f, 8.3324f, 11.8133f, 9.0964f, 11.8133f)
                curveTo(9.8604f, 11.8133f, 10.1794f, 11.2713f, 10.1794f, 9.9443f)
                curveTo(10.1794f, 8.6183f, 9.8604f, 8.0763f, 9.0964f, 8.0763f)
                close()
                moveTo(13.8205f, 9.9443f)
                curveTo(13.8205f, 8.6183f, 14.1395f, 8.0763f, 14.9035f, 8.0763f)
                curveTo(15.6675f, 8.0763f, 15.9865f, 8.6183f, 15.9865f, 9.9443f)
                curveTo(15.9865f, 11.2713f, 15.6675f, 11.8133f, 14.9035f, 11.8133f)
                curveTo(14.1395f, 11.8133f, 13.8205f, 11.2713f, 13.8205f, 9.9443f)
                close()
            }
        }.build().also {
            _ghost = it
        }
    }

private var _ghost: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun GhostIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Ghost,
            contentDescription = null,
    )
}
