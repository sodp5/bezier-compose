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

val BezierIcons.CloudUpload: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _cloudUpload ?: ImageVector.Builder(
                    name = "CloudUpload",
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
                    moveTo(12.0f, 6.0f)
                    curveTo(9.92646f, 6.0f, 8.22038f, 7.57854f, 8.01979f, 9.5988f)
                    lineTo(7.93032f, 10.5f)
                    lineTo(6.25f, 10.5f)
                    curveTo(4.45507f, 10.5f, 3.0f, 11.9551f, 3.0f, 13.75f)
                    curveTo(3.0f, 15.5449f, 4.45508f, 17.0f, 6.25f, 17.0f)
                    lineTo(8.0f, 17.0f)
                    curveTo(8.55228f, 17.0f, 9.0f, 17.4477f, 9.0f, 18.0f)
                    curveTo(9.0f, 18.5523f, 8.55228f, 19.0f, 8.0f, 19.0f)
                    lineTo(6.25f, 19.0f)
                    curveTo(3.35051f, 19.0f, 1.0f, 16.6495f, 1.0f, 13.75f)
                    curveTo(1.0f, 10.8708f, 3.31768f, 8.53296f, 6.18914f, 8.50035f)
                    curveTo(6.85537f, 5.91199f, 9.2039f, 4.0f, 12.0f, 4.0f)
                    curveTo(14.2235f, 4.0f, 16.1628f, 5.20939f, 17.1989f, 7.00324f)
                    curveTo(20.4206f, 7.10818f, 23.0f, 9.75286f, 23.0f, 13.0f)
                    curveTo(23.0f, 16.3137f, 20.3137f, 19.0f, 17.0f, 19.0f)
                    lineTo(16.0f, 19.0f)
                    curveTo(15.4477f, 19.0f, 15.0f, 18.5523f, 15.0f, 18.0f)
                    curveTo(15.0f, 17.4477f, 15.4477f, 17.0f, 16.0f, 17.0f)
                    lineTo(17.0f, 17.0f)
                    curveTo(19.2091f, 17.0f, 21.0f, 15.2091f, 21.0f, 13.0f)
                    curveTo(21.0f, 10.7909f, 19.2091f, 9.0f, 17.0f, 9.0f)
                    lineTo(15.9296f, 9.0f)
                    lineTo(15.6676f, 8.40037f)
                    curveTo(15.0494f, 6.98556f, 13.6387f, 6.0f, 12.0f, 6.0f)
                    close()
                    moveTo(11.2929f, 10.2929f)
                    curveTo(11.6834f, 9.90237f, 12.3166f, 9.90237f, 12.7071f, 10.2929f)
                    lineTo(15.6343f, 13.2201f)
                    curveTo(16.1383f, 13.7241f, 15.7813f, 14.5858f, 15.0686f, 14.5858f)
                    lineTo(13.0f, 14.5858f)
                    lineTo(13.0f, 18.0f)
                    curveTo(13.0f, 18.5523f, 12.5523f, 19.0f, 12.0f, 19.0f)
                    curveTo(11.4477f, 19.0f, 11.0f, 18.5523f, 11.0f, 18.0f)
                    lineTo(11.0f, 14.5858f)
                    lineTo(8.93136f, 14.5858f)
                    curveTo(8.21864f, 14.5858f, 7.86171f, 13.7241f, 8.36568f, 13.2201f)
                    lineTo(11.2929f, 10.2929f)
                    close()
                }
            }.build().also {
                _cloudUpload = it
            }
    }


private var _cloudUpload: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CloudUploadIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CloudUpload.imageVector,
            contentDescription = null,
    )
}
