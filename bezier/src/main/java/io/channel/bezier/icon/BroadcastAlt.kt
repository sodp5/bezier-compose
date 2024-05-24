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

val BezierIcon.BroadcastAlt: ImageVector
    get() {
        return io.channel.bezier.icon._broadcastAlt ?: ImageVector.Builder(
                name = "BroadcastAlt",
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
                moveTo(6.3432f, 17.6568f)
                curveTo(3.219f, 14.5326f, 3.219f, 9.4673f, 6.3432f, 6.3431f)
                curveTo(6.7337f, 5.9526f, 6.7337f, 5.3194f, 6.3432f, 4.9289f)
                curveTo(5.9526f, 4.5384f, 5.3195f, 4.5384f, 4.9289f, 4.9289f)
                curveTo(1.0237f, 8.8341f, 1.0237f, 15.1658f, 4.9289f, 19.071f)
                curveTo(5.3195f, 19.4615f, 5.9526f, 19.4615f, 6.3432f, 19.071f)
                curveTo(6.7337f, 18.6805f, 6.7337f, 18.0473f, 6.3432f, 17.6568f)
                close()
                moveTo(19.0711f, 4.9289f)
                curveTo(18.6805f, 4.5384f, 18.0474f, 4.5384f, 17.6569f, 4.9289f)
                curveTo(17.2663f, 5.3194f, 17.2663f, 5.9526f, 17.6569f, 6.3431f)
                curveTo(20.781f, 9.4673f, 20.781f, 14.5326f, 17.6569f, 17.6568f)
                curveTo(17.2663f, 18.0473f, 17.2663f, 18.6805f, 17.6569f, 19.071f)
                curveTo(18.0474f, 19.4615f, 18.6805f, 19.4615f, 19.0711f, 19.071f)
                curveTo(22.9763f, 15.1658f, 22.9763f, 8.8341f, 19.0711f, 4.9289f)
                close()
                moveTo(9.1716f, 9.1715f)
                curveTo(7.6095f, 10.7336f, 7.6095f, 13.2663f, 9.1716f, 14.8284f)
                curveTo(9.5621f, 15.2189f, 9.5621f, 15.8521f, 9.1716f, 16.2426f)
                curveTo(8.781f, 16.6331f, 8.1479f, 16.6331f, 7.7573f, 16.2426f)
                curveTo(5.4142f, 13.8994f, 5.4142f, 10.1005f, 7.7573f, 7.7573f)
                curveTo(8.1479f, 7.3668f, 8.781f, 7.3668f, 9.1716f, 7.7573f)
                curveTo(9.5621f, 8.1478f, 9.5621f, 8.781f, 9.1716f, 9.1715f)
                close()
                moveTo(14.8284f, 7.7573f)
                curveTo(15.2189f, 7.3668f, 15.8521f, 7.3668f, 16.2426f, 7.7573f)
                curveTo(18.5858f, 10.1005f, 18.5858f, 13.8994f, 16.2426f, 16.2426f)
                curveTo(15.8521f, 16.6331f, 15.2189f, 16.6331f, 14.8284f, 16.2426f)
                curveTo(14.4379f, 15.8521f, 14.4379f, 15.2189f, 14.8284f, 14.8284f)
                curveTo(16.3905f, 13.2663f, 16.3905f, 10.7336f, 14.8284f, 9.1715f)
                curveTo(14.4379f, 8.781f, 14.4379f, 8.1478f, 14.8284f, 7.7573f)
                close()
                moveTo(13.0f, 13.7324f)
                curveTo(13.5978f, 13.3866f, 14.0f, 12.7402f, 14.0f, 11.9999f)
                curveTo(14.0f, 10.8954f, 13.1046f, 10.0f, 12.0f, 10.0f)
                curveTo(10.8954f, 10.0f, 10.0f, 10.8954f, 10.0f, 11.9999f)
                curveTo(10.0f, 12.7402f, 10.4022f, 13.3866f, 11.0f, 13.7324f)
                lineTo(11.0f, 21.0f)
                curveTo(11.0f, 21.5523f, 11.4477f, 22.0f, 12.0f, 22.0f)
                curveTo(12.5523f, 22.0f, 13.0f, 21.5523f, 13.0f, 21.0f)
                lineTo(13.0f, 13.7324f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._broadcastAlt = it
        }
    }

private var _broadcastAlt: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BroadcastAltIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.BroadcastAlt,
            contentDescription = null,
    )
}
