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

val BezierIcon.KeyboardHide: ImageVector
    get() {
        return _keyboardHide ?: ImageVector.Builder(
                name = "KeyboardHide",
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
                moveTo(4.0f, 15.0f)
                lineTo(20.0f, 15.0f)
                lineTo(20.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                lineTo(4.0f, 15.0f)
                close()
                moveTo(20.5f, 3.0f)
                lineTo(3.5f, 3.0f)
                curveTo(2.673f, 3.0f, 2.0f, 3.673f, 2.0f, 4.5f)
                lineTo(2.0f, 15.5f)
                curveTo(2.0f, 16.327f, 2.673f, 17.0f, 3.5f, 17.0f)
                lineTo(20.5f, 17.0f)
                curveTo(21.327f, 17.0f, 22.0f, 16.327f, 22.0f, 15.5f)
                lineTo(22.0f, 4.5f)
                curveTo(22.0f, 3.673f, 21.327f, 3.0f, 20.5f, 3.0f)
                close()
                moveTo(6.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                lineTo(6.0f, 8.0f)
                close()
                moveTo(18.0f, 8.0f)
                lineTo(16.0f, 8.0f)
                lineTo(16.0f, 6.0f)
                lineTo(18.0f, 6.0f)
                lineTo(18.0f, 8.0f)
                close()
                moveTo(9.333f, 8.0f)
                lineTo(11.333f, 8.0f)
                lineTo(11.333f, 6.0f)
                lineTo(9.333f, 6.0f)
                lineTo(9.333f, 8.0f)
                close()
                moveTo(14.666f, 8.0f)
                lineTo(12.666f, 8.0f)
                lineTo(12.666f, 6.0f)
                lineTo(14.666f, 6.0f)
                lineTo(14.666f, 8.0f)
                close()
                moveTo(6.0f, 11.0f)
                lineTo(8.0f, 11.0f)
                lineTo(8.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                lineTo(6.0f, 11.0f)
                close()
                moveTo(18.0f, 11.0f)
                lineTo(16.0f, 11.0f)
                lineTo(16.0f, 9.0f)
                lineTo(18.0f, 9.0f)
                lineTo(18.0f, 11.0f)
                close()
                moveTo(9.333f, 11.0f)
                lineTo(11.333f, 11.0f)
                lineTo(11.333f, 9.0f)
                lineTo(9.333f, 9.0f)
                lineTo(9.333f, 11.0f)
                close()
                moveTo(14.666f, 11.0f)
                lineTo(12.666f, 11.0f)
                lineTo(12.666f, 9.0f)
                lineTo(14.666f, 9.0f)
                lineTo(14.666f, 11.0f)
                close()
                moveTo(8.0f, 14.0f)
                lineTo(16.0f, 14.0f)
                lineTo(16.0f, 12.02f)
                lineTo(8.0f, 12.02f)
                lineTo(8.0f, 14.0f)
                close()
                moveTo(9.3939f, 17.8309f)
                curveTo(8.8863f, 17.6133f, 8.2984f, 17.8485f, 8.0809f, 18.3561f)
                curveTo(7.8633f, 18.8637f, 8.0985f, 19.4516f, 8.6061f, 19.6692f)
                lineTo(12.1061f, 21.1692f)
                curveTo(12.3576f, 21.277f, 12.6424f, 21.277f, 12.8939f, 21.1692f)
                lineTo(16.3939f, 19.6692f)
                curveTo(16.9016f, 19.4516f, 17.1367f, 18.8637f, 16.9192f, 18.3561f)
                curveTo(16.7016f, 17.8485f, 16.1137f, 17.6133f, 15.6061f, 17.8309f)
                lineTo(12.5f, 19.162f)
                lineTo(9.3939f, 17.8309f)
                close()
            }
        }.build().also {
            _keyboardHide = it
        }
    }

private var _keyboardHide: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun KeyboardHideIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.KeyboardHide,
            contentDescription = null,
    )
}