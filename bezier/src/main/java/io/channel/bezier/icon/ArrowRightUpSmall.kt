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

val BezierIcon.ArrowRightUpSmall: ImageVector
    get() {
        return io.channel.bezier.icon._arrowRightUpSmall ?: ImageVector.Builder(
                name = "ArrowRightUpSmall",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(7.0502f, 16.9498f)
                curveTo(7.4407f, 17.3403f, 8.0739f, 17.3403f, 8.4644f, 16.9498f)
                lineTo(15.2426f, 10.1716f)
                lineTo(15.2426f, 15.5356f)
                curveTo(15.2426f, 16.0878f, 15.6903f, 16.5356f, 16.2426f, 16.5356f)
                curveTo(16.7949f, 16.5356f, 17.2426f, 16.0878f, 17.2426f, 15.5356f)
                lineTo(17.2426f, 7.7574f)
                curveTo(17.2426f, 7.2051f, 16.7949f, 6.7574f, 16.2426f, 6.7574f)
                lineTo(8.4644f, 6.7574f)
                curveTo(7.9121f, 6.7574f, 7.4644f, 7.2051f, 7.4644f, 7.7574f)
                curveTo(7.4644f, 8.3097f, 7.9121f, 8.7574f, 8.4644f, 8.7574f)
                lineTo(13.8284f, 8.7574f)
                lineTo(7.0502f, 15.5356f)
                curveTo(6.6597f, 15.9261f, 6.6597f, 16.5592f, 7.0502f, 16.9498f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._arrowRightUpSmall = it
        }
    }

private var _arrowRightUpSmall: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowRightUpSmallIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ArrowRightUpSmall,
            contentDescription = null,
    )
}
