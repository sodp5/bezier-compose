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

val BezierIcon.Voicemail: ImageVector
    get() {
        return io.channel.bezier.icon._voicemail ?: ImageVector.Builder(
                name = "Voicemail",
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
                moveTo(10.0004f, 15.0f)
                curveTo(10.6281f, 14.1643f, 11.0f, 13.1256f, 11.0f, 12.0f)
                curveTo(11.0f, 9.2386f, 8.7614f, 7.0f, 6.0f, 7.0f)
                curveTo(3.2386f, 7.0f, 1.0f, 9.2386f, 1.0f, 12.0f)
                curveTo(1.0f, 14.7614f, 3.2386f, 17.0f, 6.0f, 17.0f)
                lineTo(18.0f, 17.0f)
                curveTo(20.7614f, 17.0f, 23.0f, 14.7614f, 23.0f, 12.0f)
                curveTo(23.0f, 9.2386f, 20.7614f, 7.0f, 18.0f, 7.0f)
                curveTo(15.2386f, 7.0f, 13.0f, 9.2386f, 13.0f, 12.0f)
                curveTo(13.0f, 13.1256f, 13.3719f, 14.1643f, 13.9996f, 15.0f)
                lineTo(10.0004f, 15.0f)
                close()
                moveTo(6.0f, 15.0f)
                curveTo(7.6568f, 15.0f, 9.0f, 13.6569f, 9.0f, 12.0f)
                curveTo(9.0f, 10.3431f, 7.6568f, 9.0f, 6.0f, 9.0f)
                curveTo(4.3432f, 9.0f, 3.0f, 10.3431f, 3.0f, 12.0f)
                curveTo(3.0f, 13.6569f, 4.3432f, 15.0f, 6.0f, 15.0f)
                close()
                moveTo(18.0f, 15.0f)
                curveTo(19.6569f, 15.0f, 21.0f, 13.6569f, 21.0f, 12.0f)
                curveTo(21.0f, 10.3431f, 19.6569f, 9.0f, 18.0f, 9.0f)
                curveTo(16.3431f, 9.0f, 15.0f, 10.3431f, 15.0f, 12.0f)
                curveTo(15.0f, 13.6569f, 16.3431f, 15.0f, 18.0f, 15.0f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._voicemail = it
        }
    }

private var _voicemail: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun VoicemailIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Voicemail,
            contentDescription = null,
    )
}
