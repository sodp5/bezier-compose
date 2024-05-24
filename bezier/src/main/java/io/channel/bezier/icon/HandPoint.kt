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

val BezierIcon.HandPoint: ImageVector
    get() {
        return io.channel.bezier.icon._handPoint ?: ImageVector.Builder(
                name = "HandPoint",
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
                moveTo(4.5094f, 12.213f)
                curveTo(4.3814f, 12.213f, 4.2534f, 12.262f, 4.1554f, 12.359f)
                curveTo(4.0284f, 12.487f, 4.0094f, 12.636f, 4.0094f, 12.713f)
                curveTo(4.0094f, 12.79f, 4.0284f, 12.939f, 4.1554f, 13.067f)
                lineTo(9.6254f, 18.535f)
                curveTo(10.5694f, 19.48f, 11.8244f, 20.0f, 13.1604f, 20.0f)
                lineTo(13.9374f, 20.0f)
                curveTo(15.9934f, 20.0f, 17.8164f, 18.767f, 18.5804f, 16.858f)
                curveTo(18.8584f, 16.16f, 19.0004f, 15.427f, 19.0004f, 14.677f)
                lineTo(19.0004f, 14.0f)
                curveTo(19.0004f, 13.171f, 18.4784f, 12.419f, 17.7024f, 12.128f)
                lineTo(10.0004f, 9.225f)
                lineTo(10.0004f, 3.5f)
                curveTo(10.0004f, 3.225f, 9.7764f, 3.0f, 9.5004f, 3.0f)
                curveTo(9.2244f, 3.0f, 9.0004f, 3.225f, 9.0004f, 3.5f)
                lineTo(9.0004f, 13.841f)
                curveTo(9.0004f, 14.286f, 8.7344f, 14.685f, 8.3234f, 14.856f)
                curveTo(7.9114f, 15.028f, 7.4414f, 14.936f, 7.1244f, 14.621f)
                lineTo(4.8634f, 12.359f)
                curveTo(4.7654f, 12.262f, 4.6374f, 12.213f, 4.5094f, 12.213f)
                close()
                moveTo(13.9374f, 22.0f)
                lineTo(13.1604f, 22.0f)
                curveTo(11.2904f, 22.0f, 9.5324f, 21.272f, 8.2104f, 19.949f)
                lineTo(2.7414f, 14.481f)
                curveTo(2.2694f, 14.008f, 2.0094f, 13.381f, 2.0094f, 12.713f)
                curveTo(2.0094f, 12.044f, 2.2694f, 11.416f, 2.7424f, 10.944f)
                curveTo(3.7164f, 9.972f, 5.3024f, 9.971f, 6.2774f, 10.945f)
                lineTo(7.0004f, 11.668f)
                lineTo(7.0004f, 3.5f)
                curveTo(7.0004f, 2.121f, 8.1214f, 1.0f, 9.5004f, 1.0f)
                curveTo(10.8784f, 1.0f, 12.0004f, 2.121f, 12.0004f, 3.5f)
                lineTo(12.0004f, 7.842f)
                lineTo(18.4054f, 10.256f)
                curveTo(19.9564f, 10.836f, 21.0004f, 12.342f, 21.0004f, 14.0f)
                lineTo(21.0004f, 14.677f)
                curveTo(21.0004f, 15.683f, 20.8104f, 16.666f, 20.4364f, 17.6f)
                curveTo(19.3674f, 20.273f, 16.8164f, 22.0f, 13.9374f, 22.0f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._handPoint = it
        }
    }

private var _handPoint: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HandPointIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.HandPoint,
            contentDescription = null,
    )
}
