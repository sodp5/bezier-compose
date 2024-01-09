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

val BezierIcon.Home: ImageVector
    get() {
        return _home ?: ImageVector.Builder(
                name = "Home",
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
                moveTo(12.6139f, 2.4775f)
                curveTo(12.2528f, 2.1966f, 11.7472f, 2.1966f, 11.3861f, 2.4775f)
                lineTo(3.7721f, 8.3995f)
                curveTo(3.2849f, 8.7784f, 3.0f, 9.361f, 3.0f, 9.9782f)
                lineTo(3.0f, 20.0f)
                curveTo(3.0f, 20.5523f, 3.4477f, 21.0f, 4.0f, 21.0f)
                lineTo(10.0f, 21.0f)
                curveTo(10.5523f, 21.0f, 11.0f, 20.5523f, 11.0f, 20.0f)
                lineTo(11.0f, 15.0f)
                curveTo(11.0f, 14.4477f, 11.4477f, 14.0f, 12.0f, 14.0f)
                curveTo(12.5523f, 14.0f, 13.0f, 14.4477f, 13.0f, 15.0f)
                lineTo(13.0f, 20.0f)
                curveTo(13.0f, 20.5523f, 13.4477f, 21.0f, 14.0f, 21.0f)
                lineTo(20.0f, 21.0f)
                curveTo(20.5523f, 21.0f, 21.0f, 20.5523f, 21.0f, 20.0f)
                lineTo(21.0f, 9.9782f)
                curveTo(21.0f, 9.361f, 20.7151f, 8.7784f, 20.2279f, 8.3995f)
                lineTo(12.6139f, 2.4775f)
                close()
                moveTo(9.0f, 19.0f)
                lineTo(9.0f, 15.0f)
                curveTo(9.0f, 13.3431f, 10.3431f, 12.0f, 12.0f, 12.0f)
                curveTo(13.6569f, 12.0f, 15.0f, 13.3431f, 15.0f, 15.0f)
                lineTo(15.0f, 19.0f)
                lineTo(19.0f, 19.0f)
                lineTo(19.0f, 9.9782f)
                lineTo(12.0f, 4.5337f)
                lineTo(5.0f, 10.0f)
                lineTo(5.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                close()
            }
        }.build().also {
            _home = it
        }
    }

private var _home: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HomeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Home,
            contentDescription = null,
    )
}