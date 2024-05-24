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

val BezierIcon.CancelSmall: ImageVector
    get() {
        return io.channel.bezier.icon._cancelSmall ?: ImageVector.Builder(
                name = "CancelSmall",
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
                moveTo(16.9499f, 8.4644f)
                curveTo(17.3404f, 8.0739f, 17.3404f, 7.4408f, 16.9499f, 7.0504f)
                curveTo(16.5594f, 6.6599f, 15.9264f, 6.6599f, 15.5359f, 7.0504f)
                lineTo(11.9999f, 10.5864f)
                lineTo(8.4649f, 7.0505f)
                curveTo(8.0744f, 6.66f, 7.4413f, 6.66f, 7.0508f, 7.0505f)
                curveTo(6.6604f, 7.4409f, 6.6603f, 8.0739f, 7.0507f, 8.4644f)
                lineTo(10.5859f, 12.0004f)
                lineTo(7.0509f, 15.5354f)
                curveTo(6.6604f, 15.9259f, 6.6604f, 16.5589f, 7.0509f, 16.9494f)
                curveTo(7.4414f, 17.3399f, 8.0744f, 17.3399f, 8.4649f, 16.9494f)
                lineTo(11.9999f, 13.4144f)
                lineTo(15.5359f, 16.9496f)
                curveTo(15.9264f, 17.3399f, 16.5594f, 17.3399f, 16.9498f, 16.9495f)
                curveTo(17.3403f, 16.559f, 17.3403f, 15.9258f, 16.9497f, 15.5354f)
                lineTo(13.4139f, 12.0004f)
                lineTo(16.9499f, 8.4644f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._cancelSmall = it
        }
    }

private var _cancelSmall: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CancelSmallIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.CancelSmall,
            contentDescription = null,
    )
}
