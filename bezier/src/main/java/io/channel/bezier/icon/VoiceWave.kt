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

val BezierIcon.VoiceWave: ImageVector
    get() {
        return _voiceWave ?: ImageVector.Builder(
                name = "VoiceWave",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(13.0f, 7.5f)
                curveTo(13.0f, 6.6716f, 13.6716f, 6.0f, 14.5f, 6.0f)
                curveTo(15.3284f, 6.0f, 16.0f, 6.6716f, 16.0f, 7.5f)
                lineTo(16.0f, 16.5f)
                curveTo(16.0f, 17.3284f, 15.3284f, 18.0f, 14.5f, 18.0f)
                curveTo(13.6716f, 18.0f, 13.0f, 17.3284f, 13.0f, 16.5f)
                lineTo(13.0f, 7.5f)
                close()
                moveTo(8.0f, 4.5f)
                curveTo(8.0f, 3.6716f, 8.6716f, 3.0f, 9.5f, 3.0f)
                curveTo(10.3284f, 3.0f, 11.0f, 3.6716f, 11.0f, 4.5f)
                lineTo(11.0f, 19.5f)
                curveTo(11.0f, 20.3284f, 10.3284f, 21.0f, 9.5f, 21.0f)
                curveTo(8.6716f, 21.0f, 8.0f, 20.3284f, 8.0f, 19.5f)
                lineTo(8.0f, 4.5f)
                close()
                moveTo(3.0f, 9.5f)
                curveTo(3.0f, 8.6716f, 3.6716f, 8.0f, 4.5f, 8.0f)
                curveTo(5.3284f, 8.0f, 6.0f, 8.6716f, 6.0f, 9.5f)
                lineTo(6.0f, 14.5f)
                curveTo(6.0f, 15.3284f, 5.3284f, 16.0f, 4.5f, 16.0f)
                curveTo(3.6716f, 16.0f, 3.0f, 15.3284f, 3.0f, 14.5f)
                lineTo(3.0f, 9.5f)
                close()
                moveTo(18.0f, 10.5f)
                curveTo(18.0f, 9.6716f, 18.6716f, 9.0f, 19.5f, 9.0f)
                curveTo(20.3284f, 9.0f, 21.0f, 9.6716f, 21.0f, 10.5f)
                lineTo(21.0f, 13.5f)
                curveTo(21.0f, 14.3284f, 20.3284f, 15.0f, 19.5f, 15.0f)
                curveTo(18.6716f, 15.0f, 18.0f, 14.3284f, 18.0f, 13.5f)
                lineTo(18.0f, 10.5f)
                close()
            }
        }.build().also {
            _voiceWave = it
        }
    }

private var _voiceWave: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun VoiceWaveIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.VoiceWave,
            contentDescription = null,
    )
}
