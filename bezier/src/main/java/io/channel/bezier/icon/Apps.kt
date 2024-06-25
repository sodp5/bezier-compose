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

val BezierIcons.Apps: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _apps ?: ImageVector.Builder(
                    name = "Apps",
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
                    moveTo(4.0002f, 3.00009f)
                    lineTo(10.0002f, 3.00009f)
                    curveTo(10.5522f, 3.00009f, 11.0002f, 3.44709f, 11.0002f, 4.00009f)
                    lineTo(11.0002f, 10.0001f)
                    curveTo(11.0002f, 10.5521f, 10.5522f, 11.0001f, 10.0002f, 11.0001f)
                    lineTo(4.0002f, 11.0001f)
                    curveTo(3.4482f, 11.0001f, 3.0002f, 10.5521f, 3.0002f, 10.0001f)
                    lineTo(3.0002f, 4.00009f)
                    curveTo(3.0002f, 3.44709f, 3.4482f, 3.00009f, 4.0002f, 3.00009f)
                    close()
                    moveTo(9.0002f, 9.00009f)
                    lineTo(5.0002f, 9.00009f)
                    lineTo(5.0002f, 5.00009f)
                    lineTo(9.0002f, 5.00009f)
                    lineTo(9.0002f, 9.00009f)
                    close()
                    moveTo(14.0002f, 3.00009f)
                    lineTo(20.0002f, 3.00009f)
                    curveTo(20.5522f, 3.00009f, 21.0002f, 3.44709f, 21.0002f, 4.00009f)
                    lineTo(21.0002f, 10.0001f)
                    curveTo(21.0002f, 10.5521f, 20.5522f, 11.0001f, 20.0002f, 11.0001f)
                    lineTo(14.0002f, 11.0001f)
                    curveTo(13.4482f, 11.0001f, 13.0002f, 10.5521f, 13.0002f, 10.0001f)
                    lineTo(13.0002f, 4.00009f)
                    curveTo(13.0002f, 3.44709f, 13.4482f, 3.00009f, 14.0002f, 3.00009f)
                    close()
                    moveTo(19.0002f, 9.00009f)
                    lineTo(15.0002f, 9.00009f)
                    lineTo(15.0002f, 5.00009f)
                    lineTo(19.0002f, 5.00009f)
                    lineTo(19.0002f, 9.00009f)
                    close()
                    moveTo(10.0002f, 13.0001f)
                    lineTo(4.0002f, 13.0001f)
                    curveTo(3.4482f, 13.0001f, 3.0002f, 13.4471f, 3.0002f, 14.0001f)
                    lineTo(3.0002f, 20.0001f)
                    curveTo(3.0002f, 20.5521f, 3.4482f, 21.0001f, 4.0002f, 21.0001f)
                    lineTo(10.0002f, 21.0001f)
                    curveTo(10.5522f, 21.0001f, 11.0002f, 20.5521f, 11.0002f, 20.0001f)
                    lineTo(11.0002f, 14.0001f)
                    curveTo(11.0002f, 13.4471f, 10.5522f, 13.0001f, 10.0002f, 13.0001f)
                    close()
                    moveTo(5.0002f, 19.0001f)
                    lineTo(9.0002f, 19.0001f)
                    lineTo(9.0002f, 15.0001f)
                    lineTo(5.0002f, 15.0001f)
                    lineTo(5.0002f, 19.0001f)
                    close()
                    moveTo(14.0002f, 13.0001f)
                    lineTo(20.0002f, 13.0001f)
                    curveTo(20.5522f, 13.0001f, 21.0002f, 13.4471f, 21.0002f, 14.0001f)
                    lineTo(21.0002f, 20.0001f)
                    curveTo(21.0002f, 20.5521f, 20.5522f, 21.0001f, 20.0002f, 21.0001f)
                    lineTo(14.0002f, 21.0001f)
                    curveTo(13.4482f, 21.0001f, 13.0002f, 20.5521f, 13.0002f, 20.0001f)
                    lineTo(13.0002f, 14.0001f)
                    curveTo(13.0002f, 13.4471f, 13.4482f, 13.0001f, 14.0002f, 13.0001f)
                    close()
                    moveTo(19.0002f, 19.0001f)
                    lineTo(15.0002f, 19.0001f)
                    lineTo(15.0002f, 15.0001f)
                    lineTo(19.0002f, 15.0001f)
                    lineTo(19.0002f, 19.0001f)
                    close()
                }
            }.build().also {
                _apps = it
            }
    }


private var _apps: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun AppsIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Apps.imageVector,
            contentDescription = null,
    )
}
