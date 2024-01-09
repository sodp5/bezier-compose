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

val BezierIcon.Order: ImageVector
    get() {
        return _order ?: ImageVector.Builder(
                name = "Order",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(2.0f, 5.0f)
                curveTo(2.0f, 5.5523f, 2.4477f, 6.0f, 3.0f, 6.0f)
                lineTo(21.0f, 6.0f)
                curveTo(21.5523f, 6.0f, 22.0f, 5.5523f, 22.0f, 5.0f)
                curveTo(22.0f, 4.4477f, 21.5523f, 4.0f, 21.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                curveTo(2.4477f, 4.0f, 2.0f, 4.4477f, 2.0f, 5.0f)
                close()
                moveTo(5.0f, 12.0f)
                curveTo(5.0f, 12.5523f, 5.4477f, 13.0f, 6.0f, 13.0f)
                lineTo(18.0f, 13.0f)
                curveTo(18.5523f, 13.0f, 19.0f, 12.5523f, 19.0f, 12.0f)
                curveTo(19.0f, 11.4477f, 18.5523f, 11.0f, 18.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                curveTo(5.4477f, 11.0f, 5.0f, 11.4477f, 5.0f, 12.0f)
                close()
                moveTo(16.0f, 19.0f)
                curveTo(16.0f, 19.5523f, 15.5523f, 20.0f, 15.0f, 20.0f)
                lineTo(9.0f, 20.0f)
                curveTo(8.4477f, 20.0f, 8.0f, 19.5523f, 8.0f, 19.0f)
                curveTo(8.0f, 18.4477f, 8.4477f, 18.0f, 9.0f, 18.0f)
                lineTo(15.0f, 18.0f)
                curveTo(15.5523f, 18.0f, 16.0f, 18.4477f, 16.0f, 19.0f)
                close()
            }
        }.build().also {
            _order = it
        }
    }

private var _order: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun OrderIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Order,
            contentDescription = null,
    )
}