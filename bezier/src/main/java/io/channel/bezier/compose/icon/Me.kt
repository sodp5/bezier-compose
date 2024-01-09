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

val BezierIcon.Me: ImageVector
    get() {
        return _me ?: ImageVector.Builder(
                name = "Me",
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
                moveTo(20.0002f, 8.5001f)
                curveTo(20.0002f, 8.7761f, 19.7762f, 9.0001f, 19.5002f, 9.0001f)
                lineTo(16.0002f, 9.0001f)
                lineTo(16.0002f, 11.0001f)
                lineTo(18.5002f, 11.0001f)
                curveTo(18.7762f, 11.0001f, 19.0002f, 11.2241f, 19.0002f, 11.5001f)
                lineTo(19.0002f, 12.5001f)
                curveTo(19.0002f, 12.7761f, 18.7762f, 13.0001f, 18.5002f, 13.0001f)
                lineTo(16.0002f, 13.0001f)
                lineTo(16.0002f, 15.0001f)
                lineTo(19.5002f, 15.0001f)
                curveTo(19.7762f, 15.0001f, 20.0002f, 15.2241f, 20.0002f, 15.5001f)
                lineTo(20.0002f, 16.5001f)
                curveTo(20.0002f, 16.7761f, 19.7762f, 17.0001f, 19.5002f, 17.0001f)
                lineTo(14.5002f, 17.0001f)
                curveTo(14.2242f, 17.0001f, 14.0002f, 16.7761f, 14.0002f, 16.5001f)
                lineTo(14.0002f, 13.0001f)
                lineTo(14.0002f, 11.0001f)
                lineTo(14.0002f, 9.0001f)
                lineTo(14.0002f, 7.5001f)
                curveTo(14.0002f, 7.2241f, 14.2242f, 7.0001f, 14.5002f, 7.0001f)
                lineTo(19.5002f, 7.0001f)
                curveTo(19.7762f, 7.0001f, 20.0002f, 7.2241f, 20.0002f, 7.5001f)
                lineTo(20.0002f, 8.5001f)
                close()
                moveTo(13.0002f, 16.5001f)
                curveTo(13.0002f, 16.7761f, 12.7762f, 17.0001f, 12.5002f, 17.0001f)
                lineTo(11.5002f, 17.0001f)
                curveTo(11.2242f, 17.0001f, 11.0002f, 16.7761f, 11.0002f, 16.5001f)
                lineTo(11.0002f, 10.7981f)
                lineTo(8.9372f, 13.8551f)
                curveTo(8.7332f, 14.1581f, 8.2822f, 14.1461f, 8.0942f, 13.8321f)
                lineTo(6.0002f, 10.3351f)
                lineTo(6.0002f, 16.5001f)
                curveTo(6.0002f, 16.7761f, 5.7762f, 17.0001f, 5.5002f, 17.0001f)
                lineTo(4.5002f, 17.0001f)
                curveTo(4.2242f, 17.0001f, 4.0002f, 16.7761f, 4.0002f, 16.5001f)
                lineTo(4.0002f, 7.5001f)
                curveTo(4.0002f, 7.2241f, 4.2242f, 7.0001f, 4.5002f, 7.0001f)
                lineTo(5.7222f, 7.0021f)
                curveTo(5.8952f, 7.0021f, 6.0552f, 7.0921f, 6.1462f, 7.2381f)
                lineTo(8.4982f, 11.0401f)
                lineTo(10.8542f, 7.2381f)
                curveTo(10.9442f, 7.0911f, 11.1052f, 7.0011f, 11.2782f, 7.0011f)
                lineTo(12.5002f, 7.0001f)
                curveTo(12.7762f, 7.0001f, 13.0002f, 7.2241f, 13.0002f, 7.5001f)
                lineTo(13.0002f, 16.5001f)
                close()
                moveTo(20.0002f, 5.0001f)
                lineTo(4.0002f, 5.0001f)
                curveTo(2.8962f, 5.0001f, 2.0002f, 5.8961f, 2.0002f, 7.0001f)
                lineTo(2.0002f, 17.0001f)
                curveTo(2.0002f, 18.1041f, 2.8962f, 19.0001f, 4.0002f, 19.0001f)
                lineTo(20.0002f, 19.0001f)
                curveTo(21.1042f, 19.0001f, 22.0002f, 18.1041f, 22.0002f, 17.0001f)
                lineTo(22.0002f, 7.0001f)
                curveTo(22.0002f, 5.8961f, 21.1042f, 5.0001f, 20.0002f, 5.0001f)
                close()
            }
        }.build().also {
            _me = it
        }
    }

private var _me: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun MeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Me,
            contentDescription = null,
    )
}