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

val BezierIcon.Asterisk: ImageVector
    get() {
        return io.channel.bezier.icon._asterisk ?: ImageVector.Builder(
                name = "Asterisk",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(12.0f, 2.5f)
                curveTo(12.5523f, 2.5f, 13.0f, 2.9477f, 13.0f, 3.5f)
                lineTo(13.0f, 10.268f)
                lineTo(18.8612f, 6.884f)
                curveTo(19.3395f, 6.6078f, 19.9511f, 6.7717f, 20.2272f, 7.25f)
                curveTo(20.5034f, 7.7283f, 20.3395f, 8.3399f, 19.8612f, 8.616f)
                lineTo(14.0f, 12.0f)
                lineTo(19.8612f, 15.384f)
                curveTo(20.3395f, 15.6601f, 20.5034f, 16.2717f, 20.2272f, 16.75f)
                curveTo(19.9511f, 17.2283f, 19.3395f, 17.3922f, 18.8612f, 17.116f)
                lineTo(13.0f, 13.7321f)
                lineTo(13.0f, 20.5f)
                curveTo(13.0f, 21.0523f, 12.5523f, 21.5f, 12.0f, 21.5f)
                curveTo(11.4477f, 21.5f, 11.0f, 21.0523f, 11.0f, 20.5f)
                lineTo(11.0f, 13.7321f)
                lineTo(5.1388f, 17.116f)
                curveTo(4.6605f, 17.3922f, 4.0489f, 17.2283f, 3.7728f, 16.75f)
                curveTo(3.4966f, 16.2717f, 3.6605f, 15.6601f, 4.1388f, 15.384f)
                lineTo(10.0f, 12.0f)
                lineTo(4.1388f, 8.616f)
                curveTo(3.6605f, 8.3399f, 3.4966f, 7.7283f, 3.7727f, 7.25f)
                curveTo(4.0489f, 6.7717f, 4.6605f, 6.6078f, 5.1388f, 6.884f)
                lineTo(11.0f, 10.2679f)
                lineTo(11.0f, 3.5f)
                curveTo(11.0f, 2.9477f, 11.4477f, 2.5f, 12.0f, 2.5f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._asterisk = it
        }
    }

private var _asterisk: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun AsteriskIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Asterisk,
            contentDescription = null,
    )
}
