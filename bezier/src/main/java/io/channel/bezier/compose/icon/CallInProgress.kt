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

val BezierIcon.CallInProgress: ImageVector
    get() {
        return _callInProgress ?: ImageVector.Builder(
                name = "CallInProgress",
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
                moveTo(14.0f, 2.0f)
                curveTo(13.4477f, 2.0f, 13.0f, 2.4477f, 13.0f, 3.0f)
                curveTo(13.0f, 3.5523f, 13.4477f, 4.0f, 14.0f, 4.0f)
                curveTo(17.3137f, 4.0f, 20.0f, 6.6863f, 20.0f, 10.0f)
                curveTo(20.0f, 10.5523f, 20.4477f, 11.0f, 21.0f, 11.0f)
                curveTo(21.5523f, 11.0f, 22.0f, 10.5523f, 22.0f, 10.0f)
                curveTo(22.0f, 5.5817f, 18.4183f, 2.0f, 14.0f, 2.0f)
                close()
                moveTo(4.2f, 4.9549f)
                curveTo(2.5859f, 6.569f, 2.5859f, 11.0883f, 7.7509f, 16.2532f)
                curveTo(12.9158f, 21.4182f, 17.4352f, 21.4182f, 19.0492f, 19.8042f)
                curveTo(20.0176f, 18.8357f, 20.2804f, 17.4199f, 19.6948f, 16.5761f)
                curveTo(19.1783f, 15.8013f, 17.7207f, 14.6392f, 16.4667f, 14.6392f)
                curveTo(15.7105f, 14.6392f, 15.0602f, 15.1971f, 14.5243f, 15.6569f)
                curveTo(14.1451f, 15.9822f, 13.8232f, 16.2584f, 13.5615f, 16.2532f)
                curveTo(12.9298f, 16.2407f, 11.2864f, 15.5461f, 9.8722f, 14.1319f)
                curveTo(8.458f, 12.7177f, 7.7634f, 11.0743f, 7.7509f, 10.4427f)
                curveTo(7.7457f, 10.181f, 8.0219f, 9.859f, 8.3472f, 9.4799f)
                curveTo(8.807f, 8.9439f, 9.3649f, 8.2936f, 9.3649f, 7.5374f)
                curveTo(9.3649f, 6.2835f, 8.2028f, 4.8258f, 7.4281f, 4.3093f)
                curveTo(6.5842f, 3.7237f, 5.1684f, 3.9865f, 4.2f, 4.9549f)
                close()
                moveTo(13.0f, 7.0f)
                curveTo(13.0f, 6.4477f, 13.4477f, 6.0f, 14.0f, 6.0f)
                curveTo(16.2091f, 6.0f, 18.0f, 7.7909f, 18.0f, 10.0f)
                curveTo(18.0f, 10.5523f, 17.5523f, 11.0f, 17.0f, 11.0f)
                curveTo(16.4477f, 11.0f, 16.0f, 10.5523f, 16.0f, 10.0f)
                curveTo(16.0f, 8.8954f, 15.1046f, 8.0f, 14.0f, 8.0f)
                curveTo(13.4477f, 8.0f, 13.0f, 7.5523f, 13.0f, 7.0f)
                close()
            }
        }.build().also {
            _callInProgress = it
        }
    }

private var _callInProgress: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CallInProgressIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.CallInProgress,
            contentDescription = null,
    )
}