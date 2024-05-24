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

val BezierIcon.Refresh: ImageVector
    get() {
        return io.channel.bezier.icon._refresh ?: ImageVector.Builder(
                name = "Refresh",
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
                moveTo(21.0f, 12.0f)
                curveTo(20.4477f, 12.0f, 20.0066f, 12.45f, 19.9381f, 12.998f)
                curveTo(19.4453f, 16.9398f, 16.0731f, 20.0f, 12.0f, 20.0f)
                curveTo(7.589f, 20.0f, 4.0f, 16.411f, 4.0f, 12.0f)
                curveTo(4.0f, 7.589f, 7.589f, 4.0f, 12.0f, 4.0f)
                curveTo(14.117f, 4.0f, 16.107f, 4.819f, 17.613f, 6.303f)
                lineTo(15.52f, 8.396f)
                curveTo(15.205f, 8.711f, 15.427f, 9.25f, 15.873f, 9.25f)
                lineTo(21.5f, 9.25f)
                curveTo(21.776f, 9.25f, 22.0f, 9.026f, 22.0f, 8.75f)
                lineTo(22.0f, 3.123f)
                curveTo(22.0f, 2.677f, 21.461f, 2.455f, 21.146f, 2.77f)
                lineTo(19.027f, 4.889f)
                curveTo(17.143f, 3.027f, 14.651f, 2.0f, 12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                curveTo(2.0f, 17.514f, 6.486f, 22.0f, 12.0f, 22.0f)
                curveTo(17.177f, 22.0f, 21.4479f, 18.0455f, 21.9505f, 12.9986f)
                curveTo(22.0053f, 12.449f, 21.5523f, 12.0f, 21.0f, 12.0f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._refresh = it
        }
    }

private var _refresh: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun RefreshIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Refresh,
            contentDescription = null,
    )
}
