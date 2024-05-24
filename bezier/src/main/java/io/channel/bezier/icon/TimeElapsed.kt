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

val BezierIcon.TimeElapsed: ImageVector
    get() {
        return io.channel.bezier.icon._timeElapsed ?: ImageVector.Builder(
                name = "TimeElapsed",
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
                moveTo(12.0002f, 2.0001f)
                lineTo(11.0002f, 2.0001f)
                lineTo(11.0002f, 6.0001f)
                lineTo(13.0002f, 6.0001f)
                lineTo(13.0002f, 4.0621f)
                curveTo(16.9412f, 4.5561f, 20.0002f, 7.9281f, 20.0002f, 12.0001f)
                curveTo(20.0002f, 16.4111f, 16.4112f, 20.0001f, 12.0002f, 20.0001f)
                curveTo(7.5892f, 20.0001f, 4.0002f, 16.4111f, 4.0002f, 12.0001f)
                curveTo(4.0002f, 10.2001f, 4.5902f, 8.4911f, 5.6792f, 7.0941f)
                lineTo(10.0742f, 11.4881f)
                curveTo(10.0302f, 11.6521f, 9.9992f, 11.8221f, 9.9992f, 12.0001f)
                curveTo(9.9992f, 13.1041f, 10.8952f, 14.0001f, 11.9992f, 14.0001f)
                curveTo(13.1042f, 14.0001f, 13.9992f, 13.1041f, 13.9992f, 12.0001f)
                curveTo(13.9992f, 10.8961f, 13.1042f, 10.0001f, 11.9992f, 10.0001f)
                curveTo(11.8212f, 10.0001f, 11.6522f, 10.0311f, 11.4882f, 10.0741f)
                lineTo(5.6362f, 4.2211f)
                lineTo(4.9292f, 4.9291f)
                curveTo(3.0402f, 6.8181f, 2.0002f, 9.3291f, 2.0002f, 12.0001f)
                curveTo(2.0002f, 17.5141f, 6.4862f, 22.0001f, 12.0002f, 22.0001f)
                curveTo(17.5142f, 22.0001f, 22.0002f, 17.5141f, 22.0002f, 12.0001f)
                curveTo(22.0002f, 6.4861f, 17.5142f, 2.0001f, 12.0002f, 2.0001f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._timeElapsed = it
        }
    }

private var _timeElapsed: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TimeElapsedIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.TimeElapsed,
            contentDescription = null,
    )
}
