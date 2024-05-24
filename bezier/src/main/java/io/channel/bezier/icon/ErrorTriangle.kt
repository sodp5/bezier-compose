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

val BezierIcon.ErrorTriangle: ImageVector
    get() {
        return io.channel.bezier.icon._errorTriangle ?: ImageVector.Builder(
                name = "ErrorTriangle",
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
                moveTo(20.1578f, 16.7369f)
                lineTo(13.2914f, 5.1168f)
                curveTo(12.7108f, 4.1343f, 11.2892f, 4.1343f, 10.7086f, 5.1168f)
                lineTo(3.8422f, 16.7369f)
                curveTo(3.2513f, 17.7368f, 3.9721f, 19.0f, 5.1336f, 19.0f)
                lineTo(18.8664f, 19.0f)
                curveTo(20.0279f, 19.0f, 20.7487f, 17.7368f, 20.1578f, 16.7369f)
                close()
                moveTo(15.0132f, 4.0993f)
                curveTo(13.6585f, 1.8067f, 10.3415f, 1.8067f, 8.9868f, 4.0993f)
                lineTo(2.1203f, 15.7194f)
                curveTo(0.7416f, 18.0526f, 2.4235f, 21.0f, 5.1336f, 21.0f)
                lineTo(18.8664f, 21.0f)
                curveTo(21.5765f, 21.0f, 23.2584f, 18.0526f, 21.8797f, 15.7195f)
                lineTo(15.0132f, 4.0993f)
                close()
                moveTo(12.0005f, 17.8f)
                curveTo(11.2278f, 17.8f, 10.6f, 17.1733f, 10.6f, 16.4005f)
                curveTo(10.6f, 15.6267f, 11.2278f, 15.0f, 12.0005f, 15.0f)
                curveTo(12.7733f, 15.0f, 13.4f, 15.6267f, 13.4f, 16.4005f)
                curveTo(13.4f, 17.1733f, 12.7733f, 17.8f, 12.0005f, 17.8f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(11.4477f, 7.0f, 11.0f, 7.4477f, 11.0f, 8.0f)
                lineTo(11.0f, 13.0f)
                curveTo(11.0f, 13.5523f, 11.4477f, 14.0f, 12.0f, 14.0f)
                curveTo(12.5523f, 14.0f, 13.0f, 13.5523f, 13.0f, 13.0f)
                lineTo(13.0f, 8.0f)
                curveTo(13.0f, 7.4477f, 12.5523f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._errorTriangle = it
        }
    }

private var _errorTriangle: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ErrorTriangleIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ErrorTriangle,
            contentDescription = null,
    )
}
