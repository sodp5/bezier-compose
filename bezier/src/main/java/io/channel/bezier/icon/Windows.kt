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

val BezierIcon.Windows: ImageVector
    get() {
        return io.channel.bezier.icon._windows ?: ImageVector.Builder(
                name = "Windows",
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
                moveTo(21.0002f, 11.5733f)
                lineTo(21.0002f, 2.9663f)
                lineTo(11.2232f, 4.4103f)
                lineTo(11.2232f, 11.6143f)
                lineTo(21.0002f, 11.5733f)
                close()
                moveTo(3.0005f, 5.6262f)
                lineTo(10.3615f, 4.5382f)
                lineTo(10.3615f, 11.6172f)
                lineTo(3.0005f, 11.6482f)
                lineTo(3.0005f, 5.6262f)
                close()
                moveTo(3.0002f, 18.513f)
                lineTo(3.0002f, 12.421f)
                lineTo(10.3612f, 12.451f)
                lineTo(10.3612f, 19.544f)
                lineTo(3.0002f, 18.513f)
                close()
                moveTo(20.9998f, 21.0341f)
                lineTo(11.2228f, 19.6651f)
                lineTo(11.2228f, 12.4551f)
                lineTo(20.9998f, 12.4961f)
                lineTo(20.9998f, 21.0341f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._windows = it
        }
    }

private var _windows: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun WindowsIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Windows,
            contentDescription = null,
    )
}
