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

val BezierIcons.MoreVertical: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _moreVertical ?: ImageVector.Builder(
                    name = "MoreVertical",
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
                    moveTo(9.75f, 4.75f)
                    curveTo(9.75f, 5.9875f, 10.7625f, 7.0f, 12.0f, 7.0f)
                    curveTo(13.2375f, 7.0f, 14.25f, 5.9875f, 14.25f, 4.75f)
                    curveTo(14.25f, 3.5125f, 13.2375f, 2.5f, 12.0f, 2.5f)
                    curveTo(10.7625f, 2.5f, 9.75f, 3.5125f, 9.75f, 4.75f)
                    close()
                    moveTo(12.0f, 14.25f)
                    curveTo(10.7625f, 14.25f, 9.75f, 13.2375f, 9.75f, 12.0f)
                    curveTo(9.75f, 10.7625f, 10.7625f, 9.75f, 12.0f, 9.75f)
                    curveTo(13.2375f, 9.75f, 14.25f, 10.7625f, 14.25f, 12.0f)
                    curveTo(14.25f, 13.2375f, 13.2375f, 14.25f, 12.0f, 14.25f)
                    close()
                    moveTo(12.0f, 21.5f)
                    curveTo(10.7625f, 21.5f, 9.75f, 20.4875f, 9.75f, 19.25f)
                    curveTo(9.75f, 18.0125f, 10.7625f, 17.0f, 12.0f, 17.0f)
                    curveTo(13.2375f, 17.0f, 14.25f, 18.0125f, 14.25f, 19.25f)
                    curveTo(14.25f, 20.4875f, 13.2375f, 21.5f, 12.0f, 21.5f)
                    close()
                }
            }.build().also {
                _moreVertical = it
            }
    }


private var _moreVertical: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun MoreVerticalIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.MoreVertical.imageVector,
            contentDescription = null,
    )
}
