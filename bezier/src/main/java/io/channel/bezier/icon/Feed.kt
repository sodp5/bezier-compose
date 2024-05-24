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

val BezierIcon.Feed: ImageVector
    get() {
        return io.channel.bezier.icon._feed ?: ImageVector.Builder(
                name = "Feed",
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
                moveTo(5.0f, 3.0f)
                curveTo(3.3431f, 3.0f, 2.0f, 4.3432f, 2.0f, 6.0f)
                lineTo(2.0f, 12.0f)
                curveTo(2.0f, 13.6569f, 3.3431f, 15.0f, 5.0f, 15.0f)
                lineTo(19.0f, 15.0f)
                curveTo(20.6569f, 15.0f, 22.0f, 13.6569f, 22.0f, 12.0f)
                lineTo(22.0f, 6.0f)
                curveTo(22.0f, 4.3432f, 20.6569f, 3.0f, 19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                close()
                moveTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                curveTo(4.4477f, 5.0f, 4.0f, 5.4477f, 4.0f, 6.0f)
                lineTo(4.0f, 12.0f)
                curveTo(4.0f, 12.5523f, 4.4477f, 13.0f, 5.0f, 13.0f)
                lineTo(19.0f, 13.0f)
                curveTo(19.5523f, 13.0f, 20.0f, 12.5523f, 20.0f, 12.0f)
                lineTo(20.0f, 6.0f)
                curveTo(20.0f, 5.4477f, 19.5523f, 5.0f, 19.0f, 5.0f)
                close()
            }

            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(4.0f, 16.0f)
                curveTo(4.0f, 17.1046f, 4.8954f, 18.0f, 6.0f, 18.0f)
                lineTo(18.0f, 18.0f)
                curveTo(19.1046f, 18.0f, 20.0f, 17.1046f, 20.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                close()
                moveTo(18.0f, 19.0f)
                curveTo(18.0f, 20.1046f, 17.1046f, 21.0f, 16.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                curveTo(6.8954f, 21.0f, 6.0f, 20.1046f, 6.0f, 19.0f)
                lineTo(18.0f, 19.0f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._feed = it
        }
    }

private var _feed: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun FeedIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Feed,
            contentDescription = null,
    )
}
