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
import io.channel.bezier.BezierIcons

val BezierIcons.Sprout: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _sprout ?: ImageVector.Builder(
                    name = "Sprout",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(13.0f, 15.0f)
                    lineTo(13.0f, 20.0f)
                    curveTo(13.0f, 20.5523f, 12.5523f, 21.0f, 12.0f, 21.0f)
                    curveTo(11.4477f, 21.0f, 11.0f, 20.5523f, 11.0f, 20.0f)
                    lineTo(11.0f, 17.0f)
                    lineTo(10.0f, 17.0f)
                    curveTo(5.58172f, 17.0f, 2.0f, 13.4183f, 2.0f, 9.0f)
                    lineTo(2.0f, 7.0f)
                    curveTo(2.0f, 6.44772f, 2.44772f, 6.0f, 3.0f, 6.0f)
                    lineTo(5.0f, 6.0f)
                    curveTo(7.65891f, 6.0f, 10.0149f, 7.29716f, 11.4695f, 9.29318f)
                    curveTo(12.579f, 6.20699f, 15.5318f, 4.0f, 19.0f, 4.0f)
                    lineTo(21.0f, 4.0f)
                    curveTo(21.5523f, 4.0f, 22.0f, 4.44772f, 22.0f, 5.0f)
                    lineTo(22.0f, 7.0f)
                    curveTo(22.0f, 11.4183f, 18.4183f, 15.0f, 14.0f, 15.0f)
                    lineTo(13.0f, 15.0f)
                    close()
                    moveTo(10.0f, 15.0f)
                    lineTo(11.0f, 15.0f)
                    lineTo(11.0f, 14.0f)
                    curveTo(11.0f, 10.6863f, 8.31371f, 8.0f, 5.0f, 8.0f)
                    lineTo(4.0f, 8.0f)
                    lineTo(4.0f, 9.0f)
                    curveTo(4.0f, 12.3137f, 6.68629f, 15.0f, 10.0f, 15.0f)
                    close()
                    moveTo(13.0f, 13.0f)
                    lineTo(14.0f, 13.0f)
                    curveTo(17.3137f, 13.0f, 20.0f, 10.3137f, 20.0f, 7.0f)
                    lineTo(20.0f, 6.0f)
                    lineTo(19.0f, 6.0f)
                    curveTo(15.6863f, 6.0f, 13.0f, 8.68629f, 13.0f, 12.0f)
                    lineTo(13.0f, 13.0f)
                    close()
                }
            }.build().also {
                _sprout = it
            }
    }


private var _sprout: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SproutIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Sprout.imageVector,
            contentDescription = null,
    )
}
