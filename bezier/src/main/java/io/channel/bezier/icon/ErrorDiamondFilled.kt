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

val BezierIcon.ErrorDiamondFilled: ImageVector
    get() {
        return io.channel.bezier.icon._errorDiamondFilled ?: ImageVector.Builder(
                name = "ErrorDiamondFilled",
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
                moveTo(6.3431f, 4.6569f)
                curveTo(8.3232f, 2.6768f, 9.3132f, 1.6867f, 10.4549f, 1.3158f)
                curveTo(11.4591f, 0.9895f, 12.5408f, 0.9895f, 13.5451f, 1.3158f)
                curveTo(14.6867f, 1.6867f, 15.6767f, 2.6768f, 17.6568f, 4.6568f)
                lineTo(19.3431f, 6.3431f)
                curveTo(21.3232f, 8.3232f, 22.3132f, 9.3133f, 22.6842f, 10.4549f)
                curveTo(23.0105f, 11.4591f, 23.0105f, 12.5409f, 22.6842f, 13.5451f)
                curveTo(22.3132f, 14.6867f, 21.3232f, 15.6768f, 19.3431f, 17.6569f)
                lineTo(17.6568f, 19.3431f)
                curveTo(15.6768f, 21.3232f, 14.6867f, 22.3133f, 13.5451f, 22.6842f)
                curveTo(12.5408f, 23.0105f, 11.4591f, 23.0105f, 10.4549f, 22.6842f)
                curveTo(9.3132f, 22.3133f, 8.3232f, 21.3232f, 6.3431f, 19.3431f)
                lineTo(4.6568f, 17.6569f)
                curveTo(2.6767f, 15.6768f, 1.6867f, 14.6867f, 1.3158f, 13.5451f)
                curveTo(0.9895f, 12.5409f, 0.9895f, 11.4591f, 1.3158f, 10.4549f)
                curveTo(1.6867f, 9.3133f, 2.6767f, 8.3232f, 4.6568f, 6.3432f)
                lineTo(6.3431f, 4.6569f)
                close()
                moveTo(12.0005f, 18.8f)
                curveTo(11.2277f, 18.8f, 10.6f, 18.1733f, 10.6f, 17.4005f)
                curveTo(10.6f, 16.6267f, 11.2277f, 16.0f, 12.0005f, 16.0f)
                curveTo(12.7733f, 16.0f, 13.4f, 16.6267f, 13.4f, 17.4005f)
                curveTo(13.4f, 18.1733f, 12.7733f, 18.8f, 12.0005f, 18.8f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(11.1872f, 6.0f, 10.5429f, 6.6858f, 10.5936f, 7.4971f)
                lineTo(10.9376f, 13.0019f)
                curveTo(10.9727f, 13.563f, 11.4379f, 14.0f, 12.0f, 14.0f)
                curveTo(12.5621f, 14.0f, 13.0273f, 13.563f, 13.0624f, 13.0019f)
                lineTo(13.4064f, 7.4971f)
                curveTo(13.4571f, 6.6858f, 12.8128f, 6.0f, 12.0f, 6.0f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._errorDiamondFilled = it
        }
    }

private var _errorDiamondFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ErrorDiamondFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ErrorDiamondFilled,
            contentDescription = null,
    )
}
