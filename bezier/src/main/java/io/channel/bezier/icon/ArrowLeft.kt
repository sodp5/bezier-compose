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

val BezierIcon.ArrowLeft: ImageVector
    get() {
        return io.channel.bezier.icon._arrowLeft ?: ImageVector.Builder(
                name = "ArrowLeft",
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
                moveTo(12.2667f, 20.7423f)
                curveTo(12.6691f, 20.3641f, 12.6888f, 19.7312f, 12.3106f, 19.3287f)
                lineTo(6.3632f, 13.0f)
                lineTo(20.0f, 13.0f)
                curveTo(20.5523f, 13.0f, 21.0f, 12.5523f, 21.0f, 12.0f)
                curveTo(21.0f, 11.4478f, 20.5523f, 11.0f, 20.0f, 11.0f)
                lineTo(6.3886f, 11.0f)
                lineTo(12.3106f, 4.6984f)
                curveTo(12.6888f, 4.2959f, 12.6691f, 3.663f, 12.2667f, 3.2848f)
                curveTo(11.8642f, 2.9066f, 11.2314f, 2.9263f, 10.8531f, 3.3287f)
                lineTo(3.6569f, 10.9863f)
                curveTo(3.1144f, 11.5637f, 3.1144f, 12.4634f, 3.6569f, 13.0408f)
                lineTo(10.8531f, 20.6984f)
                curveTo(11.2314f, 21.1008f, 11.8642f, 21.1205f, 12.2667f, 20.7423f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._arrowLeft = it
        }
    }

private var _arrowLeft: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowLeftIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ArrowLeft,
            contentDescription = null,
    )
}
