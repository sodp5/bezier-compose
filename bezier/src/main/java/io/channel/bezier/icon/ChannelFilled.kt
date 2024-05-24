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

val BezierIcon.ChannelFilled: ImageVector
    get() {
        return _channelFilled ?: ImageVector.Builder(
                name = "ChannelFilled",
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
                moveTo(15.2134f, 14.0649f)
                curveTo(14.3684f, 14.0649f, 14.0154f, 13.4549f, 14.0154f, 11.9599f)
                curveTo(14.0154f, 10.4649f, 14.3684f, 9.8549f, 15.2134f, 9.8549f)
                curveTo(16.0584f, 9.8549f, 16.4114f, 10.4649f, 16.4114f, 11.9599f)
                curveTo(16.4114f, 13.4549f, 16.0584f, 14.0649f, 15.2134f, 14.0649f)
                close()
                moveTo(8.7864f, 14.0649f)
                curveTo(7.9414f, 14.0649f, 7.5884f, 13.4549f, 7.5884f, 11.9599f)
                curveTo(7.5884f, 10.4649f, 7.9414f, 9.8549f, 8.7864f, 9.8549f)
                curveTo(9.6314f, 9.8549f, 9.9844f, 10.4649f, 9.9844f, 11.9599f)
                curveTo(9.9844f, 13.4549f, 9.6314f, 14.0649f, 8.7864f, 14.0649f)
                close()
                moveTo(20.7944f, 18.3819f)
                curveTo(20.5844f, 17.7519f, 20.6374f, 17.0659f, 20.9364f, 16.4729f)
                curveTo(21.7894f, 14.7799f, 22.1794f, 12.8149f, 21.9214f, 10.7369f)
                curveTo(21.3634f, 6.2509f, 17.7454f, 2.6239f, 13.2574f, 2.0769f)
                curveTo(6.7494f, 1.2829f, 1.2834f, 6.7489f, 2.0764f, 13.2569f)
                curveTo(2.6244f, 17.7449f, 6.2514f, 21.3639f, 10.7374f, 21.9209f)
                curveTo(12.8154f, 22.1799f, 14.7794f, 21.7889f, 16.4724f, 20.9369f)
                curveTo(17.0664f, 20.6379f, 17.7524f, 20.5839f, 18.3824f, 20.7939f)
                lineTo(20.4194f, 21.4729f)
                curveTo(21.0704f, 21.6899f, 21.6904f, 21.0699f, 21.4734f, 20.4189f)
                lineTo(20.7944f, 18.3819f)
                close()
            }
        }.build().also {
            _channelFilled = it
        }
    }

private var _channelFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChannelFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ChannelFilled,
            contentDescription = null,
    )
}
