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

val BezierIcon.FastForward: ImageVector
    get() {
        return io.channel.bezier.icon._fastForward ?: ImageVector.Builder(
                name = "FastForward",
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
                moveTo(12.0f, 13.0336f)
                lineTo(3.1658f, 18.9187f)
                curveTo(2.6674f, 19.2508f, 2.0f, 18.8934f, 2.0f, 18.2945f)
                lineTo(2.0f, 5.7056f)
                curveTo(2.0f, 5.1067f, 2.6674f, 4.7494f, 3.1658f, 5.0814f)
                lineTo(12.0f, 10.9666f)
                lineTo(12.0f, 5.7056f)
                curveTo(12.0f, 5.1067f, 12.6674f, 4.7494f, 13.1658f, 5.0814f)
                lineTo(22.6144f, 11.3759f)
                curveTo(23.06f, 11.6727f, 23.06f, 12.3274f, 22.6144f, 12.6243f)
                lineTo(13.1658f, 18.9187f)
                curveTo(12.6674f, 19.2508f, 12.0f, 18.8934f, 12.0f, 18.2945f)
                lineTo(12.0f, 13.0336f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._fastForward = it
        }
    }

private var _fastForward: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun FastForwardIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.FastForward,
            contentDescription = null,
    )
}
