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

val BezierIcon.ChatErrorFilled: ImageVector
    get() {
        return io.channel.bezier.icon._chatErrorFilled ?: ImageVector.Builder(
                name = "ChatErrorFilled",
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
                moveTo(20.7233f, 18.19f)
                curveTo(20.5573f, 17.694f, 20.5763f, 17.144f, 20.8223f, 16.683f)
                curveTo(21.8613f, 14.734f, 22.2813f, 12.409f, 21.7873f, 9.954f)
                curveTo(20.9823f, 5.954f, 17.6933f, 2.789f, 13.6643f, 2.137f)
                curveTo(6.8373f, 1.033f, 1.0233f, 6.848f, 2.1293f, 13.675f)
                curveTo(2.7823f, 17.703f, 5.9463f, 20.991f, 9.9473f, 21.796f)
                curveTo(12.4033f, 22.29f, 14.7293f, 21.868f, 16.6783f, 20.829f)
                curveTo(17.1373f, 20.584f, 17.6813f, 20.565f, 18.1743f, 20.729f)
                lineTo(18.7279f, 20.9135f)
                curveTo(19.1583f, 21.0569f, 19.6395f, 21.2172f, 20.0973f, 21.37f)
                curveTo(20.8793f, 21.63f, 21.6223f, 20.886f, 21.3613f, 20.105f)
                lineTo(20.7233f, 18.19f)
                close()
                moveTo(11.9333f, 15.5953f)
                curveTo(11.2033f, 15.5953f, 10.6113f, 16.1873f, 10.6113f, 16.9183f)
                curveTo(10.6113f, 17.6483f, 11.2033f, 18.2403f, 11.9333f, 18.2403f)
                curveTo(12.6633f, 18.2403f, 13.2563f, 17.6483f, 13.2563f, 16.9183f)
                curveTo(13.2563f, 16.1873f, 12.6633f, 15.5953f, 11.9333f, 15.5953f)
                close()
                moveTo(13.1473f, 5.9799f)
                lineTo(13.0143f, 13.9869f)
                lineTo(10.8523f, 13.9869f)
                lineTo(10.7203f, 5.9799f)
                lineTo(13.1473f, 5.9799f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._chatErrorFilled = it
        }
    }

private var _chatErrorFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChatErrorFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ChatErrorFilled,
            contentDescription = null,
    )
}
