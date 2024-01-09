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

val BezierIcon.Link: ImageVector
    get() {
        return _link ?: ImageVector.Builder(
                name = "Link",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(9.8787f, 14.1213f)
                curveTo(12.2218f, 16.4644f, 16.0208f, 16.4644f, 18.3639f, 14.1213f)
                lineTo(19.7782f, 12.7071f)
                curveTo(22.1213f, 10.3639f, 22.1213f, 6.5649f, 19.7782f, 4.2218f)
                curveTo(17.435f, 1.8786f, 13.636f, 1.8786f, 11.2929f, 4.2218f)
                lineTo(10.4289f, 5.0858f)
                curveTo(10.0383f, 5.4763f, 10.0383f, 6.1095f, 10.4289f, 6.5f)
                curveTo(10.8194f, 6.8905f, 11.4526f, 6.8905f, 11.8431f, 6.5f)
                lineTo(12.7071f, 5.636f)
                curveTo(14.2692f, 4.0739f, 16.8019f, 4.0739f, 18.3639f, 5.636f)
                curveTo(19.926f, 7.1981f, 19.926f, 9.7308f, 18.3639f, 11.2928f)
                lineTo(16.9497f, 12.7071f)
                curveTo(15.3876f, 14.2692f, 12.855f, 14.2692f, 11.2929f, 12.7071f)
                curveTo(10.9024f, 12.3165f, 10.2692f, 12.3165f, 9.8787f, 12.7071f)
                curveTo(9.4881f, 13.0976f, 9.4881f, 13.7307f, 9.8787f, 14.1213f)
                close()
                moveTo(14.1213f, 9.8786f)
                curveTo(11.7782f, 7.5355f, 7.9792f, 7.5355f, 5.636f, 9.8786f)
                lineTo(4.2218f, 11.2929f)
                curveTo(1.8787f, 13.636f, 1.8787f, 17.435f, 4.2218f, 19.7781f)
                curveTo(6.5649f, 22.1213f, 10.3639f, 22.1213f, 12.7071f, 19.7781f)
                lineTo(13.571f, 18.9142f)
                curveTo(13.9615f, 18.5237f, 13.9615f, 17.8905f, 13.571f, 17.5f)
                curveTo(13.1805f, 17.1095f, 12.5473f, 17.1095f, 12.1568f, 17.5f)
                lineTo(11.2929f, 18.3639f)
                curveTo(9.7308f, 19.926f, 7.1981f, 19.926f, 5.636f, 18.3639f)
                curveTo(4.0739f, 16.8018f, 4.0739f, 14.2692f, 5.636f, 12.7071f)
                lineTo(7.0502f, 11.2929f)
                curveTo(8.6123f, 9.7308f, 11.145f, 9.7308f, 12.7071f, 11.2929f)
                curveTo(13.0976f, 11.6834f, 13.7308f, 11.6834f, 14.1213f, 11.2929f)
                curveTo(14.5118f, 10.9023f, 14.5118f, 10.2692f, 14.1213f, 9.8786f)
                close()
            }
        }.build().also {
            _link = it
        }
    }

private var _link: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun LinkIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Link,
            contentDescription = null,
    )
}