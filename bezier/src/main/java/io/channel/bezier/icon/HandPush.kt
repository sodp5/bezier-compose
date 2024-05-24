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

val BezierIcon.HandPush: ImageVector
    get() {
        return io.channel.bezier.icon._handPush ?: ImageVector.Builder(
                name = "HandPush",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(6.4386f, 2.7417f)
                curveTo(8.7596f, 0.4207f, 12.5386f, 0.4187f, 14.8616f, 2.7417f)
                curveTo(16.7366f, 4.6167f, 17.1056f, 7.5007f, 15.8806f, 9.7757f)
                lineTo(13.9806f, 9.0597f)
                curveTo(14.9556f, 7.5177f, 14.7586f, 5.4677f, 13.4476f, 4.1557f)
                curveTo(11.9036f, 2.6117f, 9.3946f, 2.6127f, 7.8526f, 4.1557f)
                curveTo(6.4626f, 5.5457f, 6.3076f, 7.7727f, 7.4916f, 9.3377f)
                curveTo(7.6006f, 9.4827f, 7.7206f, 9.6197f, 7.8516f, 9.7507f)
                lineTo(6.4396f, 11.1667f)
                curveTo(6.2406f, 10.9697f, 6.0596f, 10.7607f, 5.8956f, 10.5437f)
                curveTo(4.1126f, 8.1887f, 4.3456f, 4.8347f, 6.4386f, 2.7417f)
                close()
            }

            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(8.4064f, 7.1147f)
                curveTo(8.4064f, 5.9398f, 9.3169f, 4.9778f, 10.4715f, 4.8963f)
                lineTo(10.6304f, 4.8907f)
                curveTo(11.8585f, 4.8907f, 12.8544f, 5.8867f, 12.8544f, 7.1147f)
                lineTo(12.854f, 10.369f)
                lineTo(18.4969f, 12.4949f)
                curveTo(19.8193f, 12.9898f, 20.716f, 14.2194f, 20.7948f, 15.617f)
                lineTo(20.8004f, 15.8177f)
                lineTo(20.8004f, 16.4157f)
                curveTo(20.8004f, 17.3002f, 20.631f, 18.1785f, 20.3022f, 19.0017f)
                curveTo(19.3617f, 21.3551f, 17.083f, 22.8977f, 14.5484f, 22.8977f)
                lineTo(13.8624f, 22.8977f)
                curveTo(12.2191f, 22.8977f, 10.6421f, 22.2442f, 9.4801f, 21.0822f)
                lineTo(4.6504f, 16.2535f)
                curveTo(3.7827f, 15.3842f, 3.7827f, 13.9783f, 4.6516f, 13.1077f)
                curveTo(5.521f, 12.2401f, 6.9279f, 12.2401f, 7.7978f, 13.1084f)
                lineTo(8.406f, 13.717f)
                lineTo(8.4064f, 7.1147f)
                close()
                moveTo(11.0544f, 7.1147f)
                curveTo(11.0544f, 6.8808f, 10.8644f, 6.6907f, 10.6304f, 6.6907f)
                curveTo(10.3959f, 6.6907f, 10.2064f, 6.8803f, 10.2064f, 7.1147f)
                lineTo(10.2064f, 15.6767f)
                curveTo(10.2064f, 16.5614f, 9.133f, 17.0003f, 8.519f, 16.3751f)
                lineTo(6.5256f, 14.3817f)
                curveTo(6.359f, 14.2154f, 6.0899f, 14.2154f, 5.9244f, 14.3805f)
                curveTo(5.7581f, 14.5472f, 5.7581f, 14.8153f, 5.9237f, 14.9813f)
                lineTo(10.7528f, 19.8093f)
                curveTo(11.5774f, 20.6339f, 12.6966f, 21.0977f, 13.8624f, 21.0977f)
                lineTo(14.5484f, 21.0977f)
                curveTo(16.3469f, 21.0977f, 17.9635f, 20.0034f, 18.6306f, 18.3339f)
                curveTo(18.8747f, 17.7229f, 19.0004f, 17.0711f, 19.0004f, 16.4157f)
                lineTo(19.0004f, 15.8177f)
                curveTo(19.0004f, 15.0887f, 18.548f, 14.4359f, 17.8641f, 14.1799f)
                lineTo(11.0544f, 11.6144f)
                lineTo(11.0544f, 7.1147f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._handPush = it
        }
    }

private var _handPush: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HandPushIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.HandPush,
            contentDescription = null,
    )
}
