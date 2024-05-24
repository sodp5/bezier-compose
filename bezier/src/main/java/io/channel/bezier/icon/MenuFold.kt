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

val BezierIcon.MenuFold: ImageVector
    get() {
        return _menuFold ?: ImageVector.Builder(
                name = "MenuFold",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(3.016f, 5.0001f)
                curveTo(3.016f, 5.5524f, 3.4637f, 6.0001f, 4.016f, 6.0001f)
                lineTo(20.016f, 6.0001f)
                curveTo(20.5683f, 6.0001f, 21.016f, 5.5524f, 21.016f, 5.0001f)
                curveTo(21.016f, 4.4478f, 20.5683f, 4.0001f, 20.016f, 4.0001f)
                lineTo(4.016f, 4.0001f)
                curveTo(3.4637f, 4.0001f, 3.016f, 4.4478f, 3.016f, 5.0001f)
                close()
                moveTo(3.0f, 12.0001f)
                curveTo(3.0f, 12.5524f, 3.4477f, 13.0001f, 4.0f, 13.0001f)
                lineTo(11.0f, 13.0001f)
                curveTo(11.5523f, 13.0001f, 12.0f, 12.5524f, 12.0f, 12.0001f)
                curveTo(12.0f, 11.4478f, 11.5523f, 11.0001f, 11.0f, 11.0001f)
                lineTo(4.0f, 11.0001f)
                curveTo(3.4477f, 11.0001f, 3.0f, 11.4478f, 3.0f, 12.0001f)
                close()
                moveTo(12.016f, 19.0001f)
                curveTo(12.016f, 19.5524f, 11.5683f, 20.0001f, 11.016f, 20.0001f)
                lineTo(4.016f, 20.0001f)
                curveTo(3.4637f, 20.0001f, 3.016f, 19.5524f, 3.016f, 19.0001f)
                curveTo(3.016f, 18.4478f, 3.4637f, 18.0001f, 4.016f, 18.0001f)
                lineTo(11.016f, 18.0001f)
                curveTo(11.5683f, 18.0001f, 12.016f, 18.4478f, 12.016f, 19.0001f)
                close()
            }
        }.build().also {
            _menuFold = it
        }
    }

private var _menuFold: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun MenuFoldIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.MenuFold,
            contentDescription = null,
    )
}
