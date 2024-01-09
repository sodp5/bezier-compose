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

val BezierIcon.WeatherCloud: ImageVector
    get() {
        return _weatherCloud ?: ImageVector.Builder(
                name = "WeatherCloud",
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
                moveTo(6.019f, 10.2324f)
                curveTo(4.354f, 10.2324f, 3.0f, 11.5864f, 3.0f, 13.2524f)
                lineTo(3.0f, 13.5964f)
                curveTo(3.0f, 15.2614f, 4.354f, 16.6174f, 6.019f, 16.6174f)
                lineTo(16.921f, 16.6174f)
                curveTo(19.17f, 16.6174f, 21.0f, 14.7874f, 21.0f, 12.5374f)
                curveTo(21.0f, 10.2874f, 19.17f, 8.4574f, 16.921f, 8.4574f)
                lineTo(15.722f, 8.4574f)
                lineTo(15.433f, 7.9624f)
                curveTo(14.713f, 6.7334f, 13.448f, 6.0004f, 12.049f, 6.0004f)
                curveTo(10.116f, 6.0004f, 8.45f, 7.4514f, 8.172f, 9.3754f)
                lineTo(8.049f, 10.2324f)
                lineTo(6.019f, 10.2324f)
                close()
                moveTo(16.921f, 18.6174f)
                lineTo(6.019f, 18.6174f)
                curveTo(3.251f, 18.6174f, 1.0f, 16.3654f, 1.0f, 13.5964f)
                lineTo(1.0f, 13.2524f)
                curveTo(1.0f, 10.4844f, 3.251f, 8.2324f, 6.019f, 8.2324f)
                lineTo(6.382f, 8.2324f)
                curveTo(7.125f, 5.7674f, 9.424f, 4.0004f, 12.049f, 4.0004f)
                curveTo(13.938f, 4.0004f, 15.723f, 4.9284f, 16.834f, 6.4574f)
                lineTo(16.921f, 6.4574f)
                curveTo(20.273f, 6.4574f, 23.0f, 9.1844f, 23.0f, 12.5374f)
                curveTo(23.0f, 15.8894f, 20.273f, 18.6174f, 16.921f, 18.6174f)
                close()
            }
        }.build().also {
            _weatherCloud = it
        }
    }

private var _weatherCloud: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun WeatherCloudIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.WeatherCloud,
            contentDescription = null,
    )
}