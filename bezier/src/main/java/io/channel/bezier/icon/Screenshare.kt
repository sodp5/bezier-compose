@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon

val BezierIcon.Screenshare: ImageVector
    get() {
        return io.channel.bezier.icon._screenshare ?: ImageVector.Builder(
                name = "Screenshare",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(2.0f, 8.0f)
                curveTo(2.0f, 5.7909f, 3.7909f, 4.0f, 6.0f, 4.0f)
                lineTo(18.0f, 4.0f)
                curveTo(20.2091f, 4.0f, 22.0f, 5.7909f, 22.0f, 8.0f)
                lineTo(22.0f, 16.0f)
                curveTo(22.0f, 18.2091f, 20.2091f, 20.0f, 18.0f, 20.0f)
                lineTo(15.5f, 20.0f)
                curveTo(14.9477f, 20.0f, 14.5f, 19.5523f, 14.5f, 19.0f)
                curveTo(14.5f, 18.4477f, 14.9477f, 18.0f, 15.5f, 18.0f)
                lineTo(18.0f, 18.0f)
                curveTo(19.1046f, 18.0f, 20.0f, 17.1046f, 20.0f, 16.0f)
                lineTo(20.0f, 8.0f)
                curveTo(20.0f, 6.8954f, 19.1046f, 6.0f, 18.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                curveTo(4.8954f, 6.0f, 4.0f, 6.8954f, 4.0f, 8.0f)
                lineTo(4.0f, 16.0f)
                curveTo(4.0f, 17.1046f, 4.8954f, 18.0f, 6.0f, 18.0f)
                lineTo(8.5f, 18.0f)
                curveTo(9.0523f, 18.0f, 9.5f, 18.4477f, 9.5f, 19.0f)
                curveTo(9.5f, 19.5523f, 9.0523f, 20.0f, 8.5f, 20.0f)
                lineTo(6.0f, 20.0f)
                curveTo(3.7909f, 20.0f, 2.0f, 18.2091f, 2.0f, 16.0f)
                lineTo(2.0f, 8.0f)
                close()
                moveTo(13.0f, 11.4142f)
                lineTo(13.0f, 19.0f)
                curveTo(13.0f, 19.5523f, 12.5523f, 20.0f, 12.0f, 20.0f)
                curveTo(11.4477f, 20.0f, 11.0f, 19.5523f, 11.0f, 19.0f)
                lineTo(11.0f, 11.4142f)
                lineTo(8.7071f, 13.7071f)
                curveTo(8.3166f, 14.0976f, 7.6834f, 14.0976f, 7.2929f, 13.7071f)
                curveTo(6.9024f, 13.3166f, 6.9024f, 12.6834f, 7.2929f, 12.2929f)
                lineTo(10.5858f, 9.0f)
                curveTo(11.3668f, 8.219f, 12.6332f, 8.219f, 13.4142f, 9.0f)
                lineTo(16.7071f, 12.2929f)
                curveTo(17.0976f, 12.6834f, 17.0976f, 13.3166f, 16.7071f, 13.7071f)
                curveTo(16.3166f, 14.0976f, 15.6834f, 14.0976f, 15.2929f, 13.7071f)
                lineTo(13.0f, 11.4142f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._screenshare = it
        }
    }

private var _screenshare: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ScreenshareIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Screenshare,
            contentDescription = null,
    )
}
